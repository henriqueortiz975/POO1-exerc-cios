package exercicio7_sistema_com_scanner_.intermediario;
import java.util.Scanner;

public class EXERCICIO7_Sistema_com_Scanner_Intermediario {

    public static void main(String[] args) {
        Funcionario objfuncionario = new Funcionario();
        Scanner scanome = new Scanner(System.in);
        System.out.println("digite o nome do funcionario: ");
        String stringnome = scanome.nextLine();   
        objfuncionario.nome = stringnome;
        
        Scanner scasalario = new Scanner(System.in);
        System.out.println("digite o salario desse funcionario: ");
        double dousalario = scasalario.nextDouble();
        objfuncionario.salario = dousalario;
        
        Scanner scapercentual = new Scanner(System.in);
        System.out.println("digite o percentual de aumento");
        double doupercentual = scapercentual.nextDouble();
        objfuncionario.aumentarSalario(doupercentual);
        
        objfuncionario.mostrarDados();
  
    }
    
}
