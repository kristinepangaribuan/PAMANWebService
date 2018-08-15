package com.kerjapraktek.paman.insertData;

import com.kerjapraktek.paman.entity.IMPOR2017;
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

public class IMPOR2017_InsertData {
    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/IMPOR2017/add";
    public IMPOR2017_InsertData() {

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

            IMPOR2017 add = new IMPOR2017();
            add.setTAHUN(row.getCell(0).getStringCellValue());
            add.setJENIS(row.getCell(1).getStringCellValue());
            add.setHSXCODE(row.getCell(2).getStringCellValue());
            add.setNETWTHS(Double.parseDouble(NumberToTextConverter.toText(row.getCell(3).getNumericCellValue())));
            add.setCIFHSUSD(Double.parseDouble(NumberToTextConverter.toText(row.getCell(4).getNumericCellValue())));
            add.setOLDCTRYCOD(row.getCell(5).getStringCellValue());
            add.setPODALTCODE(row.getCell(6).getStringCellValue());
            System.out.println(i);
            HttpEntity<IMPOR2017> requestBody = new HttpEntity<>(add, headers);

            // Send request with POST method.
            IMPOR2017 impor2017 = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, IMPOR2017.class);
        }
    }

    public static void main(String...strings) throws IOException{

        //Create an object of ReadGuru99ExcelFile class

        IMPOR2017_InsertData objExcelFile = new IMPOR2017_InsertData();

        //Prepare the path of excel file

        String filePath = "C:\\Users\\Kristine Pangaribuan\\Documents\\New Data";

        //Call read file method of the class to read data

        objExcelFile.readExcel(filePath,"dbo_IMPOR2017.xls","dbo_IMPOR2017");

    }
}
