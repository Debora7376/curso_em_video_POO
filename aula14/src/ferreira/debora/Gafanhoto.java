package ferreira.debora;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totalAsssistido;

    public void viuMaisUm(){

    }
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAsssistido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAsssistido() {
        return totalAsssistido;
    }

    public void setTotalAsssistido(int totalAsssistido) {
        this.totalAsssistido = totalAsssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString()+
                "login='" + login + '\'' +
                ", totalAsssistido=" + totalAsssistido +
                '}';
    }
}
