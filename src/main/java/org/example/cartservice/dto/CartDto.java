/*
package org.example.cartservice.dto;

import lombok.Data;
import org.example.cartservice.model.CartItem;

import javax.persistence.*;
import java.util.List;

@Data

public class CartDto {

    private Long id;
    private double totalPrice;

    private List<CartItem> cartItems;


    public static final class CartDtoBuilder {
        private Long id;
        private double totalPrice;
        private List<CartItem> cartItems;

        private CartDtoBuilder() {
        }

        public static CartDtoBuilder aCartDto() {
            return new CartDtoBuilder();
        }

        public CartDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CartDtoBuilder totalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public CartDtoBuilder cartItems(List<CartItem> cartItems) {
            this.cartItems = cartItems;
            return this;
        }

        public CartDto build() {
            CartDto cartDto = new CartDto();
            cartDto.setId(id);
            cartDto.setTotalPrice(totalPrice);
            cartDto.setCartItems(cartItems);
            return cartDto;
        }
    }
}
*/
