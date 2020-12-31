package com.alejandropadron.springbootfeatures.api.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StringDto {

    private String message;
}
