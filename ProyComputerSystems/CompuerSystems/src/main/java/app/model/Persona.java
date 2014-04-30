/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author SparKLes
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellido_paterno")
    private String apellido_paterno;
    @Column(name = "apellido_materno")
    private String apellido_materno;
    @Column(name = "dni")
    private String dni;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "celular")
    private String celular;
    @Column(name = "fec_creacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fec_creacion;
    @Column(name = "fec_actualizacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fec_actualizacion;
    @Column(name = "fec_nacimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fec_nacimiento;
    @Column(name = "estado")
    private byte estado;
    
    
    @OneToOne(mappedBy = "persona", fetch = FetchType.LAZY)
    private Usuario usuario;

    public Persona() {
    }

    /*
     public Persona(Object id) {
     this.id = TypesUtil.getDefaultLong(id);
     }
     */
     
    public String getNombreCompleto() {
        return this.nombres + " " + this.apellido_paterno+ " " + this.apellido_materno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFec_creacion() {
        return fec_creacion;
    }

    public void setFec_creacion(Date fec_creacion) {
        this.fec_creacion = fec_creacion;
    }

    public Date getFec_actualizacion() {
        return fec_actualizacion;
    }

    public void setFec_actualizacion(Date fec_actualizacion) {
        this.fec_actualizacion = fec_actualizacion;
    }

    public Date getFec_nacimiento() {
        return fec_nacimiento;
    }

    public void setFec_nacimiento(Date fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
