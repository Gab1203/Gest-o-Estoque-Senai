
package gestaoestoque;


public class Produto {
    private String nome;
    private int id;
    private int quantidadeDisponivel;
    private double precoUnitario;

    
     public Produto(String nome, int id, int quantidadeDisponivel, double precoUnitario) {
        this.nome = nome;
        this.id = id;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.precoUnitario = precoUnitario;
    }
    
    public String getNome() {
        return this.nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public int getId() {
        return this.id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    
    public int getQuantidadeDisponivel() {
        return this.quantidadeDisponivel;
    }

 
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

   
    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

   
    
    
    
    
    
}
