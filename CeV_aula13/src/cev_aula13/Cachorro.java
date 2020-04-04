package cev_aula13;
public class Cachorro extends Lobo{
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    public void reagir(String frase){
        if("Olá amigão".equals(frase) || "Quer comida?".equals(frase)){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int minuto){
        if(hora < 11) {
            System.out.println("Abanar");
        } else if(hora > 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if(dono) {
            System.out.println("Abanar o rabo");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar o rabo");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
