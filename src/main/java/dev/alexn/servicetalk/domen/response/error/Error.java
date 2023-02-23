package dev.alexn.servicetalk.domen.response.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.alexn.servicetalk.domen.constant.Code;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {
    private Code code;
    private String message;

}
