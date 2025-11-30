public class Ex8 {
    public static String invStringRecursiva(String palavra, int i) {
        if (i < 0)
            return "";
        return palavra.charAt(i) + invStringRecursiva(palavra, i - 1);
    }

    public static boolean palindromoRecursiva(String palavra, int i) {
        String invertida = invStringRecursiva(palavra, i);
        return palindromo(palavra, invertida);
    }

    public static boolean palindromo(String palavra, String invertida) {
        return palavra.equals(invertida);
    }
}
