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
public class Turismo extends Vehiculo implements Aseguranza {
     private int numeroPuertas;

    public Turismo(String marca, String modelo, int año, double precioRenta, int numeroPuertas) {
        super(marca, modelo, año, precioRenta);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoRenta(int dias) {
        return dias * precioRenta;
    }

    @Override
    public double calcularCostoAseguranza() {
        return año * 0.01 * precioRenta;
    }
}
