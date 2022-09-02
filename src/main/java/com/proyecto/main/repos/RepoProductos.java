package com.proyecto.main.repos;

import com.proyecto.main.model.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin
public interface RepoProductos extends JpaRepository<Producto, Long> {
    public Optional<Producto> findById(Long id);
    public Page<Producto> findAll(Pageable page);
}
