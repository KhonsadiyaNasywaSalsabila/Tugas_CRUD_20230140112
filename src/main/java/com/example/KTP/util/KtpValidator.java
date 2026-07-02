package com.example.KTP.util;

import com.example.KTP.dto.KtpDTO;
import com.example.KTP.repository.KtpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KtpValidator {

    private final KtpRepository ktpRepository;

    public void validateCreate(KtpDTO dto) {
        if (ktpRepository.existsByNomorKtp(dto.getNomorKtp())) {
            throw new RuntimeException("Nomor KTP " + dto.getNomorKtp() + " sudah terdaftar");
        }
    }

    public void validateUpdate(KtpDTO dto, Integer id) {
        if (ktpRepository.existsByNomorKtpAndIdNot(dto.getNomorKtp(), id)) {
            throw new RuntimeException("Nomor KTP " + dto.getNomorKtp() + " sudah digunakan");
        }
    }
}
