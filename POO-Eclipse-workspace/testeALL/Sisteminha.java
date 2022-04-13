/*Instituto Federal Baiano
Curso: Análise e Desenvolvimento de Sistemas
Disciplina: linguagem de Programação Orientada a Objetos
Docente: Woquinton Lima Fernandes
Discente: Ana Caroline Silva Nogueira
Data de início: 06/10/2021      Data de finalização: 11/10/2021     Turma: 3° Semestre*/

import java.util.Scanner;

public class Sisteminha
{
	static String Action(){
	    Scanner ler = new Scanner(System.in);
	    String acao;
	    
	    System.out.println("O que deseja fazer?");
	    acao = ler.nextLine();
	    
	    return acao;
	}
	
	static int Action2(){
	    Scanner ler = new Scanner(System.in);
	    int acao;
	    
	    System.out.println("Pressione 1 para sair do programa. \n Pressione 0 para retornar ao Menu.");
	    System.out.print("Escolha: ");
	    acao = ler.nextInt();
	    
	    return acao;
	}
    
    static void Menu(){
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
    }
    
    public static void limpatela(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
	public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Scanner lendo = new Scanner(System.in);
        
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
        String VetorCodigoCliente[] = {" ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " ",
                                    " "};
        double preco[] = {2.25, 1.75, 2.35, 2.15, 2.45};
        double estoque[] = {40, 45, 60, 48, 50};
        
        
        String nomeuser = "admin", senha = "123", NomeCliente, acao1, confirm, ClienteCod, cdcvalid, proceeding, compra, acao;
        int IDproduto, acao2;
        double dinheiroemcaixa = 0.00, valor, quantidade;
        
        
        System.out.println("- - - Logar no sistema - - -");
        System.out.println("Informe o seu nome:");
        nomeuser = ler.nextLine();
        System.out.println("Informe sua senha:");
        senha = ler.nextLine();
        
        while(!nomeuser.equals("admin") || !senha.equals("123")){
            
            limpatela();
            
            System.out.println("-----------------------------------------------------------");
            System.out.println("NOME OU SENHA INCORRETOS, POR FAVOR INFORME UM LOGIN VÁLIDO");
            System.out.println("-----------------------------------------------------------");
            System.out.println("- - - Logar no sistema - - -");
            System.out.println("Informe o seu nome:");
            nomeuser = ler.nextLine();
            System.out.println("Informe sua senha:");
            senha = ler.nextLine();
        }
        
        int inicio = 0;
        
        while(inicio == 0){
            
            limpatela();
            
            Menu();
            
            acao1 = Action();
            
            if(acao1.equals("1")){
                System.out.println("-------------Produtos-------------");
                    for(int i = 0; i < produtos.length; i++){
                        System.out.print("\n" + ID[i] + produtos[i] + "- R$");
                        
                        System.out.format("%.2f", preco[i]);            //define a quantidade de casas após a vírgula
                        
                        System.out.printf(" -  Estoque: ");
                        
                        System.out.format("%.0f", estoque[i]);
                    }
                System.out.println("\n");
                System.out.println("----------------------------------");
                
                System.out.println("Pressione 1 para sair do programa");
                System.out.println("Pressione 0 para voltar ao Menu.");
                inicio = ler.nextInt();
            }
            else if(acao1.equals("2")){
                System.out.println("-------------Clientes-------------");
                int j = 0;
                    for(int i = 0; i < clientes.length; i++){
                        j++;
                        System.out.print("ID: " + j + "| Cliente: " + clientes[i] + "\n");
                    }
                System.out.println("\n");
                System.out.println("----------------------------------");
                
                System.out.println("Pressione 1 para sair do programa");
                System.out.println("Pressione 0 para voltar ao Menu.");
                inicio = ler.nextInt();
            }
            else if(acao1.equals("3")){
                System.out.println("----------------------------------");
                System.out.println("Informe o nome do cliente:");
                NomeCliente = ler.next();
                
                for(int i=0; i<10; i++){
                    if(clientes[i] == " "){
                        clientes[i] = NomeCliente;
                        i=10;
                    }
                }
                
                System.out.println("Informe o código do cliente:");
                ClienteCod = ler.next();
                for(int i=0; i<10; i++){
                    if(VetorCodigoCliente[i] == " "){
                        VetorCodigoCliente[i] = ClienteCod;
                        i=10;
                    }
                }
                System.out.println("----------------------------------");
                System.out.println("Pressione 1 para sair do programa");
                System.out.println("Pressione 0 para voltar ao Menu.");
                inicio = ler.nextInt();
            }
            else if(acao1.equals("4")){
                System.out.println("----------------------------------");
                System.out.println("Dinheiro em caixa: R$" + dinheiroemcaixa);
                System.out.println("----------------------------------");
                
                System.out.println("Pressione 1 para sair do programa");
                System.out.println("Pressione 0 para voltar ao Menu.");
                inicio = ler.nextInt();
            }
            else if(acao1.equals("5")){
                System.out.println("------------------------------");
                System.out.println("Informe o ID do produto que deseja comprar: ");
                IDproduto = ler.nextInt();
                
                System.out.println("Qual a quantidade que deseja comprar? ");
                quantidade = ler.nextInt();
                
                for(int i = 0; i < produtos.length; i++){
                    if(quantidade <= estoque[i]){
                        
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
                        
                        if(confirm.equals("0")){
                            System.out.println("Informe um código de cliente válido: ");
                            cdcvalid = lendo.nextLine();
                            System.out.println("------------------------------");
                            
                            for(int k=0; k<VetorCodigoCliente.length; k++){
                                if (cdcvalid.equals(VetorCodigoCliente[k])){
                                    dinheiroemcaixa = dinheiroemcaixa + valor;
                                    estoque[i] = estoque[i] - quantidade;
                                    k = VetorCodigoCliente.length;
                                }
                                else{
                                    System.out.println("Não existem clientes cadastrados com esse código.");
                                    System.out.println("Pressione 0 para cadastrar novo cliente.");
                                    System.out.println("Pressione 1 para prosseguir como cliente avulso.");
                                    proceeding = lendo.nextLine();
                                    System.out.println("------------------------------");
                                    
                                    if(proceeding.equals("0")){
                                        System.out.println("----------------------------------");
                                        System.out.println("Informe o nome do cliente:");
                                        NomeCliente = ler.next();
                                        
                                        for(int g=0; g<10; g++){
                                            if(clientes[i] == " "){
                                                clientes[i] = NomeCliente;
                                                i=10;
                                            }
                                        }
                                        
                                        System.out.println("------------------------------");
                                        System.out.println("Informe o código do cliente:");
                                        ClienteCod = ler.next();
                                        for(int t=0; t<10; t++){
                                            if(VetorCodigoCliente[t] == " "){
                                                VetorCodigoCliente[t] = ClienteCod;
                                                t=10;
                                            }
                                        }
                                        
                                        System.out.println("----------------------------------");
                                        dinheiroemcaixa = dinheiroemcaixa + valor;
                                        estoque[i] = estoque[i] - quantidade;
                                        k = VetorCodigoCliente.length;
                                    }
                                    else if(proceeding.equals("1")){
                                        dinheiroemcaixa = dinheiroemcaixa + valor;
                                        estoque[i] = estoque[i] - quantidade;
                                        k = VetorCodigoCliente.length;
                                    }
                                    
                                    
                                }
                            }
                            
                        }
                        i=produtos.length;
                        
                    }
                    else{
                        System.out.println("A quantia excedeu o estoque. Verifique o estoque do produto e faça a compra novamente");
                    }
                }
                
                System.out.println("Pressione 1 para sair do programa");
                System.out.println("Pressione 0 para voltar ao Menu.");
                inicio = ler.nextInt();
            }
            else if(acao1.equals("6")){
                limpatela();        /*Professor sinto muito se essa não é a melhor forma de "limpar a tela", mas
venho tentando descobrir como fazer isso desde que o senhor passou a atividade, li em diversos sites e fóruns, 
assisti vídeos gringos também, porém não consegui implementar nenhuma das soluções propostas para de fato limpar o
console, o máximo que consegui fazer foi dar um espaçamento de modo que deixe a experiência visual do usuário menos
poluída.*/
                                
            }
            else if(acao1.equals("7")){
                break;
            }
        }
        
    }
}




