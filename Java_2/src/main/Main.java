/*  
    El package nos ayuda a reconocer más fácilmente la estructura del proyecto.
    Si nosotros tenemos muchas carpetas por el package podemos acceder al contenido
    de diferentes directorios
*/
package main;
/*
    Las clases son muy importantes en la programación orientada a objetos, por estándar
    la clase principal del proyecto la nombramos "Main", si es un proyecto web, se nombra
    "index"
 */
public class Main {
    /*
        public:
            se puede acceder al elemento desde cualquier archivo.
        protected:
            se puede acceder al elemento desde cualquier archivo DENTRO del package.
        private:
            se puede acceder al elemento desde cualquier archivo DENTRO de la CLASE.
    
        Para acceder a private (también protected) existen los métodos get y set. Los veremos
        en otra ocasión
    
        static: 
            Ayuda a hacer el uso de memoria más eficiente
            Puede ser accedido o invocado sin instanciar a la clase como objeto anteriormente;
            un ejemplo es la librería java.lang.Math, de la cual puedes acceder a sus elementos
            directamente
        
        final:
            Hay que distiguir el concepto de variable y constante, digamos que nosotros vamos
            a usar la gravedad y la masa de un objeto cualquiera, la masa depende del objeto
            puede variar, la gravedad será una constante (ignorando la altura a la que estemos)
            final nos ayuda a decir que no es una variable y que ese valor no podrá ser modificado
        
        Explicar en persona los estándares para nombrar
     */
    public static void main(String[] args) {
        /* Si nosotros queremos crear métodos para llamarlos aquí, deberán de ser estáticos */
        addition(8, 10);
        /*  Como restar NO es estático, no podemos llamarlo
            Si descomentas la línea de abajo, abrá un erros, pues no se reconoce el método 
        */
        //substraction(6, 4);
    }
    public static void addition(int num_1, int num_2){
        System.out.println(num_1 + num_2);
    }
    public void substraction(int num_1, int num_2){
        System.out.println(num_1 - num_2);
    }
}
/*
    Ejercicios a poner:
        Sumar un número n veces
        Sumar varios números
        Mayor o menor que
        Decir si es mayor de edad
        Saber si la cadena es mayor a tantos caracteres
        Comprobar cada caracter de una cadena si es número o letra o algo símbolo
        Leer tres números y comprobar si la hora es válida
        Mostrar números del 1 al 100 usando for, while y do while
        Leer 10 números entre 0 y 100 y contar cuántos son mayores a 60 y cuántos menores a 40
        Hallar área y perímetro de un triángulo, de un cuadrado, de un círculo y de un rectángulo
        Mostrar números divisibles entre 7 del 8 al 300
        De esos mismos números imprimir los que son pares
        Calcular factorial de un número menor a 15
        Calcular el residuo de una división
        Calcular IMC de una persona
        Calcular valores de x usando la fórmula general;
        
    Ejercicios a poner 2:
        Calcular media de un array
        Leer 10 números y calcular la media de los positivos y de los negativos
        Guardar en un Array los primeros 20 números divisibles entre 15
        Llenar un array con números aleatorios
        Contar el números de palabras en una oración
        Contar el número de veces que aparece un carácter en un texto
        Hacer una calculadora sencilla
        Validar datos
    Ejercicios a poner 3:
        Practicar herencia, profesor, alumno y persona
*/