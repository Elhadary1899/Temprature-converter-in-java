public class TemperatureConverter extends Temperature implements Converters{

    @Override
    public double CelsiusToFahrenheit(double degree, String scale) {
            return (degree*(9.0/5.0))+32.0;
    }

    @Override
    public double FahrenheitToCelsius(double degree, String scale) {
            return (degree-32.0)*(5.0/9.0);
    }

    @Override
    public double CelsiusToKelvin(double degree, String scale) {
            return degree+273.15;
    }

    @Override
    public double KelvinToCelsius(double degree, String scale) {
            return degree-273.15;
    }

    @Override
    public double FahrenheitToKevin(double degree, String scale) {
            return ((degree-32.0)*(5.0/9.0))+273.15;
    }

    @Override
    public double KelvinToFahrenheit(double degree, String scale) {
            return ((degree-273.15)*(9.0/5.0))+32.0;
    }
}
