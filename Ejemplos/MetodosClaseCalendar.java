package Ejemplos;
import java.util.Calendar;

public class MetodosClaseCalendar {

    public static void main(String[] args){

        // Se crea una fecha
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2017, 11, 20);
        System.out.println(fecha1.getTime());

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(Calendar.YEAR, 2017);
        fecha2.set(Calendar.MONTH, 11);
        fecha2.set(Calendar.DATE, 20);

        //fecha y usar metodos de accesores
        System.out.println("Año: " + fecha2.get(Calendar.YEAR));
        System.out.println("Mes: " + fecha2.get(Calendar.MONTH)); 
        System.out.println("Día: " + fecha2.get(Calendar.DATE));

        System.out.println("");
        Calendar fecha3 = Calendar.getInstance();
        System.out.println("Fecha de hoy: " + fecha3.getTime());

        //Sumar fechas
        fecha3.add(Calendar.DATE, 4);
        System.out.println("Fecha de hoy + 4 días: " + fecha3.getTime());

        //Comprobar fechas
        System.out.println(fecha3.before(fecha1));
        System.out.println(fecha3.after(fecha2));

    }

}
