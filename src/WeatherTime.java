public class WeatherTime {
    public static void main(String[] args) {
        boolean isWeatherGood = false;
        boolean isDay = true;

        if (isDay == true && isWeatherGood == true) {
            System.out.println("Гулять!");
        }
        if (isDay == true && isWeatherGood == false) {
            System.out.println("Читать книгу!");
        }
        if (isDay == false) {
            System.out.println("Спать");
        }
    }
}
