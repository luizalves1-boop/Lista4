public class Ex9 {
    public static int somaVetorRecursiva(int[] num, int soma, int i) {
        if (i < num.length)
            return somaVetorRecursiva(num, soma + num[i], i + 1);
        return soma;
    }
}
