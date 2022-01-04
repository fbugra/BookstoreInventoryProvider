package com.bookstore.bookstoreinventoryprovider;

public class GetAvailableBookRequest {

    private int bookId;

    public GetAvailableBookRequest() {
    }

    public GetAvailableBookRequest(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
