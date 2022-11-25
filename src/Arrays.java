public class Arrays {
    public static void main(String[] args) {
        String[] nameOfMonths = new String[12];
        nameOfMonths[0] = "January";
        nameOfMonths[1] = "February";
        nameOfMonths[2] = "March";
        nameOfMonths[3] = "April";
        nameOfMonths[4] = "May";
        nameOfMonths[5] = "June";
        nameOfMonths[6] = "Julie";
        nameOfMonths[7] = "August";
        nameOfMonths[8] = "September";
        nameOfMonths[9] = "October";
        nameOfMonths[10] = "November";
        nameOfMonths[11] = "December";
        for (int i = 0; i < nameOfMonths.length; i++) {
            System.out.print(nameOfMonths[i]);
            if (nameOfMonths[i].equals(nameOfMonths[11])) {
                System.out.print(". ");
                break;
            }
            System.out.print(", ");
        }
    }
}
