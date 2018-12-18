package clase_4;

import java.util.Scanner;

public class Conditionals {
    Scanner scan = new Scanner(System.in);
    public void operadoresLógicos(){
        System.out.println("Los operadores lógicos nos ayudan en muchas cosas\n"
                + "En este método te diremos si el texto que ingreses cumple:\n"
                + "1.- Tiene más de 8 caracteres\n"
                + "2.- Tiene 10 caracteres o menos\n"
                + "3.- Tiene exactamente 9 caracteres\n"
                + "4.- Si el texto es: \"Tengo uno\"\n"
                + "5.- Si el texto tiene la letra a en su contenido");
        System.out.println("-------------------------------\n");
        System.out.println("\nIngresa un texto");
        logic(scan.nextLine());
        System.out.println("-------------------------------\n");
        System.out.println("Ingrese cualquier cosa para continuar");
        scan.nextLine();
        System.out.println("-------------------------------\n");
        System.out.println("Ingresa tu edad ej: 16");
        elseIf(scan.nextLine());
        System.out.println("-------------------------------\n");
        System.out.println("Ingresa \"hola\", \"luego\" ó \"final\" ");
        _switch(scan.nextLine());
    }
    public static final void logic(String text){
        if(text.length()>8)
            System.out.println("Tiene más de 8 caracteres");
        if(text.length() <= 10)
            System.out.println("Tiene 10 caracteres o menos");
        if(text.length() == 9)
            System.out.println("Tiene 9 caracteres");
        if(text.equalsIgnoreCase("Tengo uno"))
            System.out.println("Coincide");
        if(text.contains("a"))
            System.out.println("Tiene la letra a");
    }
    public void elseIf(String text){
        try{
            int age = Integer.parseInt(text);
            if(age < 8)
                System.out.println("No creo que tengas esa edad :c");
            else if(age > 130)
                System.out.println("Está muy raro que tengas tantos años");
            else if(age > 18 )
                System.out.println("Eres mayor de edad :3");
        }catch(NumberFormatException e){
            System.out.println("No es adecuada tu edad :c");
        }
    }
    public void _switch(String text){
        /*
            Este swicth va a ser practicamente esto:
        
        if(text.equals("hola"))
            System.out.println("Hola amigo");
        else if (text.equals("luego"))
            System.out.println("Hasta luego");
        else if (text.equals("final"))
            System.out.println("No se me ocurrió otra cosa ja, ja");
        else
            System.out.println("No ingresaste ningua de las tres palabras");
        */
        switch(text){
            case "hola":
                System.out.println("Hola amigo");
                break;
            case "luego":
                System.out.println("Hasta luego");
                break;
            case "final":
                System.out.println("No se me ocurrió otra cosa ja, ja");
                break;
            default:
                System.out.println("No ingresaste ningua de las tres palabras");
                break;
        }
    }
}