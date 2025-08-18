package sv.edu.udb.www.sistema_para_rrhh.modelo;

import java.time.LocalDate;

public class Contratacion {
    private int idContratacion;
    private Departamento departamento;
    private Empleado empleado;
    private Cargo cargo;
    private TipoContratacion tipoContratacion;
    private LocalDate fechaContratacion;
    private double salario;
    private boolean estado;

    public Contratacion() {}

    public Contratacion(int idContratacion, Departamento departamento, Empleado empleado, Cargo cargo,
                        TipoContratacion tipoContratacion, LocalDate fechaContratacion,
                        double salario, boolean estado) {
        this.idContratacion = idContratacion;
        this.departamento = departamento;
        this.empleado = empleado;
        this.cargo = cargo;
        this.tipoContratacion = tipoContratacion;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.estado = estado;
    }

    public int getIdContratacion() {
        return idContratacion;
    }

    public void setIdContratacion(int idContratacion) {
        this.idContratacion = idContratacion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public TipoContratacion getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(TipoContratacion tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
