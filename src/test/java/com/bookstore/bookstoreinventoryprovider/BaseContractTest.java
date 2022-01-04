package com.bookstore.bookstoreinventoryprovider;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaseContractTest {

    @Before
    public  void setup(){
        final GetAvailableBookService getAvailableBookService = mock(GetAvailableBookService.class);
        when(getAvailableBookService.getAvailableBookCount(1)).thenReturn(new GetAvailableBookResponse(4));
        RestAssuredMockMvc.standaloneSetup(new GetAvailableBookController(getAvailableBookService));

    }

}
