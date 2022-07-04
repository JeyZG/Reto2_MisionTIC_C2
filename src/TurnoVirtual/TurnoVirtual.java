package TurnoVirtual;

import java.util.Arrays;

public class TurnoVirtual {
    //ATRIBUTOS
    private String[] turnos, turnosPerdidos;
    private boolean estadoTurnoVirtual;
    private int turnoEnAtencion, cantidadTurnosAtendidos;

    //MÉTODO CONSTRUCTOR
    public TurnoVirtual(String[] turnos) {

        this.turnos = turnos;

        this.turnosPerdidos = new String[this.turnos.length];

        for (int i = 0; i < this.turnos.length; i++) {
            this.turnosPerdidos[i] = " ";
        }

        this.estadoTurnoVirtual = true;
        this.turnoEnAtencion = 0;
        this.cantidadTurnosAtendidos = 1;
    }

    // GETTERS Y SETTERS
    // GETTERS
    public String[] getTurnos() {
        return turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }

    // SETTERS
    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }

    //MÉTODOS ADICIONALES
    public void atenderProximoTurno(){
        if(this.estadoTurnoVirtual){
            this.turnoEnAtencion++;
            this.cantidadTurnosAtendidos++;
        }
    }

    public void cambiarEstadoTurno(){
        /*
        Otra forma:

        if(this.estadoTurnoVirtual == true){
            this.estadoTurnoVirtual = false;
        }else{
            this.estadoTurnoVirtual = true;
        }


        */
        this.estadoTurnoVirtual = !this.estadoTurnoVirtual;

    }

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarTurnoPerdido() {
        for (int i = 0; i < turnosPerdidos.length; i++) {
            if (" ".equals(turnosPerdidos[i])) {
                turnosPerdidos[i] = turnos[turnoEnAtencion];
                break;
            }
        }
    }

    // METODOS PARA PRUEBAS
    @Override
    public String toString()
    {
        return "Turnos: " + Arrays.toString(this.turnos) + "\n" +
                "Turnos Perdidos: " + Arrays.toString(this.turnosPerdidos) + "\n" +
                "Estado del Turno Virtual: " + this.estadoTurnoVirtual + "\n" +
                "Turno en Atención: " + this.turnoEnAtencion + "\n" +
                "Cantidad de turnos atendidos: " + this.cantidadTurnosAtendidos + "\n";
    }
    /*
    public static void main(String[] args) {
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
    */
}