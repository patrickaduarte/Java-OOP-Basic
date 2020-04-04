package cev_aula7.pkg8;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {
    }
    
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if(desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiante != desafiado) {
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar() {
        if (isAprovada()){
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("!---------- VENCEDOR ----------!");
            switch(vencedor){
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + " ganhou a luta!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + " ganhou a luta!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
