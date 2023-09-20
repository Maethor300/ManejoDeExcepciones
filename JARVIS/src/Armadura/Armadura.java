package Armadura;

import Botas.Botas;
import Consola.Consola;
import Guantes.Guantes;
import Sintetizador.Sintetizador;
import java.util.Scanner;
public class Armadura {
    private float bateria = Float.MAX_VALUE;
    private int nivelResistencia = 100;
    private Botas botas;
    private Consola consola;
    private Guantes guantes;
    private Sintetizador sintetizador;
    public Armadura() {
    }
    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public int getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(int nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }
}
