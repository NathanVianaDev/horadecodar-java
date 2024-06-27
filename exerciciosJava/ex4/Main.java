package ex4;

import ex4.formas.Circulo;
import ex4.formas.Losango;
import ex4.formas.Paralelogramo;

public class Main {
    public static void main(String[] args) {

        new Circulo(3).realizarCalculo();
        new Losango(20, 10).realizarCalculo();
        new Paralelogramo(2, 4).realizarCalculo();

    }
}