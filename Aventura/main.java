import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

// Clase abstracta per representar els elements del joc
abstract class ElementoJuego {
    private String nombre;
    private String tipo;

    public ElementoJuego(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}

// Clase concreta per representar las armas
class Arma extends ElementoJuego {
    private int daño;

    public Arma(String nombre, String tipo, int daño) {
        super(nombre, tipo);
        this.daño = daño;
    }

    public int getDaño() {
        return daño;
    }
}

// Clase per representar las armaduras
class Armadura extends ElementoJuego {
    private int defensa;

    public Armadura(String nombre, String tipo, int defensa) {
        super(nombre, tipo);
        this.defensa = defensa;
    }

    public int getDefensa() {
        return defensa;
    }
}

// Clase per representar las pocions
class Poción extends ElementoJuego {
    private int curación;

    public Poción(String nombre, String tipo, int curación) {
        super(nombre, tipo);
        this.curación = curación;
    }

    public int getCuración() {
        return curación;
    }
}

// Clase per representar els personajes
class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private int puntosMana;
    private int ataque;
    private int defensa;
    private int magia;

    public Personaje(String nombre, int nivel, int puntosVida, int puntosMana, int ataque, int defensa, int magia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.puntosMana = puntosMana;
        this.ataque = ataque;
        this.defensa = defensa;
        this.magia = magia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getPuntosMana() {
        return puntosMana;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getMagia() {
        return magia;
    }

    public void atacar(Personaje otro) {
        // Implementacio del metoda atacar
    }

    public void recibirDanyo(int daño) {
        // Implementacio del metodo recibirDanyo
    }

    public void usarMagia(Personaje otro) {
        // Implementacio del metodo usarMagia
    }
}

// Clase per gestionar els elements del joc
class GestorElementosJuego {
    private List<ElementoJuego> elementos;

    public GestorElementosJuego() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoJuego elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(ElementoJuego elemento) {
        elementos.remove(elemento);
    }

    public List<ElementoJuego> getElementos() {
        return elementos;
    }
}

// Clase per gestionar els errors y excepcions
class GestorErrores {
    public void manejarExcepcion(Exception e) {
        // Implementacio del metodo manejarExcepcion
    }

    public void registrarError(String mensaje) {
        // Implementacio del metodo registrarError
    }
}

// Clase per carregar els personajes desde XML
class CargadorXML {
    public List<Personaje> cargarPersonajes(String rutaXML) {
        // Implementacio del metodo cargarPersonajes
    }
}