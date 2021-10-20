package Unidad1.Tarea4;


import java.time.LocalDateTime;

public class Ej4_5 {
    public static void main(String[] args) {
        LocalDateTime localdate = LocalDateTime.now();
        int hours = localdate.getHour();
        int minutes= localdate.getMinute();
        int seconds= localdate.getSecond();

        System.out.println("La hora actual es: "+hours+":" +minutes+":" +seconds);
    }
}
