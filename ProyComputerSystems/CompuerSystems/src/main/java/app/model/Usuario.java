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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author SparKLes
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "pass")
    private String pass;
    @Column(name = "tipo_usuario")
    private Integer tipo_usuario;
    @Column(name = "fec_creacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fec_creacion;
    @Column(name = "fec_actualizacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fec_actualizacion;
    @Column(name = "estado")
    private Integer estado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona persona;

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Usuario() {
    }

    /*
     public Usuario(Object id) {
     this.id = TypesUtil.getDefaultLong(id);
     }
     */
    public Long getId() {
        return id;
    }

    public Integer getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(Integer tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
