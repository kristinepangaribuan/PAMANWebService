package com.kerjapraktek.paman.controller;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.kerjapraktek.paman.entity.BTKI2017;
import com.kerjapraktek.paman.repository.BTKI2017_Repository;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.springframework.beans.factory.annotation.Autowired;
public class BTKI2017_InsertData {
    @Autowired
    private BTKI2017_Repository btki2017_repository;

    private List<BTKI2017> allListBTKI2017;
    public BTKI2017_InsertData() {
        allListBTKI2017 = new ArrayList<BTKI2017>();
    }

    public void readExcel(String filePath, String fileName, String sheetName) throws IOException{
        File file =    new File(filePath+"\\"+fileName);

        //Create an object of FileInputStream class to read excel file

        FileInputStream inputStream = new FileInputStream(file);

        Workbook data = null;
        data = new HSSFWorkbook(inputStream);

        Sheet sheetData = data.getSheet(sheetName);

        //Find number of rows in excel file

        int rowCount = sheetData.getLastRowNum()-sheetData.getFirstRowNum();

        //Create a loop over all the rows of excel file to read it

        for (int i = 3; i < 4; i++) {

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
            //btki2017_repository.save(add);
            //allListBTKI2017.add(add);
//            for (int j = 0; j < row.getLastCellNum(); j++) {
//
//                //Print Excel data in console
//
//                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
//
//            }
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
