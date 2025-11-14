import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("--Bienvenidos a la simulacion de autos--");
    System.out.println("Ingrese la marca del auto: ");
    String marca=scanner.nextLine();
    System.out.println("Ingrese el color del auto: ");
    String color=scanner.nextLine();

    Coche miCoche=new Coche(marca,color);

    boolean Simulacion=true;
    while(Simulacion){
      System.out.println("Ingrese una opcion: ");
      System.out.println("1. Acelerar");
      System.out.println("2. Frenar");
      System.out.println("3. Repostar");
      System.out.println("4. Ver el estado del coche");
      System.out.println("5. Ver la velocidad actual");
      System.out.println("6. Salir");
      System.out.println("Ingrese una opcion: ");
      int opcion=scanner.nextInt();
      if(opcion==1){
        miCoche.acelerar();
      }else if(opcion==2){
        miCoche.frenar();
      }else if(opcion==3){
        miCoche.repostarGasolina();
      }else if(opcion==4){
        System.out.println(miCoche.toString());
      }else if(opcion==5){
        System.out.println("La velocidad actual es: "+miCoche.getVelocidadActual());
      }else if(opcion==6){
        System.out.println("Saliendo de la simulacion");
        Simulacion=false;
      }else{
        System.out.println("Opcion invalida");
      }
    }
    scanner.close();
  }
}
