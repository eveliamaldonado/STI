package include;

public class Datos_Personales {
    private int id_datos;
    private String nombre;
    private String A_paterno;
    private String A_materno;
    private int Edad;
    private int id_tipo;
    private int id_usuario;

    public int getId_datos() {
        return id_datos;
    }

    public void setId_datos(int id_datos) {
        this.id_datos = id_datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_paterno() {
        return A_paterno;
    }

    public void setA_paterno(String a_paterno) {
        A_paterno = a_paterno;
    }

    public String getA_materno() {
        return A_materno;
    }

    public void setA_materno(String a_materno) {
        A_materno = a_materno;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Datos_Personales(int id_datos, String nombre, String a_paterno, String a_materno, int edad, int id_tipo, int id_usuario) {
        this.id_datos = id_datos;
        this.nombre = nombre;
        A_paterno = a_paterno;
        A_materno = a_materno;
        Edad = edad;
        this.id_tipo = id_tipo;
        this.id_usuario = id_usuario;

    }
}


