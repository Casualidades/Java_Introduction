package main;

public class Type_of_data {
    /*
        Tenemos muchos tipos de datos:
        Las reglas son sencillas:
        
        No puede empezar con caracteres especiales o numeros,
        sin embargo, puede iniciar con "$" ó "_"
        
        No puede haber dos variables con el mismo nombre en el mismo nivel
    */
    boolean exists; // Almacena un valor verdadero o falso
    boolean _exists; //Es diferente por tener el "_" al inicio, si se lo quitamos marca error
    int $money; //Almacena un valor entero
    float weight; // Almacena un valor decimal
    double height; // Almacena un valor decimal
    char c; //Almacena un solo caracter
    String chain; //Almacena una cadena de valores o nulos
    /* 
        ¿Diferencia entre float y double?
        Double usa más memoria pero es más específico y puede guardar
        valores más grandes y con más decimales.
    */
    public void assignValues(){
        exists = false;
        _exists = true;
        $money = 20;
        //weight = 20.0;
        /*  Por default en JAVA todos los valores con punto decimal se consideran como
            double, para eso hacemos el cast, Te lo mostraré en persona
        */
        height = 30.0;
        c = 'a';
        chain = "Hola";
    }
}
