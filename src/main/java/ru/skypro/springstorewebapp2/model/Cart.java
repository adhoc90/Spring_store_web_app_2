package ru.skypro.springstorewebapp2.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> getItems() {
        return items;
    }

    public List<Integer> addItems(List<Integer> itemsIds) {
        items.addAll(itemsIds);
        return items;
    }
}