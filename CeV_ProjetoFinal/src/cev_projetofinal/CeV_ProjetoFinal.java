package cev_projetofinal;
public class CeV_ProjetoFinal {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 5 de HTML5");
                
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Patrick", 29, "M", "patrickaduarte");
        g[1] = new Gafanhoto("Luiza", 25, "F", "luizarodrigues");
        
        for (Gafanhoto g1 : g){
            System.out.println(g1.toString());
        }
        
        for (Video v1 : v) {
            System.out.println(v1.toString());
        }
    }
    
}
