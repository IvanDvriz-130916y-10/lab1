package ��8;

import java.io.*;

public class Example1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            // �������� �������� ���������� �������� ��� ������ � ������
            br = new BufferedReader(new FileReader("C:\\MyFile1.txt"), 1024);       // 1024 ������ ������
            out = new BufferedWriter(new FileWriter("C:\\MyFile2.txt"));
            int lineCode = 0; // ������� �����
            String s;
            // ������������� ���������� �� ������ ����� � ������
            while ((s = br.readLine()) != null) {
                lineCode++;
                System.out.println(lineCode + " : " + s);
                out.write(s);
                out.newLine();      // ������� �� ����� ������
            }
        } catch (IOException e) {
            System.out.println(" ������ !!!!!!!! ");
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
