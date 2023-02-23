package dev.alexn.servicetalk.domen.response.exception;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import  dev.alexn.servicetalk.domen.constant.Code;

@Data
@Builder
public class CommonException extends RuntimeException {

    private final Code code;
    private final String message;
    private final HttpStatus httpStatus;
}
