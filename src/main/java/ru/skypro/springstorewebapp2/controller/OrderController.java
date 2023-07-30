package ru.skypro.springstorewebapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.springstorewebapp2.service.OrderService;


import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> itemIds) {
        return orderService.addItems(itemIds);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }
}
