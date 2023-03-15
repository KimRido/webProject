package com.jojodu.book.springboot.web.dto;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void lombokTest() {

        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName(), is(name));
        assertThat(dto.getAmount(), is(amount));
    }
}
