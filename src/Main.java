import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ex1();
        ex2();
    }

    public static void ex1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        System.out.print("Versão Iterativa: ");
        Ex1.collatzIterativo(num);
        System.out.print("\nVersão Recursiva: ");
        Ex1.collatzRecursivo(num);
    }

    public static void ex2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        if(Ex2.primosRecursiva(num, 2))
            System.out.println("É um número primo!");
        else
            System.out.println("Não é um número primo!");
    }

}