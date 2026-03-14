package fi.metropolia.patrikmg.project.repository;

import fi.metropolia.patrikmg.project.entity.Orderitems;
import fi.metropolia.patrikmg.project.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{

    @Query("SELECT o from Orders o WHERE o.status = :status")
    List<Orders> findOrdersByStatus(@Param("status") String status);

    @Query("SELECT o from Orders o WHERE o.customer_id = :id")
    List<Orders> findOrdersByCustomerId(@Param("id") int id);

    @Query("SELECT o from Orderitems o WHERE o.product_id = :id")
    List<Orderitems> findOrdersWithItem(@Param("id") int id);
}
