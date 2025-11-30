public class Ex5 {
    public static int mdcRecursiva(int num, int num2, int i) {
        if (num % i == 0 && num2 % i == 0)
            return i;
        return mdcRecursiva(num, num2, i - 1);
    }
}
