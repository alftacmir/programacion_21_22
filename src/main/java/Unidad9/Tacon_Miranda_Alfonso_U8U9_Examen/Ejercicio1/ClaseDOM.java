package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio1;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;


public class ClaseDOM {
    Document document;

    public void parseDom(){
        try{
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            DocumentBuilder dom=dbf.newDocumentBuilder();

            this.document=dom.parse(new File("src/main/java/Unidad9/Tacon_Miranda_Alfonso_U8U9_Examen/pilotos.xml"));

      System.out.println("Se ha parseado correctamente el fichero");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void insertDriver(String name,Integer age,String team,Integer win){
        Element root=document.getDocumentElement();
        Node new_driver=document.createElement("piloto");

        Node dname=document.createElement("nombre");
        dname.setTextContent(name);
        Node dage=document.createElement("edad");
        dage.setTextContent(String.valueOf(age));
        Node dteam=document.createElement("escuderia");
        dteam.setTextContent(team);
        Node dwin=document.createElement("campeonatos");
        dwin.setTextContent(String.valueOf(win));

        root.appendChild(new_driver);
        new_driver.appendChild(dname);
        new_driver.appendChild(dage);
        new_driver.appendChild(dteam);
        new_driver.appendChild(dwin);

    }

    public void insertNode(String country){
        Element root=document.getDocumentElement();
        NodeList arbol=root.getChildNodes();

        Element dcountry=document.createElement("pais");
        dcountry.setTextContent(country);

    for (int i = 0; i < arbol.getLength(); i++) {
        if (arbol.item(i).getNodeType()==Node.ELEMENT_NODE){
            arbol.item(i).appendChild(dcountry.cloneNode(true));//Son del mismo país por simplificar la lógica del programa
        }
    }
    }

    public void transformer(){
        try {
            TransformerFactory tf=TransformerFactory.newInstance();
            Transformer trans=tf.newTransformer();

            trans.setOutputProperty(OutputKeys.INDENT, "yes");
            trans.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            trans.setOutputProperty(OutputKeys.METHOD, "xml");
            trans.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            Element root=document.getDocumentElement();

            DOMSource source=new DOMSource(root);

            File new_drivers=new File("src/main/java/Unidad9/Tacon_Miranda_Alfonso_U8U9_Examen/ejercicio1.xml");

            StreamResult result=new StreamResult(new_drivers);

            trans.transform(source,result);


        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}
