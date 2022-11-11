/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class calculadora1 {

    public calculadora1() {

    }
    Scanner sc = new Scanner(System.in);
    private String operador = "";
    double valorActual = 0;
    double valorInput = 0;
    String valorEscrito = "";
    String valorSinResolver = "";

    public void setOperador(String op) {
        operador = op;
    }

    public void setValorRes() {
        valorSinResolver = "";
    }

    public double evaluar() {

        if (valorEscrito == "") {
            return valorActual;
        }

        double valorNumerico = Double.parseDouble(valorEscrito);

        switch (operador) {
            case "+":
                valorActual = valorActual + valorNumerico;
                break;
            case "-":
                valorActual = valorActual - valorNumerico;
                break;
            case "*":
                valorActual = valorActual * valorNumerico;
                break;
            case "/":
                valorActual = valorActual / valorNumerico;
                break;
            case "%":
                valorActual = valorActual % valorNumerico;
                break;
            default:
                break;
        }
        valorEscrito = "";
        return valorActual;
    }

    public double setValorActual() {
        valorActual = 0.0;
        return valorActual;
    }

    public void setValorEscrito(String valor) {
        if (!(valorEscrito.equals(""))) {
            valorEscrito += valor;
        } else {
            valorEscrito = valor;
        }
    }

    public void setValorSinResolver(String valorRes) {
        if (!(valorSinResolver.equals(""))) {
            valorSinResolver += valorRes;
        } else {
            valorSinResolver = valorRes;
        }
    }
}
