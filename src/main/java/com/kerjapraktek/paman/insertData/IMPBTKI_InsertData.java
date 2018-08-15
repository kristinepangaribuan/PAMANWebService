package com.kerjapraktek.paman.insertData;

import com.kerjapraktek.paman.entity.IMPBTKI;
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

public class IMPBTKI_InsertData {
    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/IMPBTKI/add";
    public IMPBTKI_InsertData() {

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

            //Create a loop to print cell values i  n a row

            IMPBTKI add = new IMPBTKI();
            add.setPODALTCODE(row.getCell(0).getStringCellValue());
            add.setOLDCTRYCOD(row.getCell(1).getStringCellValue());
            add.setHSXCODE(row.getCell(2).getStringCellValue());
            add.setN12(Double.parseDouble(row.getCell(3).getStringCellValue()));
            add.setN13(Double.parseDouble(row.getCell(4).getStringCellValue()));
            add.setN14(row.getCell(5).getNumericCellValue());
            add.setN15(row.getCell(6).getNumericCellValue());
            add.setN16(row.getCell(7).getNumericCellValue());
            add.setN17(row.getCell(8).getNumericCellValue());
            add.setNLALU(row.getCell(9).getNumericCellValue());
            add.setNSEKA(row.getCell(10).getNumericCellValue());
            add.setV12(row.getCell(11).getNumericCellValue());
            add.setV13(row.getCell(12).getNumericCellValue());
            add.setV14(row.getCell(13).getNumericCellValue());
            add.setV15(row.getCell(14).getNumericCellValue());
            add.setV16(row.getCell(15).getNumericCellValue());
            add.setV17(row.getCell(16).getNumericCellValue());
            add.setVLALU(row.getCell(17).getNumericCellValue());
            add.setVSEKA(row.getCell(18).getNumericCellValue());
            add.setPERIOD(NumberToTextConverter.toText(row.getCell(19).getNumericCellValue()));
            System.out.println(i);
            HttpEntity<IMPBTKI> requestBody = new HttpEntity<>(add, headers);

            // Send request with POST method.
            IMPBTKI impbtki = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, IMPBTKI.class);
        }
    }

    public static void main(String...strings) throws IOException{

        //Create an object of ReadGuru99ExcelFile class

        IMPBTKI_InsertData objExcelFile = new IMPBTKI_InsertData();

        //Prepare the path of excel file

        String filePath = "C:\\Users\\Kristine Pangaribuan\\Documents\\New Data";

        //Call read file method of the class to read data

        objExcelFile.readExcel(filePath,"dbo_IMPBTKI.xls","dbo_IMPBTKI");

    }
}
