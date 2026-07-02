package com.example.KTP.service.impl;

import com.example.KTP.dto.KtpDTO;
import com.example.KTP.entity.Ktp;
import com.example.KTP.mapper.KtpMapper;
import com.example.KTP.repository.KtpRepository;
import com.example.KTP.service.KtpService;
import com.example.KTP.util.KtpValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KtpServiceImpl implements KtpService {

    private final KtpRepository ktpRepository;
    private final KtpMapper ktpMapper;
    private final KtpValidator ktpValidator;

    @Override
    public KtpDTO create(KtpDTO dto) {
        ktpValidator.validateCreate(dto);
        Ktp ktp = ktpMapper.toEntity(dto);
        return ktpMapper.toDTO(ktpRepository.save(ktp));
    }

    @Override
    public List<KtpDTO> getAll() {
        return ktpRepository.findAll()
                .stream()
                .map(ktpMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public KtpDTO getById(Integer id) {
        Ktp ktp = ktpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("KTP dengan ID " + id + " tidak ditemukan"));
        return ktpMapper.toDTO(ktp);
    }

    @Override
    public KtpDTO update(Integer id, KtpDTO dto) {
        Ktp existing = ktpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("KTP dengan ID " + id + " tidak ditemukan"));
        ktpValidator.validateUpdate(dto, id);
        existing.setNomorKtp(dto.getNomorKtp());
        existing.setNamaLengkap(dto.getNamaLengkap());
        existing.setAlamat(dto.getAlamat());
        existing.setTanggalLahir(dto.getTanggalLahir());
        existing.setJenisKelamin(dto.getJenisKelamin());
        return ktpMapper.toDTO(ktpRepository.save(existing));
    }

    @Override
    public void delete(Integer id) {
        if (!ktpRepository.existsById(id)) {
            throw new RuntimeException("KTP dengan ID " + id + " tidak ditemukan");
        }
        ktpRepository.deleteById(id);
    }
}
