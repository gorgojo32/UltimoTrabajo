/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author jpber
 */
public class Funciones {
     public static void main(String[] args) {
        double salarioMensual = 3000000; // 3 millones de pesos colombianos
        double porcentajeRetencion = 10; // 10%
        
        double[] resultado = calcularSalarioAnualYRetencion(salarioMensual, porcentajeRetencion);
        
        System.out.println("Salario anual: $" + resultado[0]);
        System.out.println("Retención anual: $" + resultado[1]);
    }
    
    public static double[] calcularSalarioAnualYRetencion(double salarioMensual, double porcentajeRetencion) {
        double salarioAnual = salarioMensual * 12;
        double retencionAnual = salarioAnual * (porcentajeRetencion / 100);
        
        return new double[]{salarioAnual, retencionAnual};
    }
}
