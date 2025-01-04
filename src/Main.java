public class Main {
    public static void main(String[] args) {
        int i, j, num_Buscado, mitad;
        int[] datos = {5, 6, 7, 8, 9, 10, 11};

        num_Buscado = 5;

        i = 0;
        j = datos.length - 1;

        mitad = (i + j)/2;

        while (i!=j) {
            if (num_Buscado > datos[mitad]) {
                i = mitad + 1;

                mitad = (i + j)/2;
            }
            else if (num_Buscado < datos[mitad]) {
                j = mitad - 1;

                mitad = (i + j)/2;
            }
        }
        if (datos[mitad] == num_Buscado) {
            System.out.println("Felicidades, hemos encontrado el dato " + num_Buscado +
                    " está en la posición " + mitad + " de la lista de datos");
        }
        else {
            System.out.println("No se ha encontrado el dato que se está buscando");
        }
    }
}