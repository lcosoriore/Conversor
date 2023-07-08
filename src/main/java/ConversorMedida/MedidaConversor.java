/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversorMedida;

/**
 *
 * @author luisa
 */
public class MedidaConversor {
    public static double convertir(double cantidad, String medidaOrigen, String medidaDestino) {
        // Aquí se implementa la lógica de conversión de medidas
        
        double factorConversion;
        
        // Realizar la conversión según las medidas de origen y destino
        if (medidaOrigen.equals("Pulgadas") && medidaDestino.equals("Centímetros")) {
            factorConversion = 2.54;
        } else if (medidaOrigen.equals("Centímetros") && medidaDestino.equals("Pulgadas")) {
            factorConversion = 1 / 2.54;
        } else if (medidaOrigen.equals("Metros") && medidaDestino.equals("Pies")) {
            factorConversion = 3.28084;
        } else if (medidaOrigen.equals("Pies") && medidaDestino.equals("Metros")) {
            factorConversion = 1 / 3.28084;
        } else {
            throw new IllegalArgumentException("Conversión de medidas no válida");
        }
        
        // Realizar la conversión de la cantidad utilizando el factor de conversión
        double cantidadConvertida = cantidad * factorConversion;
        
        return cantidadConvertida;
    }
}
