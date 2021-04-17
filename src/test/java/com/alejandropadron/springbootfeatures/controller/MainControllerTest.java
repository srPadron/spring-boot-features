package com.alejandropadron.springbootfeatures.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.alejandropadron.springbootfeatures.api.response.StringDto;

@ExtendWith(MockitoExtension.class)
class MainControllerTest {

    @InjectMocks
    MainController mainController;

    @Test
    void returnOKNoContent() {
        ResponseEntity<StringDto> o = mainController.returnOKNoContent();
        assertEquals(o.getStatusCode(), HttpStatus.OK);
        assertEquals(o.getBody().getMessage(), "Hello");
    }
}