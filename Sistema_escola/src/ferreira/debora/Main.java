package ferreira.debora;

public class Main {

    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa();
//        Visitante v1 = new Visitante();
//        v1.setNome("Debora");
//        v1.setIdade(24);
//        v1.setSexo("F");
//        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Andre");
        a1.setMatricula(19103839);
        a1.setCurso("Informatica");
        a1.setIdade(23);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(86848684);
        b1.setNome("Débora");
        b1.setIdade(24);
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

    }
}