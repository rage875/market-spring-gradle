package com.demo.market.persistence;

import com.demo.market.persistence.crud.ProductoCrudRepository;
import com.demo.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCateoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    public List<Producto> getByCateoriaByNombreAsc(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
}
