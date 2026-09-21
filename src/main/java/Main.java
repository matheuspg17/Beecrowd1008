
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numeroF, horaT;
        double salarioH , salario;
        
        numeroF = leia.nextInt();
        horaT = leia.nextInt();
        salarioH = leia.nextDouble();
        
        salario = (salarioH * horaT);
        
        System.out.println("NUMBER = " + numeroF);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
