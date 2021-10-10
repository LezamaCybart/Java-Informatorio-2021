public class Persona { 
    private String nombreYApellido;
    private Integer edad;
    private String direccion;
    private String ciudad;

    public Persona(String nombreYApellido, Integer edad, String direccion, String ciudad) {
        this.nombreYApellido = nombreYApellido;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return (String.format("{%s}-{%s}-{%d}-{%s}", this.ciudad, this.direccion, this.edad, this.nombreYApellido));
    }
}

