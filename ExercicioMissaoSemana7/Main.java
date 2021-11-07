
package ExercicioMissaoSemana7;

/**
  * @author Gustavo F. Vetter 07/11/2021
 */
public class Main {
    
    public static void main(String[] args) {
          
        
        //Consigo criar Empregado, como abaixo.
        //Mas não consigo criar Empregado1, ou EmpregadoUm.
        //Como fazer para criar duas variáveis?
        Empregado emp = new Empregado("Paulo", "Santos", 1000.0f);
        
        // Quando executa o programa, a linha abaixo não traz o valor do salario anual.
        System.out.println("Funcionario " + emp.getPrimeiroNome() + " "
                + emp.getSobreNome() + " tem salario anual de R$ "
                + emp.getSalarioAnual());
        
        
        // Quando executa o programa, a linha abaixo não traz o valor do salario anual aumentado.
        System.out.println("Funcionario " + emp.getPrimeiroNome() + " "
                + emp.getSobreNome() + " recebera aumento de 10% e tera"
                        + " salario anual de R$ "
                + emp.getSalarioAnualAumentado());       
    }
    
}
