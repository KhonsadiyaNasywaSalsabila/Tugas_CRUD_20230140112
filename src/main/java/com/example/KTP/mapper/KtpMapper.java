package com.example.KTP.mapper;

import com.example.KTP.dto.KtpDTO;
import com.example.KTP.entity.Ktp;
import org.springframework.stereotype.Component;

@Component
public class KtpMapper {

    public KtpDTO toDTO(Ktp ktp) {
        KtpDTO dto = new KtpDTO();
        dto.setId(ktp.getId());
        dto.setNomorKtp(ktp.getNomorKtp());
        dto.setNamaLengkap(ktp.getNamaLengkap());
        dto.setAlamat(ktp.getAlamat());
        dto.setTanggalLahir(ktp.getTanggalLahir());
        dto.setJenisKelamin(ktp.getJenisKelamin());
        return dto;
    }

    public Ktp toEntity(KtpDTO dto) {
        Ktp ktp = new Ktp();
        ktp.setNomorKtp(dto.getNomorKtp());
        ktp.setNamaLengkap(dto.getNamaLengkap());
        ktp.setAlamat(dto.getAlamat());
        ktp.setTanggalLahir(dto.getTanggalLahir());
        ktp.setJenisKelamin(dto.getJenisKelamin());
        return ktp;
    }
}
