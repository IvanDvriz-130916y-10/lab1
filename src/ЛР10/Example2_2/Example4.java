package ЛР10.Example2_2;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

//Реализуйте функцию удаления книги из XML-файла. Например, пользователь
//        может ввести название книги, которую хочет удалить, и программа удалит
//        соответствующий элемент <book> из XML-файла.

public class Example4 {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/ЛР10/Example1/XML/example1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название книги для удаления: ");
            String bookTitleToDelete = scanner.nextLine();

            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String title = element.getElementsByTagName("title").item(0).getTextContent();
                    if (title.equalsIgnoreCase(bookTitleToDelete)) {
                        node.getParentNode().removeChild(node);
                        System.out.println("Книга успешно удалена.");
                    }
                }
            }

            // Сохранение изменений в XML-файл
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/ЛР10/ЛР13.Example1/XML/example1.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

