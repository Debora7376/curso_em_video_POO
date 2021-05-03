package aula07;

public class Main  {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        l[0] = new Livro("Abolição do homem", "C.S Lewis", 240, p[0]);
        l[1] = new Livro("Cristianismo puro e simples ", "C.S Lewis", 289, p[1]);
        l[2] = new Livro("Quatro amores", "C.S Lewis", 185, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancaPagina();
        System.out.println(l[0].detalhes());

        // TODO: 03/05/2021 meu exemplo
//        Pessoa pessoa1 = new Pessoa();
//        pessoa1.setNome("Debora");
//        // TODO: 30/04/2021 rever o erro do retorno do objeto pessoa
//        System.out.println(pessoa1);
//        pessoa1.setIdade(24);
//        pessoa1.setSexo("F");
//
//        Livro livro = new Livro();
//        livro.setAberto(true);
//        System.out.println(livro.getAberto());
//        livro.setTotalPaginas(250);
//        System.out.println(livro.getTotalPaginas());
//        livro.setTitulo("Abolição do homem");
//        System.out.println(livro.getTitulo());
//        livro.setLeitor(pessoa1);
//        System.out.println(livro.getLeitor());
       // livro.folhear();
    }
}
