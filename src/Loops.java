public class Loops {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 1000) {
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        int i = 0;
//        while (i <= 1000) {
//            System.out.println(i);
//            i+=2;
//        }

        for(int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
