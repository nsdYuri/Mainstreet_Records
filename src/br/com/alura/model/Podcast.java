package br.com.alura.model;

public class Podcast extends Audio{

    private String apresentador;
    private int totalEp, ep;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public int getTotalEp() {
        return totalEp;
    }

    public void setTotalEp(int totalEp) {
        this.totalEp = totalEp;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }
}
