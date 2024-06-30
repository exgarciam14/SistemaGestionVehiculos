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
public class SistemaGestionVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Turismo turismo = new Turismo("Mercedes Benz", "Class E", 2024, 50, 4);
        Camion camion = new Camion("International", "Serie LT", 2018, 100, 15);
        Moto moto = new Moto("Honda", "CBR1000RR-R Fireblade SP", 2022, 30, 500);

        int dias = 4;

        System.out.println("Turismo: " + turismo.getMarca() + " " + turismo.getModelo() + ", Año: " + turismo.getAño());
        System.out.println("Costo Renta por " + dias + " días: " + turismo.calcularCostoRenta(dias));
        System.out.println("Costo Aseguranza: " + turismo.calcularCostoAseguranza());

        System.out.println("\nCamion: " + camion.getMarca() + " " + camion.getModelo() + ", Año: " + camion.getAño());
        System.out.println("Costo Renta por " + dias + " días: " + camion.calcularCostoRenta(dias));
        System.out.println("Costo Aseguranza: " + camion.calcularCostoAseguranza());

        System.out.println("\nMoto: " + moto.getMarca() + " " + moto.getModelo() + ", Año: " + moto.getAño());
        System.out.println("Costo Renta por " + dias + " días: " + moto.calcularCostoRenta(dias));
        System.out.println("Costo Aseguranza: $" + moto.calcularCostoAseguranza());
    
    }
    
}
