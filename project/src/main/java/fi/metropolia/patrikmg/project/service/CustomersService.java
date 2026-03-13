package fi.metropolia.patrikmg.project.service;

import fi.metropolia.patrikmg.project.entity.Customers;
import fi.metropolia.patrikmg.project.repository.CustomersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {

    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public List<Customers> listAllCustomers() {
        return customersRepository.findAll();
    }

}
