package fi.metropolia.patrikmg.project.controller;

import fi.metropolia.patrikmg.project.entity.Orders;
import fi.metropolia.patrikmg.project.service.OrdersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")

public class OrdersController {

    private OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = ordersService.listAllOrders();
        return ResponseEntity.ok(orders);

    }

    @GetMapping("/{status}")
    public ResponseEntity<List<Orders>> getOrdersByStatus(@PathVariable String status) {
        List<Orders> orders = ordersService.listOrdersByStatus(status);
        return ResponseEntity.ok(orders);
    }
}
