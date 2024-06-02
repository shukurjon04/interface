package ikkinchiTopshiriq;

abstract class BaseConverter {
    protected double celsius;

    public BaseConverter(double celsius) {
        this.celsius = celsius;
    }

    // Abstract method for conversion
    public abstract double convert();
}