
package gestaoestoque;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
        Operacoes operacoes = new Operacoes() ;
        boolean looping = true;
        
        do {
        	
        	System.out.println("0 - Sair do programa\n1 - Adicionar produto\n2 - Remover produto\n3 - Editar produto\n4 - Exibir produtos\n5 - Cálculos\n6 - Pegar produtos\nDigite o número desejado:");
        	int code = scan.nextInt();
        	
        	switch(code){
        	
        	case 0:
        		
        		looping = false;
        		break;
        	
        	case 1: 
        		operacoes.adicionarProduto();
        		
        		break;
        		
        		
        	case 2:
        		
        		operacoes.removerProduto();
        		
        		break;
        		
        	case 3:
        	
        	operacoes.editarProduto();
        	break;
        	
        	case 4:
        		operacoes.exibirDados();
        		
        		break;
        		
        	case 5:
        		operacoes.calculos();
        		
        		break;
        		
        	case 6:
        		
        		operacoes.pegarEstoque();
        		
        		break;
        		
        		default:
        			
        			System.out.println("Código inválido!!!");
        			break;
        			
        	}
        	
        	
        	
        	
        }while(looping == true);
        
       
       
       
    }
    
}
