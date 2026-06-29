package Ejercicios;
public class ejercicio6 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el total de una factura a partir de la base
        //imponible (precio sin IVA). La base imponible estará almacenada en una
        //variable.
        double baseImponible = 100.50; // Puedes cambiar este valor
        double iva = 0.21; // 21% de IVA
        
        double totalFactura = baseImponible + (baseImponible * iva);
        
        System.out.printf("Base imponible: %.2f €\n", baseImponible);
        System.out.printf("IVA (21%%): %.2f €\n", (baseImponible * iva));
        System.out.printf("Total: %.2f €\n", totalFactura);
    }
}
