package aula07;

public class Main  {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Debora");
        System.out.println(pessoa1);
        pessoa1.setIdade(24);
        pessoa1.setSexo("F");

        Livro livro = new Livro();
        livro.setAberto(true);
        System.out.println(livro.getAberto());
        livro.setTotalPaginas(250);
        System.out.println(livro.getTotalPaginas());
        livro.setTitulo("Abolição do homem");
        System.out.println(livro.getTitulo());
        livro.setLeitor(pessoa1);
        System.out.println(livro.getLeitor());
       // livro.folhear();
    }
}
