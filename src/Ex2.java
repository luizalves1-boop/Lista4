public class Ex2 {
    public static boolean primosRecursiva(int num, int i) {
        if (num <= 1)
            return false;
        if (i == num)
            return true;
        if (num % i == 0)
            return false;
        return primosRecursiva(num, i + 1);
    }
}
