package com.kerjapraktek.paman.insertData;

import com.kerjapraktek.paman.entity.IMPHS10;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IMPHS10_InsertData {
    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/IMPHS10/add";
    public IMPHS10_InsertData() {

    }

    public void readExcel(String filePath, String fileName, String sheetName) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        RestTemplate restTemplate = new RestTemplate();
        File file =    new File(filePath+"\\"+fileName);
        FileInputStream inputStream = new FileInputStream(file);

        Workbook data = null;
        data = new HSSFWorkbook(inputStream);

        Sheet sheetData = data.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = sheetData.getLastRowNum()-sheetData.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 1; i < rowCount+1; i++) {

            Row row = sheetData.getRow(i);

            //Create a loop to print cell values in a row

            IMPHS10 add = new IMPHS10();
            add.setTAHUN(row.getCell(0).getStringCellValue());
            add.setPODALTCODE(row.getCell(1).getStringCellValue());
            add.setHSXCODE(row.getCell(2).getStringCellValue());
            add.setSITCCODE(row.getCell(3).getStringCellValue());
            add.setCTRYORIG(row.getCell(4).getStringCellValue());
            add.setNETWTHS(Double.parseDouble(NumberToTextConverter.toText(row.getCell(5).getNumericCellValue())));
            add.setCIFHSUSD(Double.parseDouble(NumberToTextConverter.toText(row.getCell(6).getNumericCellValue())));
            add.setOLDCTRYCOD(row.getCell(7).getStringCellValue());
            System.out.println(i);
            HttpEntity<IMPHS10> requestBody = new HttpEntity<>(add, headers);

            // Send request with POST method.
            IMPHS10 imphs10 = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, IMPHS10.class);
        }
    }

    public static void main(String...strings) throws IOException{

        //Create an object of ReadGuru99ExcelFile class

        IMPHS10_InsertData objExcelFile = new IMPHS10_InsertData();

        //Prepare the path of excel file

        String filePath = "C:\\Users\\Kristine Pangaribuan\\Documents\\New Data";

        //Call read file method of the class to read data

        objExcelFile.readExcel(filePath,"dbo_IMPHS10.xls","dbo_IMPHS10");

    }
}
