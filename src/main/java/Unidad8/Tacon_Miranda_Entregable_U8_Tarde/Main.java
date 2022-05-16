package Unidad8.Tacon_Miranda_Entregable_U8_Tarde;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    ProcessPosts pp=new ProcessPosts();
    pp.parseDOM("posts");
    String fecha=String.valueOf(LocalDateTime.now()) ;
    Post miPost=new Post("Soy el mejor","https://La_mejor_web_del_mundo_muchas_gracias.com","Es una prueba para ver si se añade el post que yo quiero",fecha,"\"https://La_mejor_web_del_mundo_muchas_gracias.com\"");

    pp.addPost(miPost);

    System.out.println(pp.getPosts());

    System.out.println(pp.convertToJson());

    System.out.println("El numero de posts que hay en el xml es "+pp.numPostsStax("posts"));
  }
}
