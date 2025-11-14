public class Main {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno();

        alumno1.nombre="Maria";
        alumno1.nota=1;

        System.out.println("Datos del alumno 1");
        System.out.println("Nombre: "+alumno1.nombre);
        System.out.println("Nota: "+alumno1.nota);

        Alumno alumno2=new Alumno();
        alumno2.nombre="Juan";
        alumno2.nota=-21;
        System.out.println("Datos del alumno 2");
        System.out.println("Nombre: "+alumno2.nombre);
        System.out.println("Nota: "+alumno2.nota);
  }
}
