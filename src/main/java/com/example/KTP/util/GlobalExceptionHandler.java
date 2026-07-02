package com.example.KTP.util;

import com.example.KTP.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResponseModel<Void>> handleRuntime(RuntimeException e) {
        return ResponseEntity.badRequest()
                .body(new ResponseModel<>("error", e.getMessage(), null));
    }
}
