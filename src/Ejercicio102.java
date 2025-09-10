import java.util.Scanner;

/*
Realiza un programa en Java que pida por teclado el nombre y la edad de una persona mayor de edad (se debe validar el valor introducido) y responda indicando:

Si no está jubilado (edad de jubilación = 65 años), cuántos años le quedan para jubilarse.
Si ya está jubilada indicará cuántos años lleva jubilado.
 */
public class Ejercicio102 {
    public static void main(String[] args) {
        Scanner valor=new Scanner(System.in);
        System.out.println("Digite el nombre de la persona");
        String nombre=valor.nextLine();
        int edad=-1;
        while (edad<18){
            System.out.println("Digite la edad");
            try{
                edad=valor.nextInt();
                if(edad<18)
                    System.out.println("Tiene que ser mayor de edad");
                else if (edad>65)
                    System.out.println("Lleva jubilada desde hace: "+Integer.toString(edad-65));
                else if (edad==65)
                    System.out.println(nombre+ "Se jubila esta año");
                else
                    System.out.println(nombre +"Se va jubilar dentro de "+Integer.toString(65-edad));
            }catch (Exception e){
                System.out.println("Error en el valor introducido");
            }
        }
    }
}
