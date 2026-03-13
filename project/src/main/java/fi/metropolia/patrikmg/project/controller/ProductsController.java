package fi.metropolia.patrikmg.project.controller;

import fi.metropolia.patrikmg.project.dto.ProductsDto;
import fi.metropolia.patrikmg.project.entity.Products;
import fi.metropolia.patrikmg.project.service.ProductsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")

public class ProductsController {
    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> orders = productsService.listAllProducts();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/stockatmost/{quantity}")
    public ResponseEntity<List<ProductsDto>> getAllProductByMaxQuantity(@PathVariable int quantity) {
        List<ProductsDto> products = productsService.listAllProductsByMaxQuantity(quantity);
        return ResponseEntity.ok(products);

    }
}
