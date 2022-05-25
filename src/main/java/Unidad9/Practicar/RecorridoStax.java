package Unidad9.Practicar;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {
  public static void main(String[] args) {
    //
    Stax();


  }
    public static void Stax(){
    String titulo="";
    String autor="";
    String editorial="";
    int paginas=0;

    String tituloaux="";
    String autoraux="";
    String editorialaux="";
    int paginasaux=0;


      try {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("src/main/java/Unidad9/Practicar/Libreria.xml"));
        String etiqueta="";

        while (xmlReader.hasNext()){
          XMLEvent xmlEvent=xmlReader.nextEvent();
          if (xmlEvent.isStartElement()){
            StartElement startElement=xmlEvent.asStartElement();
            etiqueta=startElement.getName().getLocalPart();
            }
          else if (xmlEvent.isCharacters()){
            Characters texto=xmlEvent.asCharacters();
            if (!etiqueta.equals("")){
              if (etiqueta.equals("paginas")){
                paginas= Integer.parseInt(texto.getData());
              }
            }
          }
          else if (xmlEvent.isEndElement()){
            etiqueta="";
          }
          if (paginas>paginasaux){
            paginasaux=paginas;
          }
          }
        System.out.println("Paginas: "+paginas);


      } catch (XMLStreamException | FileNotFoundException ex) {
        throw new RuntimeException(ex);
      }

     /* System.out.println("Los datos del libro con más páginas es");
      System.out.println("Titulo: "+tituloaux);
      System.out.println("Autor: "+autoraux);
      System.out.println("Editorial: "+editorialaux);
*/

}
}
