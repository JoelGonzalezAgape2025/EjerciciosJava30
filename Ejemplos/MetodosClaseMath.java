package Ejemplos;

public class MetodosClaseMath {

    public static void main(String[] args) {

        int num1 = 848;
        int num2 = -848;
        double num3 = 9.33;
        double num4 = 10.6;
        double num5 = 3.51;

        if (Math.abs(num1) == Math.abs(num2)) {
            System.out.println("valor abosoluto es igual de ambos numeros");
        }

        //uso del metodo ceil
        System.out.println(Math.ceil(num3));
        System.out.println(Math.floor(num4));
        System.out.println(Math.round(num5));
        System.out.println(Math.ceil(2.000000001));
        System.out.println(Math.floor(5.999999999));
        System.out.println(Math.round(2.49));

        //uso del metodo exp
        System.out.println(Math.exp(2.5));

        //uso del metodo max y min
        System.out.println(Math.max(10, 19.5));
        System.out.println(Math.min(5, 4.9));

        //uso del metodo sqrt
        System.out.println(Math.sqrt(100));
        System.out.println(Math.sqrt(64));

        //uso del metodo pow
        System.out.println(Math.pow(5, 3));
        System.out.println(Math.pow(2, -5));

        //uso del metodo random
        System.out.println(Math.random());
        System.out.println(Math.random() + 5);
        System.out.println(Math.random() - 1); 

        System.out.println(Math.random() * 25); 
        System.out.println(Math.random() * 50 + 50);
        


    }

}
