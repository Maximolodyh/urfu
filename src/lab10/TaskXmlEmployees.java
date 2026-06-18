package ExamplesPlusTasksLab10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class TaskXmlEmployees {

    private static final String FILE_PATH = "src/Examples10/employees.xml";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in, "UTF-8");
            File inputFile = new File(FILE_PATH);

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("=== Система управления сотрудниками ===");
            printEmployees(doc);

            // 1. ДОБАВЛЕНИЕ
            System.out.println("\n--- Добавление сотрудника ---");
            System.out.print("Введите ФИО: ");
            String name = scanner.nextLine();
            System.out.print("Введите должность: ");
            String position = scanner.nextLine();
            System.out.print("Введите зарплату: ");
            String salary = scanner.nextLine();
            addNewEmployee(doc, name, position, salary);
            saveXml(doc, FILE_PATH);

            // 2. ПОИСК
            System.out.println("\n--- Поиск сотрудника ---");
            System.out.print("Введите имя или должность для поиска: ");
            String criteria = scanner.nextLine();
            findEmployees(doc, criteria);

            // 3. УДАЛЕНИЕ
            System.out.println("\n--- Удаление сотрудника ---");
            System.out.print("Введите полное ФИО сотрудника для удаления: ");
            String nameToDelete = scanner.nextLine();
            deleteEmployee(doc, nameToDelete);
            saveXml(doc, FILE_PATH);

            System.out.println("\nИтоговый список после всех операций:");
            printEmployees(doc);

        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    // Метод добавления нового узла
    private static void addNewEmployee(Document doc, String name, String pos, String sal) {
        Element root = doc.getDocumentElement();
        Element newEmp = doc.createElement("employee");

        newEmp.appendChild(createChildElement(doc, "name", name));
        newEmp.appendChild(createChildElement(doc, "position", pos));
        newEmp.appendChild(createChildElement(doc, "salary", sal));

        root.appendChild(newEmp);
        System.out.println("Сотрудник добавлен в дерево объектов.");
    }

    // Метод удаления узла по имени
    private static void deleteEmployee(Document doc, String name) {
        NodeList nodes = doc.getElementsByTagName("employee");
        boolean removed = false;

        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);
            if (getTagValue("name", element).equalsIgnoreCase(name)) {
                element.getParentNode().removeChild(element);
                System.out.println("Сотрудник " + name + " удален.");
                removed = true;
                i--; // Уменьшаем индекс, так как список сократился
            }
        }
        if (!removed) System.out.println("Сотрудник с таким именем не найден.");
    }

    // Метод поиска
    private static void findEmployees(Document doc, String criteria) {
        NodeList nodes = doc.getElementsByTagName("employee");
        for (int i = 0; i < nodes.getLength(); i++) {
            Element element = (Element) nodes.item(i);
            String name = getTagValue("name", element);
            String pos = getTagValue("position", element);
            if (name.toLowerCase().contains(criteria.toLowerCase()) ||
                    pos.toLowerCase().contains(criteria.toLowerCase())) {
                System.out.println("Найдено: " + name + " (" + pos + ")");
            }
        }
    }

    // Вспомогательный метод для вывода списка
    private static void printEmployees(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("employee");
        if (nodeList.getLength() == 0) System.out.println("Список пуст.");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element el = (Element) nodeList.item(i);
            System.out.println("- " + getTagValue("name", el) + " [" + getTagValue("position", el) + "]");
        }
    }

    // Сохранение изменений в файл с форматированием
    private static void saveXml(Document doc, String filePath) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://apache.org}indent-amount", "4");
        transformer.transform(new DOMSource(doc), new StreamResult(new File(filePath)));
    }

    private static Element createChildElement(Document doc, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

    private static String getTagValue(String tagName, Element element) {
        NodeList list = element.getElementsByTagName(tagName);
        return (list.getLength() > 0) ? list.item(0).getTextContent() : "N/A";
    }

    private static void createEmptyXml(String filePath) throws Exception {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        doc.appendChild(doc.createElement("company"));
        saveXml(doc, filePath);
    }
}
