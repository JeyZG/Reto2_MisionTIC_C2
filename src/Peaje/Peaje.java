package Peaje;

import java.util.Arrays; // Para usar la linea 46
import org.apache.commons.lang3.ArrayUtils; // Para usar la linea 49

public class Peaje {

    //ATRIBUTOS DE CLASE
    private String[] filaCoches, cochesFlyPass;
    private boolean estadoPeaje;
    private int cantidadCochesAtendidos, cocheEnAtencion;

    //MÉTODO CONSTRUCTOR
    public Peaje(String[] filaCoches) {

        this.filaCoches = filaCoches;

        this.cochesFlyPass = new String[this.filaCoches.length];
        for (int i = 0; i < this.filaCoches.length; i++) {
            this.cochesFlyPass[i] = " ";
        }

        this.estadoPeaje = true;
        this.cocheEnAtencion = 0;
        this.cantidadCochesAtendidos = 1;
    }

    // METODOS ADICIONALES
    public void proximoCoche(){
        if(this.estadoPeaje){
            this.cocheEnAtencion++;
            this.cantidadCochesAtendidos++;
        }
    }

    public void agregarCocheFlyPass(){
        String cocheABuscar = this.filaCoches[cocheEnAtencion];
        for(String coche:this.cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                //coche = cocheABuscar;

                // Usando la libreria java.util.Arrays
                //this.cochesFlyPass[Arrays.asList(this.cochesFlyPass).indexOf(" ")] = cocheABuscar;

                // Usando la libreria org.apache.commons.lang3 -> Descargar .jar
                this.cochesFlyPass[ArrayUtils.indexOf(this.cochesFlyPass, " ")] = cocheABuscar;

                break;
            }

        }
    }

    public void cambiarEstadoPeaje(){
        this.estadoPeaje = !this.estadoPeaje;
    }

    // GETTERS Y SETTERS
    // GETTERS
    public String[] getFilaCoches() {
        return filaCoches;
    }
    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public int getCantidadCochesAtendidos() {
        return cantidadCochesAtendidos;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    // SETTERS
    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public void setCantidadCochesAtendidos(int cantidadCochesAtendidos) {
        this.cantidadCochesAtendidos = cantidadCochesAtendidos;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }

    // METODOS PARA PRUEBA
    @Override
    public String toString() {

        return "Fila de coches: " + Arrays.toString(this.filaCoches) + "\n" +
                "Coches con FlyPass: " + Arrays.toString(this.cochesFlyPass) + "\n" +
                "Estado del peaje: " + this.estadoPeaje + "\n" +
                "Coche en atención: " + this.cocheEnAtencion + "\n" +
                "Cantidad coches atendidos: " + this.cantidadCochesAtendidos + "\n";
    }
}