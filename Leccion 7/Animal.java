public class Animal{
  private String nombre;
  private int edad;
  public Animal(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
  }
  public void comer(){
    System.out.println("El animal: "+this.nombre+" esta comiendo");
  }
  public void dormir(){
    System.out.println("El animal "+this.nombre+" esta durmineod... zzZ");
  }
  public String getNombre(){
    return this.nombre;
  }
  public int getEdad(){
    return this.edad;
  }
}