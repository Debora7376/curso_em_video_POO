package ferreira.debora;

public class Manifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }
}
