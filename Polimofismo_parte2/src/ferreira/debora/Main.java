package ferreira.debora;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();

        cachorro.reagir("Ola");
        cachorro.reagir(11,45);
        cachorro.reagir(19,00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5f);
    }
}
