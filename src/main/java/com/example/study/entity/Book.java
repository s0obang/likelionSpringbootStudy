package com.example.study.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
//빈값으로 생성자
@AllArgsConstructor
//다 넣어서 만드는 생성자
@Builder
//사용자가 보기에 편하게
@Entity
// JPA에게 해당 객체가 entitiy라는걸 알림
@Table(name="book")
public class Book {
    @Id
    //primaryKey로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private String price;


}
