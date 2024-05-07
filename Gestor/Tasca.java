
public class Tasca {
    private int id;
    private String descripcio;
    private Prioritat prioritat;
    private boolean completada;

    public Tasca(int id, String descripcio, Prioritat prioritat) {
        this.id = id;
        this.descripcio = descripcio;
        this.prioritat = prioritat;
        this.completada = false;
    }

}