public class Ex4 {
    public static int potenciaRecursiva(int num, int exp, int resultado) {
        if (exp > 0)
            return potenciaRecursiva(num, exp - 1, resultado * num);
        return resultado;
    }
}
