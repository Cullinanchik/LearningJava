public class FirstTask {
    public static void main(String[] args) {
        int days = 760;
        int years = days / 365;
        int months = (days - (years * 365)) / 30;
        int left_days = days - (years * 365) - (months * 30);
        System.out.println(years);
        System.out.println(months);
        System.out.println(left_days);


    }
}
