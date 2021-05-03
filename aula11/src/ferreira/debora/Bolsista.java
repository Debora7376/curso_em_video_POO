package ferreira.debora;

public class Bolsista extends Aluno{
    private int bolsa;

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado" );    }

    public void renovarMensalidade(){
        System.out.println("Renovando bolsa de" + this.getNome());
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = (int) bolsa;
    }
}
