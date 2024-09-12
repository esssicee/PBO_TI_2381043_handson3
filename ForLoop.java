public class ForLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Aple","pisang","mangga","jeruk"};
        for(int i = 0; i < 4; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("Elemen ke" + (i +1) + ": " + kumpulanBuah[i]);
        }
    }
}
