public class Tugas1 public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            // Lewati angka yang habis dibagi 3
            if (i % 3 == 0) {
                continue;
            }
            // Cetak angka
            System.out.println(i);
            // Berhenti ketika mencapai angka 15
            if (i == 15) {
                break;
            }
        }
    }
}
