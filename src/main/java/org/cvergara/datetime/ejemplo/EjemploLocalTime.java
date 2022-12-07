package org.cvergara.datetime.ejemplo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now() ;
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("fechaActual.getMonth() = " + fechaActual.getMonth());
        System.out.println("fechaActual.getDayOfMonth() = " + fechaActual.getDayOfMonth());
        System.out.println();
        Month mes = fechaActual.getMonth() ;
        System.out.println("mes = " + mes);
        System.out.println("numero del mes = " +mes.getValue());
        System.out.println("mes espanol " + mes.getDisplayName(TextStyle.FULL , new Locale("es" , "ES")));

        System.out.println();
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("numero del dia :" +diaSemana.getValue());
        System.out.println("Nombre del dia :" + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es" , "ES")));

        fechaActual = LocalDate.of(2020 , 1 , 25) ;
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.of(2020 , Month.APRIL , 11) ;
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-02-01") ;
        System.out.println("fechaActual = " + fechaActual);
        
        LocalDate diaDeManana = LocalDate.now().plusDays(1) ;
        System.out.println("diaDeManana = " + diaDeManana);

        LocalDate mesAnterior = LocalDate.now().minusMonths(1);
        System.out.println("mesAnterior = " + mesAnterior);

        DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);

        int diaDelMes = LocalDate.of(2020, 11 , 11).getDayOfMonth() ;
        System.out.println("diaDelMes = " + diaDelMes);

        boolean esBisiesto = LocalDate.now().isLeapYear() ;
        System.out.println("esBisiesto = " + esBisiesto);

        boolean esAntes = LocalDate.of(2019,12, 6).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);


        boolean esDespues = LocalDate.of(2019,12, 6).isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);
        
    }
}