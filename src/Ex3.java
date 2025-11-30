public class Ex3 {
    public static int somaDigitosRecursiva(int num, int soma, int i) {
        String numStr = Integer.toString(num);
        if (i < numStr.length())
            return somaDigitosRecursiva(num, soma += Character.getNumericValue(numStr.charAt(i)), i + 1);
        return soma;
    }
}
