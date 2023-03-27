
package livraria;

public class Livro extends Produto {
    private String isbn;
    
    // construtor
    public Livro(String titulo, String autor, String editora, double preco, int quantidadeEmEstoque, String isbn) {
        super(titulo, autor, editora, preco, quantidadeEmEstoque);
        this.isbn = isbn;
    }
    
    // getter e setter
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    // método toString sobrescrito
    @Override
    public String toString() {
        return "Revista [titulo=" + this.getTitulo() + ", editora=" + this.getEditora() + ", preco=" + this.getPreco() +
            ", quantidade=" + this.getQuantidadeEmEstoque()+ ", ISBN=" + isbn + "]";
    }
}

