package ferreira.debora;

public class Cachorro extends Manifero{
    private String corPelo;

    @Override
    public String getCorPelo() {
        return corPelo;
    }

    @Override
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public void enterrarOsso(){
        System.out.println("Enterrando o osso");
    }
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}
