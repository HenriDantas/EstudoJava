package Exercicios;
public class ConversorTemp {

    public static void main(String[] args){
        double celsius = 30.3;
        String tempC = "A temperatura em Celsius é de: %.1f°C".formatted(celsius);
        System.out.println(tempC);

        double fahrenheit = (celsius * 1.8) + 32; //para parecer "inteira" pode usar tbm %.0f no formatted()
        int fahrenheitInt = (int) fahrenheit; //exercicio para usar casting
        String tempF = "A temperatura em Fahrenheit é de: %d°F ".formatted(fahrenheitInt);
        System.out.println(tempF);

    }
}
