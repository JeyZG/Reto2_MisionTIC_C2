import Peaje.*;
import ReproductorMusica.*;
import TurnoVirtual.*;

public class Reto2_tester {
    public static void main(String[] args) {
        
        Peaje_tester();
        ReproductorMusica_tester();
        TurnoVirtual_tester();

    }

    public static void Peaje_tester(){
        String[] filaCoches = {"FNC901", "RBP250", "TPS706", "ITN503", "RSP845", "SBL560",
                "IVD432", "LCS254", "ECT243", "RPL122", "FRS484", "TBL884",
                "NFT948", "INS230"};

        Peaje taquillaPeaje = new Peaje(filaCoches);

        System.out.println(taquillaPeaje);

        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();

        taquillaPeaje.agregarCocheFlyPass();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();

        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();

        System.out.println(taquillaPeaje);
    }

    public static void ReproductorMusica_tester(){
        String[] cancionesEscogidas = {
            "Mil horas",
            "Por ese hombre",
            "A esa",
            "Algo de mi",
            "Si me dejas ahora",
            "¿Quieres ser mi amante?",
            "Quel sorriso in volto",
            "Per una notte insieme",
            "Como un pintor",
            "Sencillamente",
            "Un segundo",
            "Enciéndeme",
            "Cuando me enamoro",
            "Tu eres mi tesoro",
            "Piccola anima",
            "Solo a ti pertenezco",
            "Todos por todos"
        };

        ReproductorMusica ventana1 = new ReproductorMusica(cancionesEscogidas);

        System.out.println(ventana1);

        //Screenshot 2
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();

        //Screenshot 3
        ventana1.agregarCancionesFavoritas();
        ventana1.proximaCancion();
        ventana1.agregarCancionesFavoritas();
        ventana1.devolverCancion();
        ventana1.agregarCancionesFavoritas();

        //Screenshot 4
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();

        System.out.println(ventana1);
    }

    public static void TurnoVirtual_tester(){
        String[] cola = {"A0", "A1", "A2", "A3", "A4", "A5",
                "A6", "A7", "A8", "A9", "A10", "A11"};

        TurnoVirtual turnoVirtual1 = new TurnoVirtual(cola);

        System.out.println(turnoVirtual1);

        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.atenderProximoTurno();

        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.agregarTurnoPerdido();

        turnoVirtual1.cambiarEstadoTurno();
        turnoVirtual1.atenderProximoTurno();
        turnoVirtual1.cambiarEstadoTurno();

        System.out.println(turnoVirtual1);
    }
}
