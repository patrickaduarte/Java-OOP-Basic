package cev_aula12;

public class Reptil extends Animal {
    private String CorEscama;

    public String getCorEscama() {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) {
        this.CorEscama = CorEscama;
    }
   
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de réptil");
    }
    
}
