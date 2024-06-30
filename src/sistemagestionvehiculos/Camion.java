/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagestionvehiculos;

/**
 *
 * @author Usuario
 */
public class Camion extends Vehiculo implements Aseguranza {
    private double capacidadDeCarga;

    public Camion(String marca, String modelo, int año, double precioRenta, double capacidadDeCarga) {
        super(marca, modelo, año, precioRenta);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public double calcularCostoRenta(int dias) {
        return dias * precioRenta * 1.20;
    }

    @Override
    public double calcularCostoAseguranza() {
        return año * 0.015 * precioRenta;
    }
}
