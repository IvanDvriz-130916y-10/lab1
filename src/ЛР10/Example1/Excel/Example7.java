package ��10.Example1.Excel;

// ��� ������� ���� � Excel

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Example7 {
    public static void main(String[] args) throws IOException {

        // ������� ����� ����� Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // ������� ����� ���� � �����
        XSSFSheet sheet = workbook.createSheet("������");

        // ���������� ������ � ������
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("������");
        headerRow.createCell(1).setCellValue("��������������");
        headerRow.createCell(2).setCellValue("���������");

        Row headerRow1 = sheet.createRow(1);
        headerRow1.createCell(0).setCellValue("�����");
        headerRow1.createCell(1).setCellValue("����: ����������, �����: ������ �.�.");
        headerRow1.createCell(2).setCellValue(500);

        Row headerRow2 = sheet.createRow(2);
        headerRow2.createCell(0).setCellValue("���������");
        headerRow2.createCell(1).setCellValue("���������: Intel Core i5, ����������� ������: ");
        headerRow2.createCell(2).setCellValue(25000.0);

        // ���������� ����� Excel � ����
        String filePath = "src/��10/��13.Example1/Excel/example8.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("������ �������� � ����: " + filePath);
    }
}
