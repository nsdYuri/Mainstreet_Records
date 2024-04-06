package br.com.alura.view;
import br.com.alura.model.Musica;
import br.com.alura.model.Podcast;

public class playlist {
    public static void main(String[] args) {


        Musica bf = new Musica();
        bf.setTipo("Musica");
        bf.setTitulo("BEST FRIEND");
        bf.setArtista("50 Cent");
        bf.setAlbum("Get Rich or Die Tryin'");
        bf.setAnoLancamento(2009);
        bf.setGenero("Hip-Hop");
        bf.setDuracaoMinutos(4);

        for (int i = 0; i < 1000; i++){
            bf.curtiu();
        }

        for (int i = 0; i < 1500; i++){
            bf.reproduziu();
        }

        Podcast podpah = new Podcast();
        podpah.setTipo("Podcast");
        podpah.setTitulo("RODRYGO GOES - Podpah #417");
        podpah.setApresentador("Mitico e Igão");
        podpah.setAnoLancamento(2023);
        podpah.setDuracaoMinutos(114);
        podpah.setEp(417);

        for (int i = 0; i < 3000; i++ ){
            podpah.curtiu();
        }

        for (int i = 0; i < 5000; i++){
            podpah.reproduziu();
        }
    }
}
