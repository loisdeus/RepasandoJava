package com.company;

import com.company.Modelos.Alumno;
import javafx.beans.binding.Bindings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    private static Bindings simpleDateFormat;

    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        //int numero;
        //Integer num;
        //String texto;
        //numero=7;
        //num=8;
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimiento=null;
        try {
            fechaNacimiento= objSDF.parse("20-03-1980");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Alumno alumno=new Alumno("Juan", "Perez",fechaNacimiento, "87896321R");
        System.out.println(alumno.toString());
        System.out.println("La edad de "+alumno.getNombre()+ " es: "+alumno.getEdad(simpleDateFormat));
    }


}
