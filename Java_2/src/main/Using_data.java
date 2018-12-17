package main;

public class Using_data {
    //Podemos aprovechar mucho la información
    double pi_plus_five = Math.PI + 5;
    public void demostration(){
        //Generando un número aleatorio
        int random_number = (int) Math.floor(Math.random() * 12);
        System.out.println("Este es el primer random" + random_number);
        
        //Generando un número aleatorio entre dos números
        int random_number_between_range = (int) Math.floor(Math.random() * (50 - 25 + 1))+25;
        /*  (Math.random() * (max - min + 1)) + min;
                            o
            (Math.random() * (max - min)) + min + 1;
        */
        String concatenate = "Estoy uniendo una cadena de carcteres con algo más " + random_number_between_range;
        System.out.println(concatenate);
        
        //Usando booleanos
        boolean is_greater_than_eight = pi_plus_five > 8;
        
        if(is_greater_than_eight)
            System.out.println("Es más grande que 8");
        else
            System.out.println("Es menor o igual a 8");
    }
}