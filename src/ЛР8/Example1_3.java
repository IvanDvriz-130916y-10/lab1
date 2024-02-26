package ��8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example1_3 {
    public static void readAllByArray (InputStream in) throws IOException {
        byte [] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {   // ���� �� ����� �����
                System.out.println("���������� = " + count +" buff = " + Arrays.toString(buff) +
                        " str = " + new String(buff,0,count ));  // "UTF8"
        } else {
            break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        String fileName = "C:\\MyFile1.txt";
        InputStream inFile = null;    //  ���������� ����������� �� ������ try� ����� �� ������������ ������� ���������
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println(" ������ ��������-�������� ����� " + fileName+e );
        } finally {
            if(inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    // ������ �� ������
                }
            }
        }
    }
}
