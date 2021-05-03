package aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor  p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Debora");
        p2.setNome("Andre");
        p3.setNome("Aurora");
        p4.setNome("Amelia");

        p1.setIdade(23);
        p2.setIdade(23);
        p3.setIdade(2);
        p4.setIdade(1);

        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");

        p1.fazerAniversario();
        p2.setCurso("Informatica");
        p3.setSalario(3200.00d);
        p4.getSetor("Tecnologico");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
