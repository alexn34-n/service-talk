package dev.alexn.servicetalk.service;

import dev.alexn.servicetalk.domen.response.Response;
import org.springframework.http.ResponseEntity;

public interface PhraseService {
    ResponseEntity<Response> test();
}
