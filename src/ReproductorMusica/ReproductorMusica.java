package ReproductorMusica;

import java.util.Arrays;

public class ReproductorMusica {

    //ATRIBUTOS DE CLASE
    private String[] canciones;
    private int[] cancionesFavoritas;
    private boolean pausado;
    private int cancionReproduciendo;

    //MÉTODO CONSTRUCTOR
    public ReproductorMusica(String[] canciones) {

        this.canciones = canciones;

        this.cancionesFavoritas = new int[this.canciones.length];

        for (int i = 0; i < this.canciones.length; i++) {
            this.cancionesFavoritas[i] = -1;
        }

        this.pausado = true;

        this.cancionReproduciendo = 0;

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

    /*
    public static void main(String[] args) {
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
    }*/
}