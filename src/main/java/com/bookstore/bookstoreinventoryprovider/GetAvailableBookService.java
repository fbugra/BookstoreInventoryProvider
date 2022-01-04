package com.bookstore.bookstoreinventoryprovider;

import org.springframework.stereotype.Component;

@Component
public class GetAvailableBookService {

    public GetAvailableBookResponse getAvailableBookCount(int bookId) {
        return new GetAvailableBookResponse(4);
    }
}
