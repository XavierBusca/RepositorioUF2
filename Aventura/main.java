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

// Clase per representar las armas
class Arma extends ElementoJuego {
    private int danyo;

    public Arma(String nombre, String tipo, int danyo) {
        super(nombre, tipo);
        this.danyo = danyo;
    }

    public int getDanyo() {
        return danyo;
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
class Pocion extends ElementoJuego {
    private int curacion;

    public Pocion(String nombre, String tipo, int curacion) {
        super(nombre, tipo);
        this.curacion = curacion;
    }

    public int getCuracion() {
        return curacion;
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

    public void recibirDanyo(int danyo) {
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
        System.out.println("Hi ha hagut un error.");
    }
}
