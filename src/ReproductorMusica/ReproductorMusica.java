package ReproductorMusica;

import java.util.Arrays;

public class  ReproductorMusica {

    //ATRIBUTOS DE CLASE
    private String[] canciones;
    private int[] cancionesFavoritas;
    private boolean pausado=true;
    private int cancionReproduciendo=0;

    //MÉTODO CONSTRUCTOR
    public ReproductorMusica(String[] canciones) {

        this.canciones = canciones;

        this.cancionesFavoritas = new int[this.canciones.length];

        for (int i = 0; i < this.canciones.length; i++) {
            this.cancionesFavoritas[i] = -1;
        }
    }

    //MÉTODOS ADICIONALES
    public void proximaCancion(){
        this.cancionReproduciendo = (this.cancionReproduciendo + 1) % this.canciones.length;
    }

    public void devolverCancion(){
        this.cancionReproduciendo = (this.cancionReproduciendo + this.canciones.length - 1) % this.canciones.length;
    }

    public void cambiarEstadoReproduccion(){
        this.pausado = !this.pausado;
    }

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < cancionesFavoritas.length; i++)
            /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/
            if(cancionesFavoritas[i] == cancionReproduciendo)
                return;
                //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if(cancionesFavoritas[i] == -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                return;
            }
    }

    // GEETERS Y SETTERS
    public String[] getCanciones() {
        return this.canciones;
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

    public int[] getCancionesFavoritas() {
        return this.cancionesFavoritas;
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public boolean isPausado() {
        return this.pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    public int getCancionReproduciendo() {
        return cancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        this.cancionReproduciendo = cancionReproduciendo;
    }

    // METODOS PARA PRUEBAS
    @Override
    public String toString()
    {
        return "Canciones: " + Arrays.toString(this.canciones) + "\n" +
                "Canciones favoritas: " + Arrays.toString(this.cancionesFavoritas) + "\n" +
                "Pausado: " + this.pausado + "\n" +
                "Cancion en reproduccion: " + this.cancionReproduciendo + "\n";
    }
}