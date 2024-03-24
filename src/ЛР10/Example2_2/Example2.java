package ��10.Example2_2;

//         �������� ����������� ���������� ����� ����� � XML-����.
//        ��������, ������������ ����� ������ ������ � ����� �����, � ��������� ������� ����� ������� <book> � XML-����.

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // �������� ��������� ��������
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            // ���������� ������������ ����
            addBook(doc, "����� � ���", "��� �������", "1869");
            addBook(doc, "������ � ���������", "������ ��������", "1967");

            // ���������� ����� �����
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� �������� ����� �����:");
            String newTitle = scanner.nextLine();
            System.out.println("������� ������ ����� �����:");
            String newAuthor = scanner.nextLine();
            System.out.println("������� ��� ������� ����� �����:");
            String newYear = scanner.nextLine();
            addBook(doc, newTitle, newAuthor, newYear);

            // ������ XML-�����
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "YES");
            transformer.setOutputProperty(OutputKeys.INDENT, "YES");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/��10/Example1/XML/example1.xml");
            transformer.transform(source, result);

            System.out.println("XML-���� ������� ��������!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ����� ��� ���������� ����� � XML-����
    private static void addBook(Document doc, String title, String author, String year) {
        Element book = doc.createElement("book");
        Element bookTitle = doc.createElement("title");
        bookTitle.appendChild(doc.createTextNode(title));
        book.appendChild(bookTitle);
        Element bookAuthor = doc.createElement("author");
        bookAuthor.appendChild(doc.createTextNode(author));
        book.appendChild(bookAuthor);
        Element bookYear = doc.createElement("year");
        bookYear.appendChild(doc.createTextNode(year));
        book.appendChild(bookYear);
        doc.getDocumentElement().appendChild(book);
    }
}
