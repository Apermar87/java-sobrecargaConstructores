public class App {
    public static void main(String[] args) throws Exception {
        String[] palabras = {"Fisica", "Espacio", "Tiempo"};
        ArticuloCientifico articulo1 = new ArticuloCientifico("La teoría especial de la relatividad", "Albert Einstein", palabras, "Anales de Fisica", 1913, "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales");

        articulo1.imprimir();
    }
}
