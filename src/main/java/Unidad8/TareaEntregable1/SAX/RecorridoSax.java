package Unidad8.TareaEntregable1.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//Tenemos que extender para heredar todas las interfaces de sax
public class RecorridoSax extends DefaultHandler {

    //Manejador para empezar a leer el documento
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    System.out.println("Comienzo del parseado del documento Tenis.xml");
    }

    //Otro para el fin del documento
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    System.out.println("\nFin del parseado del documento Tenis.xml");
    }

    //Ahora hay que manejar las etiquetas
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

    // Hay que abrir la etiqueta para mostrarla
    System.out.print("<"+qName);


    //Recorro los atributos
     if (attributes != null){
      for (int i = 0; i < attributes.getLength(); i++) {
        // recorremos el array de atributos
        System.out.print(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
      }
     }
    // cierro la etiqueta que estaba leyendo
    System.out.println(">");
    }

    //el manejador que se ocupa de cerrar las etiquetas cuando son leidas
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

    System.out.print("</"+qName+">");
    }

    //el manejador que se ocupa de todos los textos que hay en las etiquetas

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch,start,length);
        System.out.println(content);
    }
}
