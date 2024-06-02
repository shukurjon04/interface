package ikkinchiTopshiriq;

class CelsiusToFahrenheitConverter extends BaseConverter {

    public CelsiusToFahrenheitConverter(double celsius) {
        super(celsius);
    }

    @Override
    public double convert() {
        return (celsius * 9/5) + 32;
    }
}