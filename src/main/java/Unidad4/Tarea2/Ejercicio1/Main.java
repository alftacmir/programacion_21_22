package Unidad4.Tarea2.Ejercicio1;

public class Main {
  public static void main(String[] args) {
    //
      Integer i1=new Integer(15);
      Integer i2=new Integer(1);
      Integer i3=new Integer(7);
      Integer i4=new Integer(20);
      Integer i5=new Integer(30);
      Integer i6=new Integer(55);
      Integer i7=new Integer(77);
      Integer i8=new Integer(101);
      Integer i9=new Integer(890);
      Integer i10=new Integer(666);
      Integer i11=new Integer(21);
      Integer i12=new Integer(1004);

      Lista l1=new Lista(3);
      l1.insertar(i2);
      l1.insertar(i3);
      l1.insertar(i9);
      l1.insertar(i8);
      l1.insertpri(i10);
      l1.insertar(i1);
      l1.insertar(i11);
      l1.info();
    System.out.println();
    l1.getelement(2);
    System.out.println();
    l1.getIndex(21);
  }
}
