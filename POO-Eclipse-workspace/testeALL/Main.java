
import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
        double preco[] = {2.25, 1.75, 2.35, 2.15, 2.45};
        double estoque[] = {40, 45, 60, 48, 50};
        String ID[] = {"ID: 1 - Produto: ", 
                        "ID: 2 - Produto: ",
                        "ID: 3 - Produto: ",
                        "ID: 4 - Produto: ",
                        "ID: 5 - Produto: "};
        String produtos[] = {"Feijão ",
                             "Arroz ", 
                             "Macarrão ", 
                             "Café ", 
                             "Tapioca "};
		String clientes[] = {" ",
	                         " ",
	                         " ",
	                         " ",
	                         " ",
	                         " ",
	                         " ",
	                         " ",
	                         " ",
	                         " "};
        String codigoCliente[] = {" ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " "};
        double dinheiroemcaixa = 0.00;
        
        Menu();
        
	}
	
	public static void Menu(){
        
        Scanner ler = new Scanner(System.in);
        
        limpatela();
        
        int opcao;
        
        System.out.println("------------------------------");
        System.out.println("             Menu");
        System.out.println("------------------------------");
        System.out.println("[1] Mostrar produtos em estoque;");
        System.out.println("[2] Mostrar clientes;");
        System.out.println("[3] Cadastrar novo cliente;");
        System.out.println("[4] Mostrar dinheiro em caixa;");
        System.out.println("[5] Vender produto;");
        System.out.println("[6] Limpar tela;");
        System.out.println("[7] Sair;");
        System.out.println("------------------------------");
        System.out.println("O que você deseja fazer?");
        opcao = ler.nextInt();
        
        switch (opcao){
            case 1:
                listarProdutos(); break;
            case 2:
                listarClientes(); break;
            case 3:
                novoCliente(); break;
            case 4:
                mostrarCaixa(); break;
            case 5:
                venderProduto(); break;
            case 6:
                limpatela();
                Menu(); break;
            case 7:
                System.out.println("Volte Sempre!");
                break;        
            default:
                System.out.println("Opção invalida!");
                Menu(); break;
        }
        
    }
	
	public static void espere(){
        
        Scanner ler = new Scanner(System.in);
        
        int wait;
        System.out.println("Pressione 1 para sair do programa");
        System.out.println("Pressione 0 para voltar ao Menu.");
        wait = ler.nextInt();
        
        if(wait == '0'){
            
        }
        else{
            limpatela();
            Menu();
        }
    }
	
	public static void limpatela(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
	public static void listarProdutos(String[] x){
        System.out.println("-------------Produtos-------------");
        for(int i=0; i<5; i++){
            System.out.print("\n" + ID[i] + produtos[i] + "- R$");
            
            System.out.format("%.2f", preco[i]);            //define a quantidade de casas após a vírgula
            
            System.out.printf(" -  Estoque: ");
            
            System.out.format("%.0f", estoque[i]);
        }
        System.out.println("\n");
        System.out.println("----------------------------------");
	}
	
	public static void listarClientes(String[] String[]){
	    System.out.println("-------------Clientes-------------");
        int j = 0;
        for(int i = 0; i < clientes.length; i++){
            j++;
            System.out.print("ID: " + j + "| Cliente: " + clientes[i] + "\n");
        }
        System.out.println("\n");
        System.out.println("----------------------------------");
        espere();
	}
	
	public static void novoCliente(String[] String[]){
        Scanner ler = new Scanner(System.in);
        
        String novoNome, novoCodigo;
        
        System.out.println("----------------------------------");
        System.out.println("Informe o nome do cliente:");
        novoNome = ler.next();
        
        for(int i=0; i<10; i++){
            if(clientes[i] == " "){
                clientes[i] = novoNome;
                i=10;
            }
        }
        
        System.out.println("Informe o código do cliente:");
        novoCodigo = ler.next();
        for(int i=0; i<10; i++){
            if(codigoCliente[i] == " "){
                codigoCliente[i] = novoCodigo;
                i=10;
            }
        }
        espere();
	}
	
	public static void mostrarCaixa(){
	    System.out.println("----------------------------------");
        System.out.println("Dinheiro em caixa: R$" + dinheiroemcaixa);
        System.out.println("----------------------------------");
	}
	
	public static void venderProduto(){
        Scanner ler = new Scanner(System.in);
        int quantidade, IDproduto, confirm, proceeding;
        String codigoValido;
        
        System.out.println("------------------------------");
        System.out.println("Informe o ID do produto que deseja comprar: ");
        IDproduto = ler.nextInt();
        System.out.println("Qual a quantidade que deseja comprar? ");
        quantidade = ler.nextInt();
        
        for(int i=0; i<produtos.length; i++){
            switch(quantidade){
                case quantidade <= estoque[i]:
                    
                    i = IDproduto-1;
                    valor = preco[i] * quantidade;
                    
                    System.out.println("------RECIBO------");
                    System.out.println("Produto: " + produtos[i]);
                    System.out.println("Preço da unidade: " + preco[i]);
                    System.out.println("Quantidade sendo comprada: " + quantidade);
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("Valor a pagar: " + valor);
                    
                    System.out.print("\n \nConfirmar compra?? 0-SIM, 1-NÃO(para cancelar a compra): ");
                    confirm = lendo.nextLine();
                    System.out.println("------------------------------");
                    
                    switch(confirm){
                        case 0:
                            System.out.println("Informe um código de cliente válido: ");
                            codigoValido = lendo.nextLine();
                            System.out.println("------------------------------");
                            
                            for(int k=0; k<codigoCliente.length; k++){
                                switch(codigoValido){
                                    case codigoValido.equals(codigoCliente[k]):
                                        
                                        dinheiroemcaixa = dinheiroemcaixa + valor;
                                        estoque[i] = estoque[i] - quantidade;
                                        k = codigoCliente.length;
                                        break;
                                        
                                    case !codigoValido.equals(codigoCliente):
                                        
                                        System.out.println("Não existem clientes cadastrados com esse código.");
                                        System.out.println("Pressione 0 para cadastrar novo cliente.");
                                        System.out.println("Pressione 1 para prosseguir como cliente avulso.");
                                        proceeding = lendo.nextLine();
                                        System.out.println("------------------------------");
                                        
                                        switch(proceeding){
                                            case 0:
                                                novoCliente();
                                                System.out.println("----------------------------------");
                                                dinheiroemcaixa = dinheiroemcaixa + valor;
                                                estoque[i] = estoque[i] - quantidade;
                                                
                                                k = codigoCliente.length;
                                                break;
                                                
                                            case 1:
                                                dinheiroemcaixa = dinheiroemcaixa + valor;
                                                estoque[i] = estoque[i] - quantidade;
                                                
                                                k = codigoCliente.length;
                                                
                                                break;
                                        }
                                        break;
                                }
                            }
                            i=produtos.length;
                            break;
                        case 1:
                            System.out.println("Compra cancelada!");
                            espere();
                            break;
                    }
                    break;
                    
                case quantidade > estoque:
                    System.out.println("A quantia excedeu o estoque. Verifique o estoque do produto e faça a compra novamente");
                    espere();
                    break;
            }
        }
	}
	
	static void FazerLogin(){
        
        Scanner ler = new Scanner(System.in);
        
        CarregarEstoque();
        String nomeuser = "admin", senha = "123", resposta;
        
        limpatela();
        
        System.out.println("- - - Logar no sistema - - -");
        System.out.println("Informe o seu nome:");
        nomeuser = ler.nextLine();
        System.out.println("Informe sua senha:");
        senha = ler.nextLine();
        
        System.out.println("----------------------------");
        System.out.printf("\nUsuario: ", nomeuser);
        System.out.printf("\nSenha: ", senha);
        
        switch(nomeuser){
            case nomeuser("admin"):
            case senha.equals(123): 
                Menu(); break;
            default:
                System.out.println("Login incorreto"); break;
        }
    }

}


