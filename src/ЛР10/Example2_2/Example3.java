package ��10.Example2_2;

//�������� ����������� ������ ���� �� ������ ��� ���� �������. ��������,
//        ������������ ����� ������ ������ ��� ��� �������, � ��������� ������� ������
//        ����, ��������������� ����� �������� ������.

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/��10/Example1/XML/example1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ������ ��� ��� ������� ��� ������: ");
            String searchCriteria = scanner.nextLine();

            NodeList nodeList = doc.getElementsByTagName("book");

            // ���������� � ������� ����, ��������������� ��������� ������
            List<Element> books = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String author = element.getElementsByTagName("author").item(0).getTextContent();
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    if (author.equalsIgnoreCase(searchCriteria) || year.equals(searchCriteria)) {
                        books.add(element);
                    }
                }
            }

            // ����� ��������� ����
            for (Element book : books) {
                System.out.println("\n�������� �����: " + book.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("�����: " + book.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("��� �������: " + book.getElementsByTagName("year").item(0).getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}