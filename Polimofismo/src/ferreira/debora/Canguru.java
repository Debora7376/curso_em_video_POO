package ferreira.debora;

public class Canguru extends Manifero{
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
  @Override
  public void locomover(){
      System.out.println("Saltando");
  }
}
