package fi.metropolia.patrikmg.project.service;

import fi.metropolia.patrikmg.project.dto.ProductsDto;
import fi.metropolia.patrikmg.project.entity.Products;
import fi.metropolia.patrikmg.project.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ProductsDto getDto(int id) {
        ProductsDto productsDto = new ProductsDto();
        Products products = productsRepository.findById(id).orElse(null);
        if (products == null) {
            return null;
        }
        productsDto.setId(products.getId());
        productsDto.setName(products.getName());
        productsDto.setDescription(products.getDescription());
        productsDto.setPrice(products.getPrice());
        return productsDto;
    }
    private ProductsDto changeToDto(Products products) {
        ProductsDto productsDto = new ProductsDto();
        productsDto.setId(products.getId());
        productsDto.setName(products.getName());
        productsDto.setDescription(products.getDescription());
        productsDto.setPrice(products.getPrice());
        productsDto.setStock_quantity(products.getStock_quantity());
        productsDto.setCategory_id(products.getCategory_id());
        productsDto.setSupplier_id(products.getSupplier_id());
        return productsDto;
    }

    public List<Products> listAllProducts() {
        return productsRepository.findAll();
    }

    public List<ProductsDto> listAllProductsByMaxQuantity(int quantity) {
        //List<Products> products = productsRepository.findByQuantityIsAtMost(quantity);
        List<Products> products = productsRepository.findAllProductsByQuantity(quantity);
        List<ProductsDto> result = new ArrayList<>();
        for (Products p : products) {
            result.add(changeToDto(p));
        }
        return result;
    }
}
