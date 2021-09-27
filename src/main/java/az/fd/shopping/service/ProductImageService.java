package az.fd.shopping.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductImageService {


    public String getProductMainImage(String productId) {
        return "https://productimages.hepsiburada.net/s/32/500/103522568139826.jpg";
    }
}
