package dev.alexn.servicetalk.domen.response.error;


import dev.alexn.servicetalk.domen.response.Response;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse implements Response {
    private Error error;
}
