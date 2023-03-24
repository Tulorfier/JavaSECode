public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int j = test.f(10);
        System.out.println(j);

    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return f(n - 2) + 2 * f(n - 1);
        }
    }
}

