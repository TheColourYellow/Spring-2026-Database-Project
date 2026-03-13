package fi.metropolia.patrikmg.project.repository;

import fi.metropolia.patrikmg.project.entity.Products;

import java.util.List;

public interface ProductsRepositoryCriteria {
    //List<Products> findByQuantityIsAtMost(int quantity);
     List<Products> findAllProductsByQuantity(int quantity);
}
