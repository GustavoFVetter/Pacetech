
package ExercicioMissaoSemana7;

/**
  * @author Gustavo F. Vetter 07/11/2021
 */
public class Main {
    
    public static void main(String[] args) {
          
        
        
        Empregado Funcionario1 = new Empregado("Paulo", "Santos", 2000.0f);
               
        System.out.println("Funcionario " + Funcionario1.getPrimeiroNome() + " "
                + Funcionario1.getSobreNome() + " tem salario anual de R$ "
                + Funcionario1.getSalarioAnual());
            
        System.out.println("Funcionario " + Funcionario1.getPrimeiroNome() + " "
                + Funcionario1.getSobreNome() + " recebera aumento de 10% e tera"
                        + " salario anual de R$ "
                + Funcionario1.getSalarioAnualAumentado()); 
        
        System.out.println(" ");
        
        Empregado Funcionario2 = new Empregado("Renato", "Barbosa", 2750.0f);
               
        System.out.println("Funcionario " + Funcionario2.getPrimeiroNome() + " "
                + Funcionario2.getSobreNome() + " tem salario anual de R$ "
                + Funcionario2.getSalarioAnual());
            
        System.out.println("Funcionario " + Funcionario2.getPrimeiroNome() + " "
                + Funcionario2.getSobreNome() + " recebera aumento de 10% e tera"
                        + " salario anual de R$ "
                + Funcionario2.getSalarioAnualAumentado()); 
        
    }
    
}
