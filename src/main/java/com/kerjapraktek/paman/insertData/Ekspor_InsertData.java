package com.kerjapraktek.paman.insertData;

import com.kerjapraktek.paman.entity.Ekspor;
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

public class Ekspor_InsertData {
    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/ekspor/add";
    public Ekspor_InsertData() {

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

            Ekspor add = new Ekspor();
            add.setKD_PROP(row.getCell(0).getStringCellValue());
            add.setPEL(row.getCell(1).getStringCellValue());
            add.setPODALTCODE(row.getCell(2).getStringCellValue());
            add.setHS(row.getCell(3).getStringCellValue());
            add.setNEG(row.getCell(4).getStringCellValue());
            add.setN_04(row.getCell(5).getNumericCellValue());
            add.setN_05(row.getCell(6).getNumericCellValue());
            add.setN_06(row.getCell(7).getNumericCellValue());
            add.setN_07(row.getCell(8).getNumericCellValue());
            add.setN_08(row.getCell(9).getNumericCellValue());
            add.setN_09(row.getCell(10).getNumericCellValue());
            add.setN_10(row.getCell(11).getNumericCellValue());
            add.setN_11(row.getCell(12).getNumericCellValue());
            add.setN_12(row.getCell(13).getNumericCellValue());
            add.setN_13(row.getCell(14).getNumericCellValue());
            add.setN_14(row.getCell(15).getNumericCellValue());
            add.setN_15(row.getCell(16).getNumericCellValue());
            add.setN_16(row.getCell(17).getNumericCellValue());
            add.setN_17(row.getCell(18).getNumericCellValue());
            add.setNP_LALU(row.getCell(19).getNumericCellValue());
            add.setNP_SEKA(row.getCell(20).getNumericCellValue());
            add.setV_04(row.getCell(21).getNumericCellValue());
            add.setV_05(row.getCell(22).getNumericCellValue());
            add.setV_06(row.getCell(23).getNumericCellValue());
            add.setV_07(row.getCell(24).getNumericCellValue());
            add.setV_08(row.getCell(25).getNumericCellValue());
            add.setV_09(row.getCell(26).getNumericCellValue());
            add.setV_10(row.getCell(27).getNumericCellValue());
            add.setV_11(row.getCell(28).getNumericCellValue());
            add.setV_12(row.getCell(29).getNumericCellValue());
            add.setV_13(row.getCell(30).getNumericCellValue());
            add.setV_14(row.getCell(31).getNumericCellValue());
            add.setV_15(row.getCell(32).getNumericCellValue());
            add.setV_16(row.getCell(33).getNumericCellValue());
            add.setV_17(row.getCell(34).getNumericCellValue());
            add.setVP_LALU(row.getCell(35).getNumericCellValue());
            add.setVP_SEKA(Double.parseDouble(NumberToTextConverter.toText(row.getCell(36).getNumericCellValue())));
            add.setPERIOD(row.getCell(37).getStringCellValue());

            HttpEntity<Ekspor> requestBody = new HttpEntity<>(add, headers);

            // Send request with POST method.
            Ekspor ekspor = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, Ekspor.class);
        }
    }

    public static void main(String...strings) throws IOException{

        //Create an object of ReadGuru99ExcelFile class

        Ekspor_InsertData objExcelFile = new Ekspor_InsertData();

        //Prepare the path of excel file

        String filePath = "C:\\Users\\Kristine Pangaribuan\\Documents\\New Data";

        //Call read file method of the class to read data

        objExcelFile.readExcel(filePath,"dbo_db_ekspor.xls","dbo_db_ekspor");

    }
}
