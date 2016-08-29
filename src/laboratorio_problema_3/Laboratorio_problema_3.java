/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_problema_3;

/**
 *
 * @author Juan Felipe Fontecha Vasquez
 * @since 28-08-2016
 * @version 1.1
 */
public class Laboratorio_problema_3 {

    /**
     * @param args the command line arguments
     */

        //aca se encuentran las relaciones como se piden en el ejercicio (español-otro idioma)
        //se colocarian aca cualquier adicion en significado teniendo en cuenta a que idioma se traduce
        public static void diccionarios(){
        String [ ]significado_ing = new String [3];
        significado_ing[0]= "hola"+ " "+"hello";
        significado_ing[1]= "mundo"+" "+"world";
        significado_ing[2]= "yo"+" "+"i";
        String [ ]significado_fran = new String [3];
        significado_fran[0]= "estoy"+" "+"suis";
        significado_fran[1]= "muy"+" "+"très";
        significado_fran[2]= "bien"+" "+"bien";
        String [ ]significado_ita = new String [3];
        significado_ita[0]= "y"+" "+"e";
        significado_ita[1]= "algo"+" "+"qualcosa";
        significado_ita[2]= "tranquilo"+" "+"tranquillo";
    }
        public static int numero_espacios(String x){
            int a=0;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i)==' ') {
                    a++;
                }
            }
            return a;
        }
    
    
    //para poder sabar las palabras individuales de las cadenas con espacios
    //la "y" esta para ser la variable contadora y revisar que se vea cada palabra de la cadena que este separada por un espacio
    static String separacion_palabra(String x, int y) {
        int c = 0;
        int t = 0;
        while (c < y) {
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == ' ' && i != 0) {
                    c++;
                    t = i;
                }
            }
        }
        String a;
        String b = "";
        for (int i = t; i < x.length(); i++) {
            if (x.charAt(i) == ' ' && i != t) {
                return b;
            } else {
                a = b;
                b = a + x.charAt(i);
            }
        }
        return b;
    }

    static String separacion_primera_palabra(String x) {
        String a;
        String b = "";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ' && i != 0) {
                return b;
            } else {
                a = b;
                b = a + x.charAt(i);
            }
        }
        return b;
    }
    
    static String Traducir(int a, int b, String y){
        String x;
        switch(a){
            case 1:x=aux_1(y, b); 
                break;
            case 2:x=aux_2(y, b);
                break;
            case 3:x=aux_3(y, b);
                break;
            default:x=aux_4(y, b);
        }
        return x;
    }
    //Del español
    static String aux_1(String x, int y){
        String a="";
        //no encontre una mejor manara de que reconociera los significados
        //cuando se logre funcionar este se colocaran esta informacion en las demas funciones aux
        String [ ]significado_ing = new String [3];
        significado_ing[0]= "hola"+ " "+"hello";
        significado_ing[1]= "mundo"+" "+"world";
        significado_ing[2]= "yo"+" "+"i";
        String [ ]significado_fran = new String [3];
        significado_fran[0]= "estoy"+" "+"suis";
        significado_fran[1]= "muy"+" "+"très";
        significado_fran[2]= "bien"+" "+"bien";
        String [ ]significado_ita = new String [3];
        significado_ita[0]= "y"+" "+"e";
        significado_ita[1]= "algo"+" "+"qualcosa";
        significado_ita[2]= "tranquilo"+" "+"tranquillo";
        switch(y){
            //al ingles
            case 1:
                    //la condicion biene dada por la cantidad de traducciones posibles, si se quiere meter mas se necesita cambiarla
                    for (int j = 0; j < 3; j++) {
                          if (separacion_palabra(x,0).equalsIgnoreCase(separacion_primera_palabra(significado_ing[j]))) {
                            //el 1 esta porque de esta manera retorna la segunda parte de la cadena dada en los arreglos de significado
                            a= separacion_palabra(significado_ing[j], 1);
                            System.out.println(a);
                            return a;
                          }  
                    }
            //al frances
            case 2:
                for (int j = 0; j < 3; j++) {
                          if (separacion_palabra(x,0).equalsIgnoreCase(separacion_primera_palabra(significado_fran[j]))) {
                            a= separacion_palabra(significado_fran[j], 1);
                            System.out.println(a);
                            return a;
                          }  
                    }
            //al italiano
            default:
                for (int j = 0; j < 3; j++) {
                          if (separacion_palabra(x,0).equalsIgnoreCase(separacion_primera_palabra(significado_ita[j]))) {
                            a= separacion_palabra(significado_ita[j], 1);
                            System.out.println(a);
                            return a;
                          }  
                    }
        }
        System.out.println(a);
        return a;
    }
    //Del ingles
    static String aux_2(String x, int y){
        String a;
        switch(y){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
    }
    //Del frances
    static String aux_3(String x, int y){
        String a;
        switch(y){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
    }
    //Del italiano
    static String aux_4(String x, int y){
        String a;
        switch(y){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
    }
    
    static void tra_al(int x){
        String a;
        switch(x){
            case 1: a= "1) Ingles 2) Frances 3) Italiano";
                    break;
            case 2: a= "1) Español 2) Frances 3) Italiano";
                    break;
            case 3: a= "1) Español 2) Ingles 3) Italiano";
                    break;
            default: a= "1) Español 2) Ingles 3) Frances";
        }
        System.out.println(a);;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner teclado= new java.util.Scanner(System.in);
        //presentacion y recoleccion de datos
        System.out.println("Traductor");
        System.out.println("Traducir del: 1) Español 2) Ingles 3) Frances 4) Italiano");
        int del = teclado.nextInt();
        System.out.println("Traducir al: ");
        tra_al(del);
        int al = teclado.nextInt();
        System.out.println("Introdusca la palabra o frase a taducir: ");
        String expresion = teclado.next();
        //programa
        Traducir(del,al, expresion);
        
    
        
    }
    
}
