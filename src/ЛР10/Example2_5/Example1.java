package ��10.Example2_5;


import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("src/��10/Example1/Excel/example8.xlsx"));

            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.err.println("���� �� ������");
        } catch (IOException e) {
            System.err.println("������ �����/������");
        } catch (Exception e) {
            System.err.println("��������� ������: " + e.getMessage());
            e.printStackTrace();
        }
    }
}