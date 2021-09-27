package az.fd.shopping.domain;

public class ProductImage {
    private ImageType imageType;
    private String url;

    enum ImageType {
        FEATURE, NORMAL;
    }
}
