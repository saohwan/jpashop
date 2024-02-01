package com.jpabook.jpashop.domain.item;

import com.jpabook.jpashop.controller.BookForm;
import com.jpabook.jpashop.domain.Order;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item{

    private String author;
    private String isbn;
}
