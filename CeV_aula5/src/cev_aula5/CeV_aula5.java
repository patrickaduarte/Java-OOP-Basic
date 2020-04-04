package cev_aula5;

public class CeV_aula5 {

    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Jubileu");
        pessoa1.abrirConta("CC");
        
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Creuza");
        pessoa2.abrirConta("CP");
        
        pessoa1.depositar(100);
        pessoa2.depositar(500);
        pessoa2.sacar(100);
        
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();

    }
    
}
