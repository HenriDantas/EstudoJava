package Exercicios.Pratica4.Ex4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double temp) {
        return temp * 1.8 + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temp) {
        return (temp - 32) / 1.8;
    }


}
