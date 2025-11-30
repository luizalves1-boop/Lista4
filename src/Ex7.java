public class Ex7 {
    public static int menorValorRecursiva(int[] num, int i, int menor) {
        if (i == num.length)
            return menor;
        if (num[i] < menor)
            menor = num[i];
        return menorValorRecursiva(num, i + 1, menor);
    }
}
