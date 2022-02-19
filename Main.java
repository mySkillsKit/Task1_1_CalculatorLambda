package Task1_1_CalculatorLambda;


public class Main {

    public static void main(String[] args) {

        System.out.println("Домашнее задание к занятию 1.1: " +
                "Лямбда-выражения и функциональные интерфейсы\n" +
                "Задача 1: Калькулятор\n");

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        //вывод результата в консоль
        calc.println.accept(c);

        int h = calc.multiply.apply(a, b);
        calc.println.accept(h);

        int d = calc.pow.apply(10);
        calc.println.accept(d);

        int f = calc.abs.apply(-109);
        calc.println.accept(f);

        boolean g = calc.isPositive.test(-23);
        System.out.println(g);

    }

}
