package uk.ac.westminster.products_api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.Product;
import uk.ac.westminster.products_api.Service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return new Product(id, "Laptop", 999.99);

    }

    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}
