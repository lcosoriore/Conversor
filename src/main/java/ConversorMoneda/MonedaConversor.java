/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversorMoneda;

/**
 *
 * @author luisa
 */
public class MonedaConversor {
    public static double convertir(double cantidad, String monedaOrigen, String monedaDestino) {
        // Aquí se implementa la lógica de conversión de monedas
        // Puedes utilizar tasas de conversión fijas o acceder a un servicio externo para obtener las tasas actualizadas
        // Por simplicidad, este ejemplo utiliza tasas de conversión fijas para fines ilustrativos
        
        double tasaConversionUSDToEUR = 0.85;
        double tasaConversionUSDToGBP = 0.72;
        
        // Convertir de moneda de origen a dólares estadounidenses
        double cantidadEnUSD;
        switch (monedaOrigen) {
            case "USD":
                cantidadEnUSD = cantidad;
                break;
            case "EUR":
                cantidadEnUSD = cantidad / tasaConversionUSDToEUR;
                break;
            case "GBP":
                cantidadEnUSD = cantidad / tasaConversionUSDToGBP;
                break;
            default:
                throw new IllegalArgumentException("Moneda de origen no válida");
        }
        
        // Convertir de dólares estadounidenses a moneda de destino
        double cantidadConvertida;
        switch (monedaDestino) {
            case "USD":
                cantidadConvertida = cantidadEnUSD;
                break;
            case "EUR":
                cantidadConvertida = cantidadEnUSD * tasaConversionUSDToEUR;
                break;
            case "GBP":
                cantidadConvertida = cantidadEnUSD * tasaConversionUSDToGBP;
                break;
            default:
                throw new IllegalArgumentException("Moneda de destino no válida");
        }
        
        return cantidadConvertida;
    }
}
