
package JavaConverterMoedasTemperaturas;
import java.util.Scanner; //importação do leitor de dados
/**
 * @author Gustavo F. Vetter 03/11/21
 */
public class Main {

    
    public static void main(String[] args) {
        // 
        int opcaoMenu;
        float cotacaoDolar = 0.0f;
        float valorEmReais = 0.0f;
        float valorEmDolares = 0.0f;
        double valorEmCelsius = 0.0d;
        double valorEmFarenheit = 0.0d;
        
        char desejaContinuar = 'S';
        
        Scanner leitor = new Scanner(System.in); //criação do leitor de dados
        
        // Entrada da cotação do dólar + confirmação do valor
        System.out.println("Digite a cotacao do Dolar para conversao"
                + " para Reais:");
        cotacaoDolar = leitor.nextFloat();
        System.out.println(" ");
        System.out.println("Nesta cotacao US 1,00 vale R$ " + cotacaoDolar);
        System.out.println(" ");
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
        
        // Menu com a opções para o usuário:
        System.out.println("Escolha uma das opcoes abaixo:");
        System.out.println("1 - Converter Reais para Dolares");
        System.out.println("2 - Converter Dolares para Reais:");
        System.out.println("3 - Converter Celsius para Farenheit");
        System.out.println("4 - Converter Farentheit para Celsius");
        System.out.println(" ");
        opcaoMenu = leitor.nextInt();
        
        switch(opcaoMenu){
            case 1: // Converter Reais para Dolares
                System.out.println(" ");
                System.out.println("1 - Converter Reais para Dolares");
                System.out.println("Informe o valor em Reais:");
                valorEmReais = leitor.nextFloat();
                System.out.println(" ");
                System.out.println("Na cotacao de " + cotacaoDolar + " por um,"
                        + " R$ " + valorEmReais + " equivale(m) a US$ " + 
                        (valorEmReais / cotacaoDolar));
                break; // Obrigatório ter um break ao final de cada case, para encerar esta execução. É como ter uma flag de saída  no visualG
            
            case 2: // COnverter Dolares para Reais
                System.out.println(" ");
                System.out.println("2 - Converter Dolares para Reais");
                System.out.println("Informe o valor em Dolares:");
                valorEmDolares = leitor.nextFloat();
                System.out.println(" ");
                System.out.println("Na cotacao de " + cotacaoDolar + " por um,"
                        + " US$ " + valorEmDolares + " equivale(m) a "
                        + "R$ "+ (valorEmDolares * cotacaoDolar));
                break;
            
            case 3: // Converter C para F
                System.out.println(" ");
                System.out.println("3 - Converter Celsius para Farenheit");
                System.out.println("Informe o valor em Celsius:");
                valorEmCelsius = leitor.nextDouble();
                valorEmFarenheit = (valorEmCelsius * 1.8) + 32;
                System.out.println(" ");
                System.out.println(valorEmCelsius + " graus Celsius equivalem"
                        + " a " + valorEmFarenheit + " graus Farenheit");        
                break;
            
            case 4: // Converter F para C
                System.out.println(" ");
                System.out.println("4 - Converter Farenheit para Celsius");
                System.out.println("Informe o valor em Farenheit:");
                valorEmFarenheit = leitor.nextDouble();
                valorEmCelsius = (valorEmFarenheit - 32) / 1.8;
                System.out.println(" ");
                System.out.println(valorEmFarenheit + " graus Farenheit "
                        + "equivalem a " + valorEmCelsius + " graus Celsius");
                break;   
                
            
        }
        System.out.println(" ");
        System.out.println("Deseja continuar? S para Sim; N para Nao");
        desejaContinuar = leitor.next().charAt(0);
        System.out.println(" ");
        if (desejaContinuar == 'N' || desejaContinuar == 'n'){
        System.out.println("Obrigado por usar nossos servicos.");
        System.out.println("Esperamos reve-lo em breve.");
        } else {
        }
        }
    }
    
}
