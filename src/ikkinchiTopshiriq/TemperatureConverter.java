package ikkinchiTopshiriq;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;

        BaseConverter kelvinConverter = new CelsiusToKelvinConverter(celsius);
        System.out.println("Celsius to Kelvin: " + kelvinConverter.convert());

        BaseConverter fahrenheitConverter = new CelsiusToFahrenheitConverter(celsius);
        System.out.println("Celsius to Fahrenheit: " + fahrenheitConverter.convert());

        BaseConverter rankineConverter = new CelsiusToRankineConverter(celsius);
        System.out.println("Celsius to Rankine: " + rankineConverter.convert());
    }
}