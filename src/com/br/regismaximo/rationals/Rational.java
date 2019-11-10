/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.regismaximo.rationals;

/**
 *
 * @author Regis_Maximo
 */
public class Rational {

    private int numerador;
    private int denominador;

    public Rational(int num, int dem) {
        int i = 2;
        while (num % i == 0 && dem % i == 0) {
            num = num / i;
            dem = dem / i;
            i++;
        }
        numerador = num;
        denominador = dem;
    }

    public Rational() {
        numerador = 1;
        denominador = 2;
        System.out.printf("Valor Padrão: %d/%d\n", this.numerador, this.denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public static void somaRationals(int num1, int num2, int dem1, int dem2) {
        int somaN;
        int somaD;
        
        if (dem1 == dem2) {
            somaN = num1 + num2;
            somaD = dem1 + dem2;
            
            // faz com que exemplifique a fração
            int i = 2;
            while (somaN % i == 0 && somaD % i == 0) {
                somaN = somaN / i;
                somaD = somaD / i;
                i++;
            }
            
            System.out.printf("Soma - Denominadores iguais: %d/%d\n", somaN, somaD);
        } else {
            somaN = ((dem1 * dem2)) * (num1 * num2);
            somaD = dem1 * dem2;
            
            // faz com que exemplifique a fração
            int i = 2;
            while (somaN % i == 0 && somaD % i == 0) {
                somaN = somaN / i;
                somaD = somaD / i;
                i++;
            }
            System.out.printf("Soma - Denominadores diferentes: %d/%d\n", somaN, somaD);
        }

    }
    
    public static void subtracaoRationals(int num1, int num2, int dem1, int dem2) {
        int subN;
        int subD;
        
        if (dem1 == dem2) {
            subN = num1 + num2;
            subD = dem1 + dem2;
            
            // faz com que exemplifique a fração
            int i = 2;
            while (subN % i == 0 && subD % i == 0) {
                subN = subN / i;
                subD = subD / i;
                i++;
            }
            
            System.out.printf("Subtração - Denominadores iguais: %d/%d\n", subN, subD);
        } else {
            subD = MMC.mmc(dem1, dem2); // chama o método estático para fazer o MMC e atribui o resultado em subD
            System.out.println("mmc: " + subD);
            subN = (((subD * dem1) * dem2));
            
            // faz com que exemplifique a fração
            int i = 2;
            while (subN % i == 0 && subD % i == 0) {
                subN = subN / i;
                subD = subD / i;
                i++;
            }
            System.out.printf("Subtração - Denominadores diferentes: %d/%d\n", subN, subD);
        }

    }
    
       public static void multiRationals(int num1, int num2, int dem1, int dem2) {
        int mulN;
        int mulD;
        
            mulN = num1 * num2;
            mulD = dem1 * dem2;
            
            // faz com que exemplifique a fração
            int i = 2;
            while (mulN % i == 0 && mulD % i == 0) {
                mulN = mulN / i;
                mulD = mulD / i;
                i++;
            }
            
            System.out.printf("Multiplicação - Frações simplificada: %d/%d\n", mulN, mulD);
    }

}
