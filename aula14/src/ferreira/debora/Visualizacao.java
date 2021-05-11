package ferreira.debora;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAsssistido(this.espectador.getTotalAsssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcetagem){
        int tot = 0;
        if (porcetagem <= 20) {
            tot = 3;
        } else if (porcetagem <= 50) {
            tot = 5;
        } else if (porcetagem <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Vizualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
