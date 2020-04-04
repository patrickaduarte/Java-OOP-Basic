package cev_aula13;
public class CeV_aula13 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        
        cachorro.reagir("Olá amigão");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11, 45);
        cachorro.reagir(19, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17,4.5f);
    }
}
