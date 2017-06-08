package Tasks;

public class EvenOrOddOrDevByThree {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 0) {
                System.out.println(i + " even");
            } else if (i % 3 == 0) {
                System.out.println(i + " divided by 3");
            } else if (i % 2 == 0) {
                System.out.println(i + " even");
            } else {
                System.out.println(i + "  odd");
            }
        }
    }
}