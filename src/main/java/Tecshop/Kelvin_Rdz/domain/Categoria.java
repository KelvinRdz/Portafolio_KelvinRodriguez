/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tecshop.Kelvin_Rdz.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    

    private static final long serialVersionUID = 1L;

    public Categoria() {
    }

    public Categoria(Integer idCategoria, String descripcion, String rutaImagen, Boolean activo, List<Producto> productos) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
        this.productos = productos;
    }
    
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(unique = true, nullable = false, length = 50)
    @NotNull
    @Size(max = 50)
    private String descripcion;

    @Column(length = 1024)
    @Size(max = 1024)
    private String rutaImagen;

    @Column(name = "activo")
    private Boolean activo;

    // Relación de uno a muchos con la clase Producto
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}
