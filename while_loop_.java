public class while_loop_ {
    public static void main(String[] args) {
        int i =1;
        while(i <= 20) {
            if (i % 3)
            if (i > 15){
                break;
            }
            if ((i & 3) == 0){
                continue;
            }
        }
    }
}
