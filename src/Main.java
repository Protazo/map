import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private Map<Integer, Ubicacion> ubicaciones = new HashMap<>();

    public Main() {
        ubicaciones.put(0, new Ubicacion(0, "Estás sentado en la clase de programación"));
        ubicaciones.put(1, new Ubicacion(1, "Estás en la cima de una montaña"));
        ubicaciones.put(2, new Ubicacion(2,"Estás bañándote en la playa"));
        ubicaciones.put(3, new Ubicacion(3,"Estás dentro de un edificio muy alto"));
        ubicaciones.put(4, new Ubicacion(4, "Estás de pie en un puente"));
        ubicaciones.put(5, new Ubicacion(5, "Estás en un bosque"));

        ubicaciones.get(1).addExit("N", 5);
        ubicaciones.get(1).addExit("S", 4);
        ubicaciones.get(1).addExit("E", 3);
        ubicaciones.get(1).addExit("O", 2);
        ubicaciones.get(1).addExit("Q", 0);

        ubicaciones.get(2).addExit("N", 5);
        ubicaciones.get(2).addExit("Q", 0);

        ubicaciones.get(3).addExit("O", 1);
        ubicaciones.get(3).addExit("Q", 0);

        ubicaciones.get(4).addExit("N", 1);
        ubicaciones.get(4).addExit("O", 2);
        ubicaciones.get(4).addExit("Q", 0);

        ubicaciones.get(5).addExit("O", 2);
        ubicaciones.get(5).addExit("S", 1);
        ubicaciones.get(5).addExit("Q", 0);
    }
    static void main() {

        Map<Integer, Ubicacion> ubicaciones = new Main().ubicaciones;
        Scanner scan = new Scanner(System.in);



        int op = 1;
        String opcion = "";



            while (!opcion.equalsIgnoreCase("Q")) {
                try {
                    System.out.println(ubicaciones.get(op).getDescripcion());

                    for (Map.Entry<Integer, Ubicacion> x : ubicaciones.entrySet()) {

                        if (x.getValue().getId() == op) {
                            System.out.println(x.getValue().getExits());

                            System.out.println("De las que han salido, ¿cuál quieres probar?");
                            opcion = scan.nextLine();

                            opcion = opcion.toUpperCase();

                            op = x.getValue().getExits().get(opcion);
                            System.out.println(op);
                            break;
                        }

                    }

                } catch (NullPointerException e) {
                    System.out.println("Esa no es una opción válida, elige de las que salen en pantalla.");
                }
            }

        System.out.println(ubicaciones.get(0).getDescripcion());









    }
}
