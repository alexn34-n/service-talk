package dev.alexn.servicetalk.service.impl;

import dev.alexn.servicetalk.domen.response.ErrorResponse;
import dev.alexn.servicetalk.domen.response.Error;
import dev.alexn.servicetalk.domen.response.Response;
import dev.alexn.servicetalk.domen.response.SuccessResponse;
import dev.alexn.servicetalk.service.PhraseService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Slf4j
@Service
@RequiredArgsConstructor
public class PhraseServiceImpl implements PhraseService {
    @Override
    public ResponseEntity<Response> test() {


        return new ResponseEntity<>(SuccessResponse.builder().data("SuccessResponse").build(),HttpStatus.OK);
//        return new ResponseEntity<>(ErrorResponse.builder().error(Error.builder().code("VALIDATION_ERROR")
//                .message("Ошибка валидации").build()).build(), HttpStatus.BAD_REQUEST);
    }
}
