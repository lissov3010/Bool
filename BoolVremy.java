public class BoolVremy {
    public static void main(String[] args) {
        int time = 15; // первая переменная хранит время
        boolean isGoodWeather = true; //хорошая погода или нет
        boolean late = time >= 23 || time <= 5;//поздно если время 23 или 5 часов
        if (late) {
            System.out.println("Спать");
        }
        if (!late && isGoodWeather) {
           System.out.println("Гулять");
        }
        if (!late && !isGoodWeather) {
            System.out.println("Читать книгу");
        }
    }
}
