package ferreira.debora;

public class Main {

    public static void main(String[] args) {
//        Manifero m = new Manifero();
//        Reptil r = new Reptil();
//        Peixe p = new Peixe();
//        Ave a = new Ave();

//        m.setPeso(85.3f);
//        m.setIdade(2);
//        m.setMembros(4);
//        m.locomover();
//        m.alimentar();
//        m.emitirSom();
//
//        p.setPeso(0.35f);
//        p.setIdade(1);
//        p.setMembros(0);
//        p.locomover();
//        p.alimentar();
//        p.emitirSom();
//        p.soltarBolha();
//
//        a.setPeso(0.89f);
//        a.setIdade(2);
//        a.setMembros(2);
//        a.locomover();
//        a.alimentar();
//        a.emitirSom();
//        a.fazerNinho();

        Manifero m = new Manifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(5.3f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        c.setPeso(55.3f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(5.3f);
        k.setIdade(8);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
    }
}
