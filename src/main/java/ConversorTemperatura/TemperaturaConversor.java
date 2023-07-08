/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversorTemperatura;

/**
 *
 * @author luisa
 */
public class TemperaturaConversor {
    public static double convertir(double cantidad, String escalaOrigen, String escalaDestino) {
        // Aquí se implementa la lógica de conversión de temperatura
        
        double temperaturaConvertida;
        
        // Realizar la conversión según las escalas de temperatura de origen y destino
        if (escalaOrigen.equals("Celsius") && escalaDestino.equals("Fahrenheit")) {
            temperaturaConvertida = (cantidad * 9 / 5) + 32;
        } else if (escalaOrigen.equals("Fahrenheit") && escalaDestino.equals("Celsius")) {
            temperaturaConvertida = (cantidad - 32) * 5 / 9;
        } else if (escalaOrigen.equals("Celsius") && escalaDestino.equals("Kelvin")) {
            temperaturaConvertida = cantidad + 273.15;
        } else if (escalaOrigen.equals("Kelvin") && escalaDestino.equals("Celsius")) {
            temperaturaConvertida = cantidad - 273.15;
        } else {
            throw new IllegalArgumentException("Conversión de temperatura no válida");
        }
        
        return temperaturaConvertida;
    }
}







