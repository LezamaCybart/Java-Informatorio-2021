class Empleado { 

    private String nombreYApellido;
    private Integer dni;
    private Integer horasTrabajadas;
    private Float valorPorHora;
    private Float sueldo;

    public Empleado(String nombreYApellido, Integer dni, Integer horasTrabajadas, Float valorPorHora) {
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
        this.sueldo = horasTrabajadas * valorPorHora;
    }

    public Integer getDni() {
        return dni;
    }

    public Float getSueldo() {
        return sueldo;
    }
}

