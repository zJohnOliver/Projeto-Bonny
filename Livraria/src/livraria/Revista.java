
package livraria;


public class Revista extends Produto {
    private String periodicidade;

    public Revista(String titulo, String editora, double preco, int quantidade, String periodicidade) {
        super(titulo, null, editora, preco, quantidade);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    @Override
    public String toString() {
        return "Revista [titulo=" + this.getTitulo() + ", editora=" + this.getEditora() + ", preco=" + this.getPreco() +
            ", quantidade=" + this.getQuantidadeEmEstoque()+ ", periodicidade=" + periodicidade + "]";
    }
}

