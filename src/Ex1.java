public class Ex1 {
    public static void collatzIterativo(int num) {
        System.out.print(num + " ");
        do {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
            System.out.print(num + " ");
        } while (num != 1);
    }

    public static void collatzRecursivo(int num) {
        System.out.print(num + " ");
        if (num == 1) {
            return;
        }
        if (num % 2 == 0) {
            collatzRecursivo(num / 2);
        } else {
            collatzRecursivo(3 * num + 1);
        }

    }
}
