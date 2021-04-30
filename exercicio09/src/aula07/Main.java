package aula07;

public class Main  {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Debora");
        // TODO: 30/04/2021 rever o erro do retorno do objeto pessoa 
        System.out.println(pessoa);
        pessoa.setIdade(24);
        pessoa.setSexo("F");
        Livro livro = new Livro();
        livro.setAberto(true);
        System.out.println(livro.getAberto());
        livro.setTotalPaginas(250);
        System.out.println(livro.getTotalPaginas());
        livro.setTitulo("Abolição do homem");
        System.out.println(livro.getTitulo());
        livro.setLeitor(pessoa);
        System.out.println(livro.getLeitor());
       // livro.folhear();
    }
}
