package umg.renato;

/**
 * Created by IT DASA on 28/06/2017.
 */
public class Deporte {

    private String Nombre;
    private Boolean conBalon = Boolean.FALSE;

    public Deporte() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Boolean getConBalon() {
        return conBalon;
    }

    public void setConBalon(Boolean conBalon) {
        this.conBalon = conBalon;
    }


}
