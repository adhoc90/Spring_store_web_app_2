package ru.skypro.springstorewebapp2.service;

import org.springframework.stereotype.Service;
import ru.skypro.springstorewebapp2.model.Cart;


import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> itemsIds) {
        return cart.addItems(itemsIds);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}