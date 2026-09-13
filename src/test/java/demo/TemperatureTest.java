package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureTest {
    @Test
    void celsiusToFahrenheit() {
        assertEquals(212.0, Temperature.celsiusToFahrenheit(100.0));
        assertEquals(32.0, Temperature.celsiusToFahrenheit(0.0));
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(100.0, Temperature.fahrenheitToCelsius(212.0));
        assertEquals(0.0, Temperature.fahrenheitToCelsius(32.0));
    }
}
