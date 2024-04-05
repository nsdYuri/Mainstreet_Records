package br.com.alura.model;

public class Audio {

    private String tipo, titulo, genero, plataforma;
    private int duracaoMinutos, totalCurtidas, totalViews, anoLancamento;

    public void epecificacoes(Audio audio){
        System.out.println("Tipo: " + tipo);
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração " + duracaoMinutos + " minutos");
        System.out.println("Visualizações: " + totalViews);
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int geTtotalViews(){
        return totalViews;
    }

    public void setTotalViews(int totalViews){
        this.totalViews = totalViews;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
