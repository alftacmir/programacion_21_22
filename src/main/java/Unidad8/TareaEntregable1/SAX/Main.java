package Unidad8.TareaEntregable1.SAX;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    //esta es la clase principal donde leemos el xml
      try{
          //obtener el parser de sax con la factory rodear de try and catch
          SAXParserFactory spf=SAXParserFactory.newDefaultInstance();
          SAXParser saxParser=spf.newSAXParser();

          //Debemos llamar a la clase que hemos creado que se va a encargar de relizar las lecturas de los XML
          //Para ello debemos implementartla en una interfaz de DEFAULTHANDLER
          DefaultHandler tenisSax = new RecorridoSax();

          //Ahora lanzamos el parseado y le damos como argumento la clase que hemos creado para que lo haga
          //como nosotros queramos
          saxParser.parse(new File("src/main/java/Unidad8/TareaEntregable1/SAX/Tenis.xml"), tenisSax);

      }catch (ParserConfigurationException | SAXException | IOException sax){
      System.out.println(sax.getMessage());
      }
  }
}
