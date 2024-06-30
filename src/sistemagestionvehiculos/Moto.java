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
public class Moto extends Vehiculo implements Aseguranza {
    private double capacidadMotor;

    public Moto(String marca, String modelo, int año, double precioRenta, double capacidadMotor) {
        super(marca, modelo, año, precioRenta);
        this.capacidadMotor = capacidadMotor;
    }

    @Override
    public double calcularCostoRenta(int dias) {
        return dias * precioRenta * 0.80;
    }

    @Override
    public double calcularCostoAseguranza() {
        return año * 0.005 * precioRenta;
    }
}
