package fi.metropolia.patrikmg.project.controller;

import fi.metropolia.patrikmg.project.dto.CustomersDto;
import fi.metropolia.patrikmg.project.entity.Customers;
import fi.metropolia.patrikmg.project.service.CustomersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")

public class CustomersController {

    private CustomersService customersService;


    public CustomersController(CustomersService customerService) {
        this.customersService = customerService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CustomersDto>> getAllCustomers() {
        List<CustomersDto> customers = customersService.listAllCustomers();
        return ResponseEntity.ok(customers);

    }


}
