package demo;

/** Temperature conversions. */
public final class Temperature {
    private Temperature() {}

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /** Convert a temperature from Fahrenheit to Celsius. */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
