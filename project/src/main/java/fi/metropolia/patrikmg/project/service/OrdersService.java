package fi.metropolia.patrikmg.project.service;

import fi.metropolia.patrikmg.project.dto.OrdersDto;
import fi.metropolia.patrikmg.project.entity.Orderitems;
import fi.metropolia.patrikmg.project.entity.Orders;
import fi.metropolia.patrikmg.project.repository.OrdersRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    private OrdersDto ordersToDto(Orders orders) {
        OrdersDto ordersDto = new OrdersDto();
        ordersDto.setId(orders.getId());
        ordersDto.setCustomer_id(orders.getCustomer_id());
        ordersDto.setOrder_date(orders.getOrder_date());
        ordersDto.setDelivery_date(orders.getDelivery_date());
        ordersDto.setShipping_address_id(orders.getShipping_address_id());
        ordersDto.setStatus(orders.getStatus());
        return ordersDto;
    }

    public List<OrdersDto> listAllOrders() {
        List<Orders> orders = ordersRepository.findAll();
        List<OrdersDto> result = new ArrayList<>();
        for (Orders order : orders) {
            result.add(ordersToDto(order));
        }
        return result;
    }

    public List<OrdersDto> listOrdersByStatus(String status) {
        List<Orders> orders = ordersRepository.findOrdersByStatus(status);
        List<OrdersDto> result = new ArrayList<>();
        for (Orders order : orders) {
            result.add(ordersToDto(order));
        }
        return result;
    }

    public List<OrdersDto> listCustomerOrders(@PathVariable int id) {
        List<Orders> orders = ordersRepository.findOrdersByCustomerId(id);
        List<OrdersDto> result = new ArrayList<>();
        for (Orders order : orders) {
            result.add(ordersToDto(order));
        }
        return result;
    }

    public List<Orderitems> listAllOrdersWithItem(int id) {
        List<Orderitems> orders = ordersRepository.findOrdersWithItem(id);
        return orders;
    }
}
