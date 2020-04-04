package cev_aula9;
public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public void detalhes() {
        System.out.println("========== DETALHES DO LIVRO ==========");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de páginas: " + getTotPaginas());
        System.out.println("Leitor: " + getLeitor().getNome());
        System.out.println("Idade: " + getLeitor().getIdade());
        System.out.println("Sexo: " + getLeitor().getSexo());
        System.out.println("Página atual: " + getPagAtual());
        System.out.println("Aberto: " + isAberto());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if(!isAberto()){
            this.setAberto(true);
        } else {
            System.out.println("Livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if(isAberto()){
            this.setAberto(false);
        } else {
            System.out.println("Livro já está fechado");
        }
    }
    
    @Override
    public void folhar(int pagina) {
        if(pagina <= this.getTotPaginas()){
            this.setPagAtual(pagina);
        } else {
            System.out.println("Impossível folhar");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            System.out.println("Livro já terminou");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() != 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
