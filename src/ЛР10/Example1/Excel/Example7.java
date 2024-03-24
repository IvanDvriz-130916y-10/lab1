package ЛР10.Example1.Excel;

// Как создать файл в Excel

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Example7 {
    public static void main(String[] args) throws IOException {

        // Создаем новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");

        // Записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товары");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row headerRow1 = sheet.createRow(1);
        headerRow1.createCell(0).setCellValue("Книга");
        headerRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        headerRow1.createCell(2).setCellValue(500);

        Row headerRow2 = sheet.createRow(2);
        headerRow2.createCell(0).setCellValue("Компьютер");
        headerRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: ");
        headerRow2.createCell(2).setCellValue(25000.0);

        // Записываем кнегу Excel в файл
        String filePath = "src/ЛР10/ЛР13.Example1/Excel/example8.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + filePath);
    }
}
