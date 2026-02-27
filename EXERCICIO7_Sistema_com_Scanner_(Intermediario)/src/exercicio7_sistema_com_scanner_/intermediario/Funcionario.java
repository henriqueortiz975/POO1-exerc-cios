package exercicio7_sistema_com_scanner_.intermediario;

public class Funcionario {
    String nome;
    double salario;
    
    public void aumentarSalario(double percentual){
        percentual /= 100;
        percentual *= salario;
        salario += percentual;
        
    }
    
    public void mostrarDados(){
        System.out.println("nome do funcionario: " + nome);
        System.out.println("salario novo do funcionario com o aumento: " + salario);
       
    }
}
