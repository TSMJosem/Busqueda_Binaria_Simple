public class Main {
    public static void main(String[] args) {
        int[] datos = {10, 100, 35, 60, 75, 45, 15, 16, 28, 95, 74, 20};
        int num_buscado, liminferior, limsuperior;

        limsuperior = datos.length-1;
        //num_buscado = datos[(int) (Math.random() * 11)];
        num_buscado = 200;

        System.out.println("Vamos a buscar el dato " + num_buscado);

        for (liminferior = 0; liminferior<=limsuperior; liminferior++) {
            if (datos[liminferior] == num_buscado) {
                System.out.println("Se ha encontrado el dato en la posición " +
                        liminferior + " de la lista de datos");
                break;
            } else if (liminferior == limsuperior) {
                System.out.println("No se ha encontrado el dato");
            }
        }
        System.out.println("Prueba de commit");
    }
}