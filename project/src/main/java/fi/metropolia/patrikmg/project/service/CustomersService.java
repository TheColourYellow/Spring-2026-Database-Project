package fi.metropolia.patrikmg.project.service;

import fi.metropolia.patrikmg.project.dto.CustomersDto;
import fi.metropolia.patrikmg.project.entity.Customers;
import fi.metropolia.patrikmg.project.repository.CustomersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomersService {

    private final CustomersRepository customersRepository;

    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    private CustomersDto customerToDto(Customers customer) {
        CustomersDto customersDto = new CustomersDto();
        customersDto.setId(customer.getId());
        customersDto.setFirst_name(customer.getFirst_name());
        customersDto.setLast_name(customer.getLast_name());
        customersDto.setEmail(customer.getEmail());
        customersDto.setPhone(customer.getPhone());
        return customersDto;
    }

    public List<CustomersDto> listAllCustomers() {
        List<Customers> customers = customersRepository.findAll();
        List<CustomersDto> result = new ArrayList<>();
        for (Customers customer : customers) {
            result.add(customerToDto(customer));
        }
        return result;
    }

}
