package ��10.Example2_2;

// �������� � ��������� ��������� ���� ���� � ������� XML ����������� ������������ (Song).
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Example1 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // �������� ��������� ��������
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Playlist");
            doc.appendChild(rootElement);

            // ���������� ������ �����
            Element song1 = doc.createElement("Song");
            rootElement.appendChild(song1);

            Element title1 = doc.createElement("Title");
            title1.appendChild(doc.createTextNode("Beautiful Things"));
            song1.appendChild(title1);

            Element author1 = doc.createElement("Author");
            author1.appendChild(doc.createTextNode("Benson Boone"));
            song1.appendChild(author1);

            Element year1 = doc.createElement("Year");
            year1.appendChild(doc.createTextNode("2024"));
            song1.appendChild(year1);

            // ���������� ������ �����
            Element song2 = doc.createElement("Song");
            rootElement.appendChild(song2);

            Element title2 = doc.createElement("Title");
            title2.appendChild(doc.createTextNode("Going to his death"));
            song2.appendChild(title2);

            Element author2 = doc.createElement("Author");
            author2.appendChild(doc.createTextNode("Ramil'"));
            song2.appendChild(author2);

            Element year2 = doc.createElement("Year");
            year2.appendChild(doc.createTextNode("2023"));
            song2.appendChild(year2);

            // ������ XML-�����
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "YES");
            transformer.setOutputProperty(OutputKeys.INDENT, "YES");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/��10/Example2_2/example.xml");
            transformer.transform(source, result);

            System.out.println("XML-���� ������� ������!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
