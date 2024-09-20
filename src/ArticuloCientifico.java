public class ArticuloCientifico {
    private String titulo;
    private String autor;
    private String[] palabrasClaves = new String[3];
    private String nombrePublicacion;
    private int año;
    private String resumen;
    
    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String nombrePublicacion, int año) {
        this(titulo, autor);
        this.palabrasClaves = palabrasClaves;
        this.nombrePublicacion = nombrePublicacion;
        this.año = año;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String nombrePublicacion, int año, String resumen) {
        this(titulo, autor, palabrasClaves, nombrePublicacion, año);
        this.resumen = resumen;
    }

    public void imprimir(){
        System.out.println("Nombre del artículo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras clave: ");
        for (int i =0; i<palabrasClaves.length; i++){
            System.out.println(palabrasClaves[i]);
        }
        System.out.println("Nombre de la publicación: " + nombrePublicacion);
        System.out.println("Año: " + año);
        System.out.println("Resumen: " + resumen);
    }
}
