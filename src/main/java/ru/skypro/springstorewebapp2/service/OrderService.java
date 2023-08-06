package ru.skypro.springstorewebapp2.service;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> itemsIds);

    List<Integer> getItems();
}
