import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o exercício: ");
        int opcao = sc.nextInt();;
        switch(opcao){
            case 1:
                ex1();
                break;
            case 2:
                ex2();
                break;
            case 3:
                ex3();
                break;
        }
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

    public static void ex3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        System.out.println(Ex3.somaDigitosRecursiva(num, 0, 0));
    }

}