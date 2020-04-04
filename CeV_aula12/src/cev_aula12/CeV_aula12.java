package cev_aula12;
public class CeV_aula12 {

    public static void main(String[] args) {
        Mamifero gato = new Mamifero();
        Cobra cobra = new Cobra();
        Peixe atum = new Peixe();
        Ave pardal = new Ave();
        Tartaruga tartaruga = new Tartaruga();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        
        gato.emitirSom();
        cobra.locomover();
        atum.alimentar();
        pardal.locomover();
        canguru.locomover();
        cachorro.emitirSom();
        tartaruga.locomover();
    }
}
