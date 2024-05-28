package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!!" );
        
        
        //Tipo de datos primitivos: No tiene propiedades ni metodos: ejemplo
        int a = 10;
        
        //Los tipos de datos objetos que son un envoltorio de los tipos primitivos
        // si tienen propiedades y metodos. Por cada tipo primitivo existe un tipo objeto correspondiente.
        
        Integer b = 20;
        b.getClass();
        
        //para almacenar un valor en un float, hay que especificar un sufijo (f oF) por que de lo contrario
        //considera el valor como un double, y un double no se puede almacenar en un flotante.
        
        //"el double es mas grande que un float"
        
        float c = 2.3f;
        //si no ponemos la f , hacemos un casteo = float d = (float) 2.3;
        
        //Tipo de dato : Array
    }
}
