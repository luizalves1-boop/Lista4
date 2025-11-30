public class Ex6 {
    public static String invStringRecursiva(String palavra, int i) {
        if (i < 0)
            return "";
        return palavra.charAt(i) + invStringRecursiva(palavra, i - 1);
    }
}
