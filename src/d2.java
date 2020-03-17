import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class d2 {
    public static void main(String[] args)throws Exception {
       SAXReader sax =new SAXReader();
       Document document =  sax.read("day02/EP/d2/bean.xml");
                Element element1 =document.getRootElement();
        List<Element>list=element1.elements();
        for (int i=0;i<list.size();i++){
                      String s =list.get(i).getName();
            System.out.println(s);
                               String id=list.get(i).attributeValue("id");
                               String classname=list.get(i).attributeValue("className");
            System.out.println(id);
            System.out.println(classname);

            List<Element>list1=list.get(i).elements();
            for (Element element2:list1){
                System.out.println(element2.getName());
                System.out.println(element2.attributeValue("name"));
                System.out.println(element2.attributeValue("value"));
                System.out.println(element2.getText());
            }

        }



    }
}
