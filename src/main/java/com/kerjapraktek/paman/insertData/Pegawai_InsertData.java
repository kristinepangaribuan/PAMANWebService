package com.kerjapraktek.paman.insertData;

import com.kerjapraktek.paman.entity.Pegawai;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Pegawai_InsertData {
    static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/pegawai/add";
    public Pegawai_InsertData() {

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

            Pegawai add = new Pegawai();
            add.setNip(row.getCell(0).getStringCellValue());
            add.setNAMA(row.getCell(1).getStringCellValue());
            add.setUNIT_ESELON_I(row.getCell(2).getStringCellValue());
            add.setUNIT_ESELON_II(row.getCell(3).getStringCellValue());
            add.setJabatan(row.getCell(4).getStringCellValue());
            System.out.println(add.getNip().toString());
            HttpEntity<Pegawai> requestBody = new HttpEntity<>(add, headers);

            // Send request with POST method.
            Pegawai pegawai = restTemplate.postForObject(URL_CREATE_EMPLOYEE, requestBody, Pegawai.class);
        }
    }

    public static void main(String...strings) throws IOException{

        //Create an object of ReadGuru99ExcelFile class

        Pegawai_InsertData objExcelFile = new Pegawai_InsertData();

        //Prepare the path of excel file

        String filePath = "C:\\Users\\Kristine Pangaribuan\\Documents\\New Data";

        //Call read file method of the class to read data

        objExcelFile.readExcel(filePath,"pegawai.xls","dbo_t_pegawai");

    }
}
