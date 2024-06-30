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
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precioRenta;

    public Vehiculo(String marca, String modelo, int año, double precioRenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioRenta = precioRenta;
    }

    public abstract double calcularCostoRenta(int dias);
    public abstract double calcularCostoAseguranza();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecioRenta() {
        return precioRenta;
    }
}
