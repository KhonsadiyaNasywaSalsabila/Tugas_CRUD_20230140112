package com.example.KTP.controller;


import com.example.KTP.dto.KtpDTO;
import com.example.KTP.model.ResponseModel;
import com.example.KTP.service.KtpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class KtpController {

    private final KtpService ktpService;

    @PostMapping
    public ResponseEntity<ResponseModel<KtpDTO>> create(@RequestBody KtpDTO dto) {
        KtpDTO result = ktpService.create(dto);
        return ResponseEntity.ok(new ResponseModel<>("success", "KTP berhasil ditambahkan", result));
    }

    @GetMapping
    public ResponseEntity<ResponseModel<List<KtpDTO>>> getAll() {
        List<KtpDTO> result = ktpService.getAll();
        return ResponseEntity.ok(new ResponseModel<>("success", "Data KTP berhasil diambil", result));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseModel<KtpDTO>> getById(@PathVariable Integer id) {
        KtpDTO result = ktpService.getById(id);
        return ResponseEntity.ok(new ResponseModel<>("success", "Data KTP ditemukan", result));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseModel<KtpDTO>> update(@PathVariable Integer id, @RequestBody KtpDTO dto) {
        KtpDTO result = ktpService.update(id, dto);
        return ResponseEntity.ok(new ResponseModel<>("success", "KTP berhasil diperbarui", result));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseModel<Void>> delete(@PathVariable Integer id) {
        ktpService.delete(id);
        return ResponseEntity.ok(new ResponseModel<>("success", "KTP berhasil dihapus", null));
    }
}

