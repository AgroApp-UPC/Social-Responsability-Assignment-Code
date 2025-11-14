import java.util.Scanner;

public class Main {
    public static void SaludarPersona(String Nombre){
        System.out.println("Bienvenido "+Nombre);
    }
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter your name: ");
      String NombreDeUsuario=scanner.nextLine();
      SaludarPersona(NombreDeUsuario);
  }
}
