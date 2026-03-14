package fi.metropolia.patrikmg.project.controller;

import fi.metropolia.patrikmg.project.dto.OrdersDto;
import fi.metropolia.patrikmg.project.entity.Orderitems;
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
    public ResponseEntity<List<OrdersDto>> getAllOrders() {
        List<OrdersDto> orders = ordersService.listAllOrders();
        return ResponseEntity.ok(orders);

    }

    @GetMapping("/{status}")
    public ResponseEntity<List<OrdersDto>> getOrdersByStatus(@PathVariable String status) {
        List<OrdersDto> orders = ordersService.listOrdersByStatus(status);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<List<OrdersDto>> getOrdersByCustomerId(@PathVariable int id) {
        List<OrdersDto> orders = ordersService.listCustomerOrders(id);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<List<Orderitems>> getOrdersByProductId(@PathVariable int id) {
        List<Orderitems> orders = ordersService.listAllOrdersWithItem(id);
        return ResponseEntity.ok(orders);
    }

}
