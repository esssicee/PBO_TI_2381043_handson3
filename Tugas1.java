public class Tugas1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
            if (i == 15) {
                break;
            }
        }
    }
}