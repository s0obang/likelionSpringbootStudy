package com.example.study.service;


import com.example.study.dto.Item.request.UpdateItemRequest;
import com.example.study.entity.Book;
import com.example.study.entity.Item;
import com.example.study.model.AddBookInput;
import com.example.study.model.AddItemInput;
import com.example.study.repository.BookRepository;
import com.example.study.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
                .startingPrice(input.getStartingPrice())
                .build();
        Item saved=itemRepository.save(item);
        return saved.getId();
    }

    @Transactional
    public void upDateItem(long id, @RequestBody UpdateItemRequest updateItemRequest){
        Item item = itemRepository.findById(id)
                .orElseThrow(()->new RuntimeException("해당 item이 없음"));
        if(item.getStartingPrice() > updateItemRequest.getStartingPrice() ){
            throw new IllegalArgumentException("기존 가격보다 더 높은 가격으로만 수정 가능함");
        }
        item.setDescription(updateItemRequest.getDescription());
        item.setStartingPrice(updateItemRequest.getStartingPrice());

        itemRepository.save(item);
    }
}