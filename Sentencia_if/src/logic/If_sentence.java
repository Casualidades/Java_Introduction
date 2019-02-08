package logic;

import java.util.Scanner;

public class If_sentence {
    Scanner scanner = new Scanner(System.in);
    public void printMe(){
        System.out.println("Presiona enter para continuar después de cada impresión. El programa termina hasta el \"Fin\" que escribiré abajo");
        scanner.nextLine();
        System.out.println("La sentencia if nos ayuda para hacer decisiones lógicas, su estructura básica es la siguiente:\n"
                + "if( condición ){\n"
                + "    Instrucciones\n"
                + "}");
        scanner.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Puedes hacer más compleja la estructura de los if añadiendo:\n"
                + "  •  else if( condición ){\n"
                + "         Instrucciones\n"
                + "     }\n"
                + "  •  else{\n"
                + "         Instrucciones\n"
                + "     }");
        scanner.nextLine();
        System.out.println("La sentencia else if nos sirve para agregar una condición si la o las condiciones anteriores no se cumplieron");
        scanner.nextLine();
        System.out.println("La sentencia else, nos sirve para especificar en caso de que no se cumpla ninguna condición");
        scanner.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Para construir la sentencia if se requiere un valor que arroje un verdadero o un falso");
        scanner.nextLine();
        System.out.println("Se pueden usar booleanos (true y false) u operadores lógicos");
        scanner.nextLine();
        System.out.println("¿Qué son los operadores lógicos?");
        scanner.nextLine();
        logicOperators();
        System.out.println("FIN");
    }
    public void logicOperators(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Hay muchos operadores lógicos, ahorita veremos los más esenciales");
        scanner.nextLine();
        System.out.println("Operadores lógicos matemáticos");
        System.out.println("  •  Mayor que: \">\" sirve para saber si un número es mayor a otro");
        scanner.nextLine();
        System.out.println("Ahora, tú dime para qué sirven los siguientes ♥");
        System.out.println("  •  Mayor o igual que: \">=\"");
        scanner.nextLine();
        System.out.println("  •  Menor que: \"<\"");
        scanner.nextLine();
        System.out.println("  •  Menor o igual que: \"<=\"");
        scanner.nextLine();
        System.out.println("  •  Igual: \"==\"\n");
        scanner.nextLine();
        System.out.println("Es necesario remarcar que se ponen dos veces el signo de igual porque "
                + "un solo signo sirve para asignar valores");
        scanner.nextLine();
        System.out.println("  •  Diferente de: \"!=\"\n");
        scanner.nextLine();
        System.out.println("IMPORTANTE: Los últimos dos sirven para comparar tanto números como variables \"char\"");
        scanner.nextLine();
        System.out.println("----------------------------------------------------------------\n");
        System.out.println("Hay otros operadores lógicos, que sirven para comparar diferentes cosas");
        scanner.nextLine();
        System.out.println("  •  Equals : if( variable.equals() )");
        System.out.println("            Este método sirve para saber si un texto es igual a otro importando mayúsculas y minúsculas");
        scanner.nextLine();
        System.out.println("  •  EqualsIgnoreCase : if( variable.equalsIgnoreCase() )");
        System.out.println("            Este método sirve para saber si un texto es igual a otro sin importar mayúsculas o minúsculas");
        scanner.nextLine();
        System.out.println("  •  Contains : if( variable.contains() )");
        System.out.println("            Este método sirve para saber si un texto tiene un caracter o caracteres en específico");
        scanner.nextLine();
        System.out.println("  •  Is empty : if( variable.isEmpty() )");
        System.out.println("            Este método sirve para saber si la longitud de algo es 0, o sea, no existe un valor");
        scanner.nextLine();
        
    }
}