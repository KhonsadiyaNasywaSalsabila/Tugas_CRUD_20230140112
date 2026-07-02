package com.example.KTP.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "KTP")
@Data
public class Ktp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String nomorKtp;

    @Column(nullable = false)
    private String namaLengkap;

    @Column(nullable = false)
    private String alamat;

    @Column(nullable = false)
    private LocalDate tanggalLahir;

    @Column(nullable = false)
    private String jenisKelamin;

}

