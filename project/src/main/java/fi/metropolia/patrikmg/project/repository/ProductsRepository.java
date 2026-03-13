package fi.metropolia.patrikmg.project.repository;

import fi.metropolia.patrikmg.project.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>, ProductsRepositoryCriteria {

}
