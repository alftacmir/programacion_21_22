package Unidad8.TareaEntregable1.DOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDom {
    Document doc;


    public void parseado(String archivo){
        // Obtenego el parser/DocumentBuilder
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //luego le pasamos el fichero xml
            this.doc=db.parse(new File("src/main/java/Unidad8/TareaEntregable1/DOM/"+archivo+".xml"));


        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void numNodosHijos(){
        Element raiz= doc.getDocumentElement();
        NodeList nl=raiz.getChildNodes();
        System.out.println("Hay "+nl.getLength()+" nodos en este documento");
        for(int i = 0; i < nl.getLength(); i++) {
      System.out.println("El hijo numero "+i+" es de tipo "+procesadorNodo(nl.item(i)));
        }
    }

    public String procesadorNodo(Node n){
        if (n.getNodeType()==Node.ELEMENT_NODE){
            return "etiqueta";
        }else if (n.getNodeType()==Node.TEXT_NODE){
            return "texto vacio";
    } else if (n.getNodeType()==Node.COMMENT_NODE){
            return "comentario";
    }
        return null;
    }

    public void mostrarXMLDom(){
        Element root= doc.getDocumentElement();
        NodeList nl= root.getChildNodes();
        Attr att;
    for (int i = 0; i < nl.getLength(); i++) {
      if (procesadorNodo(nl.item(i)).equals("etiqueta")){
        System.out.print("<"+nl.item(i).getNodeName()+" ");

        if (nl.item(i).hasAttributes()){
          for (int j = 0; j < nl.item(i).getAttributes().getLength(); j++) {
            System.out.print(" "+nl.item(i));
          }
        }
      }

    }
    }
    }


