package com.example.demo.response;

import com.example.demo.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookResponse extends BaseResponse{
    BookEntity book;

    public BookResponse(boolean success, String message, BookEntity book) {
        super(success, message);
        this.book = book;
    }
}
