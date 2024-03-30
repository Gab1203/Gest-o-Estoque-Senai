package gestaoestoque;

 
public class Funcionario {
    private String nome;
    private String login;
    private String senha;
    private String setor;

  
    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getLogin() {
        return this.login;
    }

  
    public void setLogin(String login) {
        this.login = login;
    }

   
    public String getSenha() {
        return this.senha;
    }

  
    public void setSenha(String senha) {
        this.senha = senha;
    }

  
 
    public String getSetor() {
        return this.setor;
    }

  
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
      public Funcionario(String nome, String login, String senha, String setor) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.setor = setor;
    }

    
    
    
}
