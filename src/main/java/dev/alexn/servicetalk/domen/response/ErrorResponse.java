package dev.alexn.servicetalk.domen.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse implements Response{
    private Error error;
}
