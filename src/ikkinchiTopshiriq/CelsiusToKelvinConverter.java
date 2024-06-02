package ikkinchiTopshiriq;

class CelsiusToKelvinConverter extends BaseConverter {

    public CelsiusToKelvinConverter(double celsius) {
        super(celsius);
    }

    @Override
    public double convert() {
        return celsius + 273.15;
    }
}

