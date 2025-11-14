public class Main {
  public static void main(String[] args) {
      String nombre="Yo Mismo";
      int vidas=3;
      double puntaje=100;
      boolean juego_100=true;
      double bonificacion=vidas*1.5;
      double puntuacion_final=puntaje+bonificacion;
      
      System.out.println("Nombre: "+nombre);
      System.out.println("Vidas: "+vidas+" restantes");
      System.out.println("Puntaje: "+puntaje);
      System.out.println("Puntuacion final: "+puntuacion_final);
      System.out.println("Juego 100%: "+juego_100);
  }
}
