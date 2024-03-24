package ��10.Example1.Excel;

//  ��� ��������� ���� Excel

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class Example8 {
    public static void main(String[] args) throws IOException {

        // ��������� ���� Excel ��� ������
        String filePath = "src/��10/Example1/Excel/example8.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        // ������� ��������� ����� Excel �� �����
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // �������� ���� �� ����� �� ��� �����
        XSSFSheet sheet = workbook.getSheet("������");

        if (sheet == null) {
            System.out.println("���� �� ������ � ����� Excel.");
        } else {
            // ���������� ������ � ������ �����
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // ������� �������� ������ �� �����
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        }
        workbook.close();
        inputStream.close();
    }
}
