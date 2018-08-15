package com.kerjapraktek.paman.insertData;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import com.kerjapraktek.paman.entity.BTKI2017;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

public class BTKI2017_InsertData {

    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/BTKI2017/add";
    public BTKI2017_InsertData() {

    }

    public void readExcel(String filePath, String fileName, String sheetName) throws IOException{
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

            BTKI2017 add = new BTKI2017();
            add.setBTKI_2017(row.getCell(0).getStringCellValue());
            add.setDESKR_HS(row.getCell(1).getStringCellValue());
            add.setBEC(row.getCell(2).getStringCellValue());
            add.setSITCREV4(row.getCell(3).getStringCellValue());
            add.setISICREV4(row.getCell(4).getStringCellValue());
            add.setOILGRPCODE(row.getCell(5).getStringCellValue());
            add.setOILGRDESC(row.getCell(6).getStringCellValue());
            add.setSECCODE(row.getCell(7).getStringCellValue());
            add.setSECDESC(row.getCell(8).getStringCellValue());
            add.setSECTORCODE(row.getCell(9).getStringCellValue());
            add.setSECTORDESC(row.getCell(10).getStringCellValue());
            add.setBRSCODE(row.getCell(11).getStringCellValue());
            add.setBRSDESC(row.getCell(12).getStringCellValue());
            add.setCOMMGRPCOD(row.getCell(13).getStringCellValue());
            add.setCOMGRPDESC(row.getCell(14).getStringCellValue());
            add.setCOMMCODE(row.getCell(15).getStringCellValue());
            add.setCOMMDESC(row.getCell(16).getStringCellValue());
            add.setKBLI2015(row.getCell(17).getStringCellValue());
            add.setDESKKBLI20(row.getCell(18).getStringCellValue());
            System.out.println(add.getBRSCODE().toString());
            HttpEntity<BTKI2017> requestBody = new HttpEntity<>(add, headers);

            // Send request with POST method.
            BTKI2017 btki2017 = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, BTKI2017.class);
        }
    }

    public static void main(String...strings) throws IOException{

        //Create an object of ReadGuru99ExcelFile class

        BTKI2017_InsertData objExcelFile = new BTKI2017_InsertData();

        //Prepare the path of excel file

        String filePath = "C:\\Users\\Kristine Pangaribuan\\Documents\\New Data";

        //Call read file method of the class to read data

        objExcelFile.readExcel(filePath,"dbo_BTKI2017.xls","dbo_BTKI2017");

    }

}
