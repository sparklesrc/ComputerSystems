/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author SparKLes
 */
@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "razon_social")
    private String razon_social;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "sede_central")
    private String sede_central;
    @Column(name = "repre_legal")
    private String repre_legal;
    @Column(name = "nro_adm")
    private Integer nro_adm;
    @Column(name = "nro_emp")
    private Integer nro_emp;
    @Column(name = "email")
    private String email;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "celular")
    private String celular;
    @Column(name = "fecha_creacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_creacion;
    @Column(name = "fecha_actualizacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_actualizacion;
    @Column(name = "estado")
    private Byte estado;

    public String getSede_central() {
        return sede_central;
    }

    public void setSede_central(String sede_central) {
        this.sede_central = sede_central;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRepre_legal() {
        return repre_legal;
    }

    public void setRepre_legal(String repre_legal) {
        this.repre_legal = repre_legal;
    }

    public Integer getNro_adm() {
        return nro_adm;
    }

    public void setNro_adm(Integer nro_adm) {
        this.nro_adm = nro_adm;
    }

    public Integer getNro_emp() {
        return nro_emp;
    }

    public void setNro_emp(Integer nro_emp) {
        this.nro_emp = nro_emp;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        //Long time = System.currentTimeMillis();
        //time.
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }
}
