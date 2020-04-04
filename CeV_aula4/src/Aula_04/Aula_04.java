package Aula_04;
public class Aula_04 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta("BIC",  "Azul", 0.5f);
       Caneta c2 = new Caneta("Hostnet",  "Vermelha", 0.7f);
       c2.setTampada();
       System.out.println(c1.toString());
       System.out.println(c2.toString());
    }
}
