public class Coche{
  private String marca;
  private String color;
  private int velocidadActual;
  private int gasolina;

  public Coche(String marca, String color){
    this.marca=marca;
    this.color=color;
    this.velocidadActual=0;
    this.gasolina=100;
  }

  public String getMarca(){
    return this.marca;
  }
  public int getGasolina(){
    return this.gasolina;
  }
  public int getVelocidadActual(){
    return this.velocidadActual;
  }

  public void setVelocidadActual(int nuevaVelocidad){
    if(nuevaVelocidad>=0 && nuevaVelocidad<=200){
      this.velocidadActual=nuevaVelocidad;
    }else if(nuevaVelocidad<0){
      System.out.println("La velocidad no puede ser negativa");
    }else{
      System.out.println("La velocidad no puede superar los 200km/h");
    }
  }

  public void acelerar(){
    if(this.gasolina>0){
      setVelocidadActual(this.velocidadActual+10);
      this.gasolina=this.gasolina-10;
      System.out.println("El "+this.marca+" acelera. (Gasolina: "+this.gasolina+"%)");
    }else{
      System.out.println("El "+this.marca+" no puede acelerar. (Gasolina Agotada)");
    }
  }

  public void frenar(){
    setVelocidadActual(0);
    System.out.println("El "+this.marca+" frena.");
  }
  public void repostarGasolina(){
    this.gasolina=100;
    System.out.println("Tanque lleno al 100%");
  }

  @Override
  public String toString(){
    return "Coche{" + "marca=" + marca + ", color=" + color + ", velocidadActual=" + velocidadActual + ", gasolina=" + gasolina + '}';
  }
}