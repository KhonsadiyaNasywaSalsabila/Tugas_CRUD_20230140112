package com.example.KTP.service;

import com.example.KTP.dto.KtpDTO;
import java.util.List;

public interface KtpService {
    KtpDTO create(KtpDTO dto);
    List<KtpDTO> getAll();
    KtpDTO getById(Integer id);
    KtpDTO update(Integer id, KtpDTO dto);
    void delete(Integer id);
}
