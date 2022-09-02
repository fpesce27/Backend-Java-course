package com.proyecto.main.model;

import com.proyecto.main.api.service.PrecioDolar;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

import static com.proyecto.main.model.Dolar.precio;

@Entity
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;
    @NotNull
    private float precio_en_pesos;

    public float getPrecio_en_dolares() {
        return precio_en_pesos / precio;
    }

    public void setPrecio_en_dolares(float precio_en_dolares) {
        this.precio_en_dolares = precio_en_pesos / precio;
    }

    @Transient
    private float precio_en_dolares = precio_en_pesos / precio;

    private String img;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<Usuario> usuario;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario.add(usuario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_en_pesos() {
        return precio_en_pesos;
    }

    public void setPrecioPesos(float preciosPesos) {
        this.precio_en_pesos = preciosPesos;
    }
}
