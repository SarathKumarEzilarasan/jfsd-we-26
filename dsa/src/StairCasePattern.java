public class StairCasePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 5; i++) {
            String pad = " ".repeat(i * n);
            for (int j = 0; j < 5; j++) {
                System.out.println(pad + "*");
            }
            System.out.println(pad + "*".repeat(n));
        }
    }
}
