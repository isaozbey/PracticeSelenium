package com.Ozbey.day3;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelReaderExample {

    @Test
    public void test1() throws IOException{


        FileInputStream file;
        Workbook workbook;


           file =new FileInputStream("/Users/isaozbey/Desktop/soccer.xlsx");
            workbook= WorkbookFactory.create(file);
            file.close();
            Sheet sheet=workbook.getSheet("sheet1");
            Row row=sheet.getRow(2);
            Cell cell=row.getCell(1);
        System.out.println("cell = " + cell);

        FileOutputStream outFile=new FileOutputStream("/Users/isaozbey/Desktop/soccer.xlsx");

        cell.setCellValue("Gazoz");

        workbook.write(outFile);

        outFile.close();

        System.out.println("cell = " + cell);




    }

}
