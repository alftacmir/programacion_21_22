package Unidad8.Tacon_Miranda_Entregable_U8_Tarde;

import com.google.gson.Gson;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessPosts {

    private Document doc;

    public void parseDOM(String filename){
        try {
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
            DocumentBuilder dom=dbf.newDocumentBuilder();

            this.doc=dom.parse("src/main/java/Unidad8/Tacon_Miranda_Entregable_U8_Tarde/"+filename+".xml");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void addPost(Post post){
        Element root=doc.getDocumentElement();

        Element hijo=doc.createElement("post");

        Element tittle=doc.createElement("title");
        tittle.setTextContent(post.getTitle());

        Element link=doc.createElement("link");
        link.setTextContent(post.getLink());

        Element description=doc.createElement("description");
        description.setTextContent(post.getDescription());

        Element pubDate=doc.createElement("pubDate");
        pubDate.setTextContent(post.getPubdate());

        Element guid=doc.createElement("guid");
        guid.setAttribute("isPermaLink","true");
        guid.setTextContent(post.getGuid());

       root.appendChild(hijo);
       hijo.appendChild(tittle);
       hijo.appendChild(link);
       hijo.appendChild(description);
       hijo.appendChild(pubDate);
       hijo.appendChild(guid);

    }

  public List<Post> getPosts() {

    String title = "";
    String link = "";
    String description = "";
    String pubDate = "";
    String guid = "";

    List<Post> miLista = new ArrayList<>();

    Element root = doc.getDocumentElement();
    NodeList nodeList = root.getChildNodes();

    for (int i = 0; i < nodeList.getLength(); i++) {
      if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
        NodeList nodo = nodeList.item(i).getChildNodes();
        for (int j = 0; j < nodo.getLength(); j++) {
          if (nodo.item(j).getNodeType() == Node.ELEMENT_NODE) {

            Element element = (Element) nodo.item(j);

            switch (element.getTagName()) {
              case "title":
                title = element.getTextContent();
                break;
              case "link":
                link = element.getTextContent();
                break;
              case "description":
                description = element.getTextContent();
                break;
              case "pubDate":
                pubDate = element.getTextContent();
                break;
              case "guid":
                guid = element.getTextContent();
                break;
            }
          }
        }
        miLista.add(new Post(title, link, description, pubDate, guid));
      }
    }
      return miLista;
  }

    public String convertToJson(){

        Gson gson=new Gson();

        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("src/main/java/Unidad8/Tacon_Miranda_Entregable_U8_Tarde/posts.json"));
            writer.write(gson.toJson(getPosts()));

            writer.close();

        }catch (IOException e){
      System.out.println(e.getMessage());
        }

        return gson.toJson(getPosts());
    }

    public Integer numPostsStax(String filename){
        Integer numero=0;

        try {
            XMLInputFactory input=XMLInputFactory.newInstance();
            XMLEventReader reader= reader = input.createXMLEventReader(new FileInputStream("src/main/java/Unidad8/Tacon_Miranda_Entregable_U8_Tarde/"+filename+".xml"));
            while (reader.hasNext()){
                XMLEvent evento=reader.nextEvent();
                if (evento.isStartElement()){
                    StartElement startTag=evento.asStartElement();
                    String tagname= startTag.getName().getLocalPart();
                    if (tagname.equals("post")){
                        numero++;
                    }
                }

            }

        } catch (XMLStreamException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        return numero;
    }

}
