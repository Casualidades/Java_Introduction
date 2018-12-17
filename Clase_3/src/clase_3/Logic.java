package clase_3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Logic {
    /* Para leer datos tenemos diversas formas, empezaremos con programa en consola */
    
    //Scanner
    //Mostrar en persona los parámetros que recibe
    Scanner scan = new Scanner(System.in);
    
    /* Métodos de scanner */
    public void scannerMethods(){
        //variables
        int number;
        String the_first_word, text;
        //Proceso
        System.out.println("En realidad este código está mal, lo arreglaremos en persona");
        System.out.println("Métodos de scanner");
        System.out.println("-------------------------------");
        /* 
            Después de un nextInt siempre va un scan.nextLine()
            explicar en persona mejor: Siempre que introduces un texto o número,
            se lee el texto ingresado y una línea vacía. Esto afecta a scan.nextLine();
        */
        System.out.println("Leer enteros con scanner.nextInt()");
        number = scan.nextInt();
        System.out.println("Nota: Así como puede leer enteros puede leer floats, doubles, longs, etc");
        System.out.println("Modifica este código para leer cada uno de ellos");
        System.out.println("-------------------------------\n");
        System.out.println("Leer la primera palabra de una oración con scanner.next()");
        the_first_word = scan.next();
        System.out.println("-------------------------------");
        System.out.println("Leer cadena de caracteres con scanner.nextLine()");
        text = scan.nextLine();
        System.out.println("-------------------------------\n");
        System.out.println("Los valores que ingresaste son: " + number + ", " + the_first_word + ", " + text);
        
        System.out.println("-------------------------------\n");
        System.out.println("Ahora llama al otro método");
    }
    /* Métodos de JOptionPane*/
    public void JOptionPaneMethods(){
        JOptionPane.showMessageDialog(null, "Iremos explicando los métodos de JOptionPane, empezaremos con las confirmaciones");
        int selected_1 = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir sin guardar?", "Mi programita :3", 1);
        System.out.println("Las opciones te las mostrará así: \n0 será la primera opción, 1 la segunda y 2 la tercera");
        System.out.println("En este caso tú elegiste: " + selected_1);
        
        int selected_2 = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir sin guardar?", "Mi programita :3", 0);
        System.out.println("Las opciones te las mostrará así: \n0 será la primera opción, 1 la segunda");
        System.out.println("En este caso tú elegiste: " + selected_2);
        
        JOptionPane.showMessageDialog(null, "Seguimos con la entrada de datos");
        String text = JOptionPane.showInputDialog(null, "Ingresa algún texto");
        System.out.println("El texto ingrtesado fue:\n\"" + text + "\"");
        
        System.out.println("Tenemos características que le podemos agregar a nuestros mensajes");
        String text_2 = JOptionPane.showInputDialog(null, "Ingresa otro texto, ese no me gustó", "Título :3", JOptionPane.ERROR_MESSAGE);
        System.out.println("El texto ingrtesado fue:\n\"" + text_2 + "\"");
        
        JOptionPane.showMessageDialog(null, "Seguimos con un select en JOptionPane");
        //Este es un Array de Strings, los arreglos los veremos más adelante
        String[] carreras = {
            "Ingeniería en sistemas computacionales",
            "Ingeniería industrial",
            "Ingeniería en mecatrónica",
            "Ingeniería en informatica",
            "Ingeniería petroquímica"
        };
        String career = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);
        System.out.println("Elegiste esta opción:\n\"" + career + "\"");
        
        JOptionPane.showMessageDialog(null, "Por último varias opciones");
        String[] options = {"1810", "1811", "1821", "Ninguna de las anteriores"};
        int selected_option = JOptionPane.showOptionDialog(null, "¿Cuándo termino la guerra de independencia de México?", "Examen", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        System.out.println("Usted eligió:\n\"" + options[selected_option] + "\"");
        
        System.out.println("-------------------------------\n");
        System.out.println("Hay muchas otras formas de ingresar datos, algunas de ellas las veremos después");
    }
}