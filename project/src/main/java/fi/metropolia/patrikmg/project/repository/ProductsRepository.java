package fi.metropolia.patrikmg.project.repository;

import fi.metropolia.patrikmg.project.entity.Orderitems;
import fi.metropolia.patrikmg.project.entity.Products;
import fi.metropolia.patrikmg.project.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>, ProductsRepositoryCriteria {

    /*
    //Try to get products in to the result as well

    //@Query("SELECT o from Orderitems o LEFT JOIN o.products p WHERE o.order_id = :id")
    //List<Orderitems> findAllProductsInOrder(@Param("id") int id);
    @NativeQuery(value = "SELECT * FROM orderitems LEFT JOIN products ON orderitems.product_id = products.id WHERE order_id= ?1")
    List<Orderitems> findAllProductsInOrder(int id);

     */
    @Query("SELECT o from Orderitems o WHERE o.order_id=:id")
    List<Orderitems> findAllProductsInOrder(@Param("id") int id);

    @Query("SELECT s from Products p, Suppliers s WHERE p.id=:id")
    List<Suppliers> findAllProductSuppliers(@Param("id") int id);

    @Query("SELECT p from Products p  WHERE p.supplier_id=:id")
    List<Products> findAllProductsFromSupplier(@Param("id") int id);


}
