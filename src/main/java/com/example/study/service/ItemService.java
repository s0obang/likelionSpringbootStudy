package com.example.study.service;


import com.example.study.entity.Book;
import com.example.study.entity.Item;
import com.example.study.model.AddBookInput;
import com.example.study.model.AddItemInput;
import com.example.study.repository.BookRepository;
import com.example.study.repository.ItemRepository;
import org.springframework.stereotype.Service;

//서비스단에서 디비에 저장하는거임
@Service
public class ItemService {
    private ItemRepository itemRepository;
    public ItemService(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    public long addItem(AddItemInput input){
        Item item = Item.builder()
                .name(input.getName())
                .description(input.getDescription())
                .startingPrice(String.valueOf(input.getStartingPrice()))
                .build();
        Item saved=itemRepository.save(item);
        return saved.getId();
    }
}