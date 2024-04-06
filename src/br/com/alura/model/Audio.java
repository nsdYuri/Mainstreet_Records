package br.com.alura.model;

public class Audio {

    private String tipo, titulo;
    private int duracaoMinutos, totalCurtidas, totalViews, anoLancamento, classificacao;

    public void curtiu(){
        totalCurtidas++;
    }

    public void reproduziu(){
        totalViews++;
    }

    public int somaCurtidas(int curtida){
        totalCurtidas += curtida;
        return totalCurtidas;
    }

    public int somaReproducoes(int reproducoes){
        totalViews += reproducoes;
        return reproducoes;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int geTtotalViews(){
        return totalViews;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getClassificacao() {
        return classificacao;
    }

}
