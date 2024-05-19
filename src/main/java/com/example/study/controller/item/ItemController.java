package com.example.study.controller.item;

import com.example.study.entity.Item;
import com.example.study.repository.BookRepository;
import com.example.study.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> getItems() {
        List<Item> items = itemRepository.findAll();
        return items;
    }

    @PostMapping("/items")
    public void addItem(@RequestBody Item item) {
        item.setId(null); // 이 줄을 추가해서 id 값을 null로 설정하여 새로운 id가 자동으로 생성되도록 함
        //대신 id는 0으로 넣어야한다....알겠니
        itemRepository.save(item);
    }

}
