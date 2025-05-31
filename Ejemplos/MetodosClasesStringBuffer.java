package Ejemplos;

class MetodosClasesStringBuffer {

    public static void main(String[] args) {

        String cad = "Hola";
        cad += " mundo";
        cad += "que tal";

        StringBuffer cad1 = new StringBuffer();
        StringBuffer cad2 = new StringBuffer(50);
        StringBuffer cad3 = new StringBuffer(cad);

        //metodo length
        int lon = cad3.length();
        System.out.println("El largo de la caddena 3 es " + lon);

        //metodo charAt
        char cararter = cad3.charAt(0);
        System.out.println(cararter);

        //metodo deleteCharAt
        cad3.deleteCharAt(18);
        System.out.println(cad3);

        //metodo append
        cad3.append("?");
        System.out.println(cad3);

        //metodo delete
        cad3.delete(4, 10);
        System.out.println(cad3);

        cad3.reverse();
        System.out.println(cad3);
        cad3.reverse();
        System.out.println(cad3);

        //metodo replace
        cad3.replace(5, 12, "como estas");
        System.out.println(cad3);

        //metodo toString
        String strFSB = cad3.toString();
        System.out.println(strFSB);

    }

    
}
