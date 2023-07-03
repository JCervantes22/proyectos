package Capitulo_8.ejercicios;

public class Semaforo {
    enum LuzSemaforo {
        ROJO(30),
        VERDE(60),
        AMARILLO(10);

        private int duracion;

        private LuzSemaforo(int duracion) {
            this.duracion = duracion;
        }

        public int getDuracion() {
            return duracion;
        }
    }

    public static void main(String[] args) {
        System.out.println("Las duraciones de las luces del semaforo son:");
        System.out.println("ROJO: " + LuzSemaforo.ROJO.getDuracion() + " segundos");
        System.out.println("VERDE: " + LuzSemaforo.VERDE.getDuracion() + " segundos");
        System.out.println("AMARILLO: " + LuzSemaforo.AMARILLO.getDuracion() + " segundos");
    }
}
