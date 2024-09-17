public class soal1 {
    public class soal1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Berapa jumlah angkanya : ");
            int jumlah = input.nextInt();

            int[] arr = new int[jumlah];

            for (int i = 0; i < jumlah; i++) {
                System.out.println("Angka " + (i + 1) + ": ");
                arr[i] = input.nextInt();
            }

            int hasil = 0;
            for (int i = 0; i < jumlah; i++) {
                hasil += arr[i];
            }

            System.out.println("Hasilnya adalah : " + hasil);

        }
    }
}
