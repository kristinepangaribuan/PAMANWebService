package com.kerjapraktek.paman.insertData;

import com.kerjapraktek.paman.entity.IMP2012_2013;
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

public class IMP2012_2013_InsertData {
    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/IMP2012_2013/add";
    public IMP2012_2013_InsertData() {

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

            IMP2012_2013 add = new IMP2012_2013();
            add.setTAHUN(row.getCell(0).getStringCellValue());
            add.setGAB(row.getCell(1).getStringCellValue());
            add.setPODALTCODE(row.getCell(2).getStringCellValue());
            add.setHSXCODE(row.getCell(3).getStringCellValue());
            add.setSITCCODE(row.getCell(4).getStringCellValue());
            add.setQTY(Double.parseDouble(NumberToTextConverter.toText(row.getCell(5).getNumericCellValue())));
            add.setGROSSWTHS(Double.parseDouble(NumberToTextConverter.toText(row.getCell(6).getNumericCellValue())));
            add.setNETWTHS(Double.parseDouble(NumberToTextConverter.toText(row.getCell(7).getNumericCellValue())));
            add.setCIFHSUSD(Double.parseDouble(NumberToTextConverter.toText(row.getCell(8).getNumericCellValue())));
            add.setOLDCTRYCOD(row.getCell(9).getStringCellValue());
            add.setCTRYORIG(row.getCell(10).getStringCellValue());
            System.out.println(i);
            HttpEntity<IMP2012_2013> requestBody = new HttpEntity<>(add, headers);

            // Send request with POST method.
            IMP2012_2013 imp2012_2013 = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, IMP2012_2013.class);
        }
    }

    public static void main(String...strings) throws IOException{

        //Create an object of ReadGuru99ExcelFile class

        IMP2012_2013_InsertData objExcelFile = new IMP2012_2013_InsertData();

        //Prepare the path of excel file

        String filePath = "C:\\Users\\Kristine Pangaribuan\\Documents\\New Data";

        //Call read file method of the class to read data

        objExcelFile.readExcel(filePath,"dbo_IMP2012-2013.xls","dbo_IMP2012-2013");

    }
}
