package aula07;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String detalhes() {
        return "Livro{" +
                "titulo = " + titulo +
                ", autor = " + autor + '\n' +
                ", totalPaginas = " + totalPaginas +
                ", paginaAtual = " + paginaAtual +
                ", aberto = " + aberto + '\n' +
                ", leitor = " + leitor.getNome() +
                ", idade = " + leitor.getIdade() +
                ", sexo = " + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p > this.totalPaginas) {
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = p;
//        for (int folha = getPaginaAtual();folha <= totalPaginas;folha++){
//            System.out.println("Folha atual " + folha);
            //       }
        }
    }

    @Override
    public void avancaPagina() {
        if (this.getAberto()){
            this.setPaginaAtual(this.getPaginaAtual() +1);
        }
    }

    @Override
    public void voltarPagina() {
        if (this.getAberto()){
            this.setPaginaAtual(this.getPaginaAtual() -1);
        }
    }
}
