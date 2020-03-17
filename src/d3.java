import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class d3 {
    public static void main(String[] args)throws Exception {
        SAXReader sax=new SAXReader();
             Document document =sax.read("day02/EP/d2/student.xml");
             Element element1=(Element) document.selectSingleNode("//students//student//xing");
        System.out.println(element1.getName());
        System.out.println(element1.getText());

                       List<Element>elements2 =document.selectNodes("//students//student");
                       for (Element element3:elements2){
                           System.out.println(element3.getName());
                           System.out.println(element3.attributeValue("number"));
                       }

                           Element element2= (Element) document.selectNodes("sex[2]");


    }
}
