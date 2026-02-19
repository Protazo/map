import java.util.HashMap;
import java.util.Map;

public class Ubicacion {
    int id;
    String descripcion;
    Map<String, Integer> exits = new HashMap<>();

    public Ubicacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void addExit(String direccion, int idUbicacion) {
        exits.put(direccion, idUbicacion);
    }

    public Map<String, Integer> getExits() {
        return exits;
    }
}
