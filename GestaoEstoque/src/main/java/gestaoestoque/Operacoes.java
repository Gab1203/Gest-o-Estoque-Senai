package gestaoestoque;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Operacoes {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Produto> produtos = new ArrayList<>(); 
    
    public void adicionarProduto(){
      
        
       
        System.out.println("Digite o nome do produto:");
        String nomeProduto = scan.next();
        System.out.println("Digite a quantidade do produto:");
        int quantidadeProduto = scan.nextInt();
        System.out.println("Digite o preço unitário do produto:");
        double precoUnitario = scan.nextDouble();
        int idProduto = random.nextInt(1, 1000);
        
        for(int i = 0; i < produtos.size(); i++){
            
            do{
                if(idProduto == produtos.get(i).getId()){
            
                  idProduto++;
            
        }
  
            }while(idProduto == produtos.get(i).getId());
            
        }
      
            produtos.add(new Produto(nomeProduto, idProduto, quantidadeProduto, precoUnitario));  
        
        
    

        
    }
    
    
     public void removerProduto(){
        
         System.out.println("Digite o id do produto que queira remover:");
         int idProduct = scan.nextInt();
         
         for(int i = 0; i < produtos.size(); i++){
             
             
             if(idProduct == produtos.get(i).getId()){
                 
                 produtos.remove(i);
                 System.out.printf("O produto %s foi removido!!!\n", produtos.get(i).getNome());
             }
             
         }
        
    }
    
     
     public void editarProduto(){
      String decisaoEditar = "S";
      
         System.out.println("Digite o id do produto que queira editar:");
         int idProduct = scan.nextInt();
         
      for(int i = 0; i < produtos.size(); i++){
             
             
             if(idProduct == produtos.get(i).getId()){
                
                 
                 do{
                     System.out.printf("Produto: %s\n\n1 - Editar nome\n2 - Editar Id\n3 - Editar quantidade disponível\n4 - Editar preço unitário\n\nDigite o número da opção desejada:\n", produtos.get(i).getNome());
                 int codigo = scan.nextInt();
                 
                 switch(codigo){
                     
                     case 1:
                         
                         System.out.println("Digite o novo nome do produto:");
                         produtos.get(i).setNome(scan.next());
                         System.out.printf("O nome do produto agora é %s!!\n", produtos.get(i).getNome());
                         break;
                         
                     case 2:
                         System.out.println("Digite o novo nome do produto:");
                         produtos.get(i).setId(scan.nextInt());
                         System.out.printf("O Id do produto agora é %d!!\n", produtos.get(i).getId());
                         break;
                         
                     case 3:
                         
                         System.out.println("Digite o nova quantidade disponível do produto:");
                         produtos.get(i).setQuantidadeDisponivel(scan.nextInt());
                         System.out.printf("A quantidade disponível do produto agora é %d!!\n", produtos.get(i).getQuantidadeDisponivel());
                         break;
                         
                         
                     case 4:
                         
                         System.out.println("Digite o novo preço unitário do produto:");
                         produtos.get(i).setPrecoUnitario(scan.nextDouble());
                         System.out.printf("O nome do produto agora é R$ %.2f!!\n", produtos.get(i).getPrecoUnitario());
                         break;
                         
                     default: 
                         System.out.println("Opção inválida, digite novamente!!!");
                         
                         break;
                         
                     
                 }
                     
                   System.out.println("Ainda deseja editar algo no produto? (Digite 'S' para sim ou 'N' para não)");
                  decisaoEditar = scan.next();
                decisaoEditar = decisaoEditar.toUpperCase();
                 }while(decisaoEditar.equals("S"));
                 
                 
                 
             }
             
         }
     }
         
         
         
}
