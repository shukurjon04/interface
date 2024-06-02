package ikkinchiTopshiriq;

class CelsiusToRankineConverter extends BaseConverter {

    public CelsiusToRankineConverter(double celsius) {
        super(celsius);
    }

    @Override
    public double convert() {
        return (celsius + 273.15) * 9/5;
    }
}