
package cev_aula9;
public class CeV_aula9 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("Aprendendo PHP", "João Pereira", 350, p[1]);
        l[2] = new Livro("Python", "Fernanda Souza", 250, p[0]);
        
        l[0].folhar(300);
        l[0].detalhes();
    }
}
