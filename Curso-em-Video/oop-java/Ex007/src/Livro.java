public class Livro implements Publicacao{
    String titulo;
    String autor;
    int totPaginas;
    int pagAtual;
    boolean aberto;
    Pessoa leitor;


    public String detalhes() {
        return "Livro{" +
                "\n titulo='" + titulo + '\'' +
                ", \n autor='" + autor + '\'' +
                ", \n totPaginas=" + totPaginas +
                ", \n pagAtual=" + pagAtual +
                ", \n aberto=" + aberto +
                ", \n leitor=" + leitor.getNome() +
                ",  idade=" + leitor.getIdade() +
                ",  sexo=" + leitor.getIdade() +
                '}';
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
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
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhar(int p) {
        if (p > this.totPaginas){
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }

    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }
}
