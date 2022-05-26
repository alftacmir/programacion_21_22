package Unidad9.Tacon_Miranda_Alfonso_U8U9_Examen.Ejercicio2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClaseStax {
  XMLEventReader reader;

  public void parseStax() {
    try {
      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      reader =
          xmlInputFactory.createXMLEventReader(
              new FileInputStream(
                  "src/main/java/Unidad9/Tacon_Miranda_Alfonso_U8U9_Examen/pilotos.xml"));

      System.out.println("Se ha parseado con Stax Correctamente");

    } catch (XMLStreamException | FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public void winner() {
    parseStax();
    String estiqueta = "";

    String name = "";
    String team = "";
    int age = 0;
    int championships = 0;

    String nameaux = "";
    String teamaux = "";
    int ageaux = 0;
    int championshipsaux = 0;

    while (reader.hasNext()) {
      try {
        XMLEvent event = reader.nextEvent();
        if (event.isStartElement()) {
          StartElement start = event.asStartElement();
          estiqueta = start.getName().getLocalPart();
        } else if (event.isCharacters()) {
          Characters text = event.asCharacters();
          if (!estiqueta.equals("")) {
            if (estiqueta.equals("nombre")) {
              name = text.getData();
            } else if (estiqueta.equals("edad")) {
              age = Integer.parseInt(text.getData());
            } else if (estiqueta.equals("escuderia")) {
              team = text.getData();
            } else if (estiqueta.equals("campeonatos")) {
              championships = Integer.parseInt(text.getData());
            }
          }
        } else if (event.isEndElement()) {
          estiqueta = "";
        }
        if (championships > championshipsaux) {
          nameaux = name;
          ageaux = age;
          teamaux = team;
          championshipsaux = championships;
        }
      } catch (XMLStreamException e) {
        throw new RuntimeException(e);
      }
    }

    System.out.println("El piloto mas galardonado es:");
    System.out.println("Nombre: " + nameaux);
    System.out.println("Edad: " + ageaux);
    System.out.println("Escuderia: " + teamaux);
    System.out.println("Campeonatos: " + championshipsaux);
  }

  public void popularTeam(String team) {
      parseStax();
    String etiqueta = "";
    int contador = 0;
    while (reader.hasNext()) {
      try {
        XMLEvent event = reader.nextEvent();
        if (event.isStartElement()) {
          StartElement start = event.asStartElement();
          etiqueta = start.getName().getLocalPart();
        } else if (event.isCharacters()) {
          Characters text = event.asCharacters();
          if (!etiqueta.equals("")) {
              if (etiqueta.equals("escuderia")) {
              if (text.getData().equals(team)) {
                contador++;
              }
            }
          } else if (event.isEndElement()) {
            etiqueta = "";
          }
        }
      } catch (XMLStreamException e) {
        throw new RuntimeException(e);
      }
    }

    System.out.println("El numero de pilotos de la escudería " + team + " es: " + contador);
  }
}
