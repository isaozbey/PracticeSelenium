package com.Ozbey.day1;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelReaderExample {

    @Test
    public void test1() throws IOException {
       String path="/Users/isaozbey/Desktop/soccer.xlsx";

        Workbook workbook=WorkbookFactory.create(new FileInputStream(path));
        Sheet sheet=workbook.getSheet("sheet1");
        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);



        System.out.println("cell = " + cell);

    }


    @Test
    public void test2() throws IOException{
        String path="/Users/isaozbey/Desktop/soccer.xlsx";

        Workbook workbook=WorkbookFactory.create(new FileInputStream(path));
        FileOutputStream outputStream=new FileOutputStream("/Users/isaozbey/Desktop/soccer.xlsx");

        Sheet sheet=workbook.getSheet("sheet1");

        Row row=sheet.getRow(1);

        Cell cell=row.getCell(0);
        cell.setCellValue("Okkes");
        workbook.write(outputStream);
        outputStream.close();

    }
}
