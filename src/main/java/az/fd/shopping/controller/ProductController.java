package az.fd.shopping.controller;

import az.fd.shopping.model.ProductResponse;
import az.fd.shopping.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public Flux<ProductResponse> getAllProduct() {
        return productService.getAll();
    }
}
