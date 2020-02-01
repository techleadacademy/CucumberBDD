package util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("/Users/techleadacademy/Desktop/StudentList.xls");
        Workbook workbook= new HSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Cars");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(1);

        int rowCount = sheet.getPhysicalNumberOfRows();

        for(int i = 1; i<rowCount; i++) {
            String model = sheet.getRow(i).getCell(0).toString();
            String color = sheet.getRow(i).getCell(2).toString();
            String year = sheet.getRow(i).getCell(1).toString();
            double numYear = Double.parseDouble(year);

            if (numYear>2018 && color.equalsIgnoreCase("black"))
                System.out.println(model + " | " + year.substring(0,year.length()-2) + " | " + color);
        }

    }




}
