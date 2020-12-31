package com.alejandropadron.springbootfeatures.controller;
import com.alejandropadron.springbootfeatures.api.response.StringDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class MainController {

    @GetMapping("/hello")
    public ResponseEntity<StringDto> returnOKNoContent(){
        return new ResponseEntity<StringDto>(StringDto.builder().message("Hello").build(), HttpStatus.OK);
    }
}
