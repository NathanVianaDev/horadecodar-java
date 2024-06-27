package ex4.formas;

public class Paralelogramo {

    private double base;
    private double altura;

    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void realizarCalculo(){
        double calculo = base * altura;
        System.out.println("O valor da área é: " + calculo);
    }
}