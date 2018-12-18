package clase_4;

import java.util.Scanner;

public class ParsingData {
    Scanner scan = new Scanner(System.in);
    public void parsingData(){
        /* Antes que nada hemos de recordar que es indispensable asegurarse que el dato es correcto
        antes de parsear la información*/
        System.out.println("¿Cuál es tu edad?");
        System.out.println("-------------------------------\n");
        System.out.println("Antes que nada, nostros queremos un número entero pero no sabemos si"
                + " lo meterá con números, con letras o incluso si pondrá puntos decimales");
        System.out.println("Por eso debemos asegurarnos que el dato sea adecuado antes de parsear");
        
        System.out.println("-------------------------------\n");
        System.out.println("Nosotros sólo diremos si es entero o no en este programa, tu tarea es verificar si es congruente y "
                + "si es mayor de edad o no");
        System.out.println("¿Cuál es tu edad?");
        String age = scan.nextLine();
        //Nosotros tenemos esta forma, pero si no es la forma adecuada, ¿Cómo sabremos si no marcará error?
        //Integer.parseInt(age);
        
        /* Una validación eficiente es el try-catch cuando de números se trata */
        System.out.println("¿Es entero? "+ isInteger(age));
    }
    public static final boolean isInteger(String age){
        try{
            Integer.parseInt(age);
        }catch(NumberFormatException e){
            System.out.println("Al parecer no ingresaste un número, hay que recordar que int tiene un límite de dígitos");
            return false;
        }
        return true;
    }
}