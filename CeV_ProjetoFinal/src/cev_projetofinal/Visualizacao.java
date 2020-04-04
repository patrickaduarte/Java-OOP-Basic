package cev_projetofinal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
        this.video.setReproduzindo(true);
    }
   
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
    
    public void avaliar() {
        this.video.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.video.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.video.setAvaliacao(tot);
    }
    @Override
    public String toString() {
        return "!=!=!=!=!=!=!=!=!=! VISUALIZAÇÃO !=!=!=!=!=!=!=!=!=!" 
            + "\n" + espectador
            + "\n" + video;
    }
    
}
