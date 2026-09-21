
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int numeroF, horaT;
        double salarioH , salario;
        
        //entrada de dados
        numeroF = leia.nextInt();
        horaT = leia.nextInt();
        salarioH = leia.nextDouble();
        
        //processamento
        salario = (salarioH * horaT);
        
        //saida de dados
        System.out.println("NUMBER = " + numeroF);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
