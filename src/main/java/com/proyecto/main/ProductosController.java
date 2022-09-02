package com.proyecto.main;

import com.proyecto.main.model.Producto;
import com.proyecto.main.model.Rol;
import com.proyecto.main.model.Usuario;
import com.proyecto.main.repos.RepoProductos;
import com.proyecto.main.repos.RepoUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/productoes")
public class ProductosController {

    @Autowired
    private RepoProductos repoProductos;

    // ABM de productos de un usuario
    @GetMapping(path={"", "/"})
    public List<Producto> getProductos(Pageable page) {
        return repoProductos.findAll(page).getContent();
    }

    @PostMapping(path={"","/"})
    public Producto addProducto(@Valid @RequestBody Producto producto) {
        return repoProductos.save(producto);
    }

}

