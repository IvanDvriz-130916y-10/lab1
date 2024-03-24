package ��10.Example2_4;

//�������� ��������� ������ ��� ��������� HTML-���� ��������, ��������
//        ����� ��������� �� ������ � ������� ��������������� � �����.

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Example2 {
    public static void main(String[] args) {
        // URL ����� �����, � ������� ����� ��������
        String websiteUrl = "https://itlearn.ru/first-step";

        // ������� ������������ � �����
        try {
            URL url = new URL(websiteUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();

            // �������� ���������� �����������
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("���� ������� ���������. ��������� HTML-���� ��������...");
                // ���������� ��������� HTML-����
            } else {
                System.out.println("������ ��� ����������� � �����. ��� ������: " + responseCode);

            }
        } catch (IOException e) {
            System.out.println("������ ��� ������� ����������� � �����: " + e.getMessage());

        }
    }
}