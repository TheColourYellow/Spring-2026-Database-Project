package fi.metropolia.patrikmg.project.controller;

import fi.metropolia.patrikmg.project.dto.OrdersDto;
import fi.metropolia.patrikmg.project.dto.ProductsDto;
import fi.metropolia.patrikmg.project.entity.Orderitems;
import fi.metropolia.patrikmg.project.entity.Products;
import fi.metropolia.patrikmg.project.entity.Suppliers;
import fi.metropolia.patrikmg.project.service.ProductsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")

public class ProductsController {
    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductsDto>> getAllProducts() {
        List<ProductsDto> orders = productsService.listAllProducts();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/stockatmost/{quantity}")
    public ResponseEntity<List<ProductsDto>> getAllProductByMaxQuantity(@PathVariable int quantity) {
        List<ProductsDto> products = productsService.listAllProductsByMaxQuantity(quantity);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<List<Orderitems>> getProductsInOrder(@PathVariable int id) {
        List<Orderitems> products = productsService.listAllProductsInOrder(id);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/supplier/{id}")
    public ResponseEntity<List<ProductsDto>> getAllProductsFromSupplier(@PathVariable int id) {
        List<ProductsDto> products = productsService.listAllProductsFromSupplier(id);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Suppliers>> getAllProductSuppliers(@PathVariable int id) {
        List<Suppliers> suppliers = productsService.listAllProductSuppliers(id);
        return ResponseEntity.ok(suppliers);
    }

    @PostMapping("/new")
    public ResponseEntity<Products> addNewProduct(@RequestBody Products product) {
        Products addedProduct = productsService.createNewProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedProduct);
    }
}
