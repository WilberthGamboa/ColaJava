

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Controlador {

    private Queue<Long> cola  =new LinkedList<Long>();

    public Controlador() {

    }
    

    public void eleccion() {
        int opcion;
        long valorPila; 
        Scanner reader = new Scanner(System.in);
        Scanner readerFunciones = new Scanner(System.in);

        System.out.println(
                "1)Agregar, 2)Eliminar 3)Consultar Top 4)Consultar Vacio 5)Salir del programa");
        try {
            do {
                System.out.println("Inserte la opcion");
                opcion = reader.nextInt();

                switch (opcion) {
                    case 1:
                        
                            System.out.println("Inserte el valor a agregar");
                            valorPila = readerFunciones.nextLong();
                            cola.add(valorPila);

                  

                        break;
                    case 2:

                        if (cola.isEmpty()) {
                            System.out.println("Cola vacia, no se puede eliminar");
                        } else {
                            System.out.println("Se ha eliminado el valor " + cola.peek());
                            cola.remove();
                        }

                        break;
                    case 3:
                    if (cola.isEmpty()) {
                        System.out.println("Cola vacia, no hay tope");
                    } else {
                        System.out.println("El tope es: " + cola.peek());
                    }

                        

                        break;
                    case 4:
                        if (cola.isEmpty()) {
                            System.out.println("La Cola está vacía");
                        } else {
                            System.out.println("La cola no está vacía y el tope es:" + cola.peek());
                            
                        }
                        break;
                    case 5:
                        
                        break;
                   

                    default:
                        break;

                }

            } while (opcion != 5);

        } catch (Exception e)  {
            reader.close();
            readerFunciones.close();
            
        }

    }

}