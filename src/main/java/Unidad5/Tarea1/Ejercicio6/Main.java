package Unidad5.Tarea1.Ejercicio6;

public class Main {
  public static void main(String[] args) {
    // Canción del tetris : mi si do re do si la do mi re do si do re mi do la la re fa la la sol fa
    // Canción de JoJO's:  si si si la si RE si fa# la si si si la si FA MI RE la
    // si si si la si RE si fa# la si si si la si FA MI RE la
    Piano p1=new Piano();
    p1.add(Notas.MI);
    p1.add(Notas.SI);
    p1.add(Notas.DO);
    p1.add(Notas.RE);
    p1.add(Notas.DO);
    p1.add(Notas.LA);
    p1.add(Notas.RE);
    p1.add(Notas.DO);
    p1.add(Notas.SI);
    p1.add(Notas.DO);
    p1.add(Notas.RE);
    p1.add(Notas.MI);
    p1.add(Notas.DO);
    p1.add(Notas.LA);
    p1.add(Notas.LA);
    p1.add(Notas.FA);
    p1.add(Notas.LA);
    p1.add(Notas.LA);
    p1.add(Notas.SOL);
    p1.add(Notas.FA);
    p1.interpretar();
    Campana c1=new Campana();
    c1.add(Notas.SI);
    c1.add(Notas.SI);
    c1.add(Notas.SI);
    c1.add(Notas.SI);
    c1.add(Notas.LA);
    c1.add(Notas.SI);
    c1.add(Notas.RE);
    c1.add(Notas.SI);
    c1.add(Notas.FA);
    c1.add(Notas.LA);
    c1.add(Notas.SI);
    c1.add(Notas.SI);
    c1.add(Notas.SI);
    c1.add(Notas.LA);
    c1.add(Notas.SI);
    c1.add(Notas.FA);
    c1.add(Notas.MI);
    c1.add(Notas.RE);
    c1.add(Notas.LA);
    c1.interpretar();
  }
}
