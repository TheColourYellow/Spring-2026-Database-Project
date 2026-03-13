package fi.metropolia.patrikmg.project.service;

import fi.metropolia.patrikmg.project.entity.Orders;
import fi.metropolia.patrikmg.project.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> listAllOrders() {
        return ordersRepository.findAll();
    }

    public List<Orders> listOrdersByStatus(String status) {
        List<Orders> orders = ordersRepository.findOrdersByStatus(status);
        return orders;
    }
}
