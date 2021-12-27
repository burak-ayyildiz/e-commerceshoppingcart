package org.example.cartservice.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private double price;
    private CategoryDto categoryDTO;

    public static final class ProductDTOBuilder {
        private Long id;
        private String name;
        private double price;

        private ProductDTOBuilder() {
        }

        public static ProductDTOBuilder aProductDTO() {
            return new ProductDTOBuilder();
        }

        public ProductDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ProductDTOBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductDTOBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductDTO build() {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(id);
            productDTO.setName(name);
            productDTO.setPrice(price);
            return productDTO;
        }
    }
}
