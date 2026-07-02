# 🪪 Aplikasi Manajemen Data KTP (CRUD)

Aplikasi berbasis web untuk mengelola data Kartu Tanda Penduduk (KTP) menggunakan arsitektur Client-Server. 

**Identitas:**
* **Nama:** Khonsadiya Nasywa Salsabila
* **NIM:** 20230140112

## ✨ Dokumentasi UI

Aplikasi ini mendukung operasi CRUD secara penuh tanpa *refresh* halaman (SPA - Single Page Application). Berikut adalah dokumentasi antarmuka pengguna:

### 1. Tampilan Awal (Read)
Menampilkan form kosong dan tabel data KTP yang diambil dari *database*.
<img width="959" height="508" alt="Screenshot 2026-07-02 202037" src="https://github.com/user-attachments/assets/53bb9c15-4578-40bc-9ba9-1a4170205fdb" />
<img width="959" height="509" alt="Screenshot 2026-07-02 190334" src="https://github.com/user-attachments/assets/2f1eac0f-bfe8-4b56-bcd9-da7d65bd605f" />


### 2. Proses Tambah Data (Create)
Formulir input data baru dengan input `date` dan *dropdown* jenis kelamin.
<img width="959" height="509" alt="Screenshot 2026-07-02 190600" src="https://github.com/user-attachments/assets/e1c82582-ef76-4242-8f01-18753ae68c3b" />
<img width="959" height="511" alt="Screenshot 2026-07-02 190613" src="https://github.com/user-attachments/assets/226996f0-63f6-4c3b-a92f-bf4cdd4f93cf" />


### 3. Data Berhasil Disimpan & Notifikasi
Tampilan tabel yang sudah terisi data beserta notifikasi sukses (*Toast Notification*).
<img width="959" height="509" alt="Screenshot 2026-07-02 190629" src="https://github.com/user-attachments/assets/87c55624-dc13-4120-a878-9f23fd3fc9b6" />
<img width="959" height="512" alt="Screenshot 2026-07-02 190655" src="https://github.com/user-attachments/assets/d71425d0-d6a4-4cd3-9e21-c9ab5decfebd" />


### 4. Mode Edit Data (Update)
Tampilan saat tombol edit ditekan, form akan terisi otomatis dengan data yang dipilih.
<img width="959" height="509" alt="Screenshot 2026-07-02 190708" src="https://github.com/user-attachments/assets/95ff4fe8-6e82-4065-aeee-6f52102aa616" />
<img width="959" height="511" alt="Screenshot 2026-07-02 190728" src="https://github.com/user-attachments/assets/bf23aa2a-cdc3-4402-a1cd-e7c4eb194746" />


### 5. Data Berhasil Diupdate & Notifikasi
Tampilan tabel yang sudah terisi data terbaru beserta notifikasi sukses (*Toast Notification*).
<img width="959" height="511" alt="Screenshot 2026-07-02 190740" src="https://github.com/user-attachments/assets/d6c9afe0-1c56-490d-b842-69c55bd9e125" />


### 6. Validasi form 
Tampilan saat input nomor KTP sudah ada yang sama di database (duplikat), dan form harus terisi semua
<img width="959" height="509" alt="Screenshot 2026-07-02 190827" src="https://github.com/user-attachments/assets/dcf4fe20-ebfb-4a2f-93a8-e2481fecf54c" />
<img width="959" height="507" alt="Screenshot 2026-07-02 191753" src="https://github.com/user-attachments/assets/2c670435-6fb2-4573-bc73-561848ffc1f5" />

### 7. Hapus Data (Delete)
Terdapat fitur safety berupa pop-up konfirmasi sebelum menghapus data, sehingga data tidak akan langsung hilang jika pengguna tidak sengaja menekan tombol hapus.
<img width="959" height="510" alt="Screenshot 2026-07-02 191840" src="https://github.com/user-attachments/assets/cc8f9779-58de-40ad-a342-25ec11f939e6" />
<img width="959" height="509" alt="Screenshot 2026-07-02 191914" src="https://github.com/user-attachments/assets/e58c3ff7-27e6-4bd6-9826-6abbd2c66929" />

---


## ⚙️ Dokumentasi Server & Database

### 1. Struktur Database
Database menggunakan MySQL dengan nama skema `spring`. Tabel `ktp` telah disesuaikan tipe datanya.
<img width="959" height="539" alt="Screenshot 2026-07-02 191901" src="https://github.com/user-attachments/assets/cff8f403-6fde-4c9a-b376-fd4b1c09f622" />
<img width="959" height="539" alt="Screenshot 2026-07-02 191926" src="https://github.com/user-attachments/assets/c7f02b5d-437d-4507-9add-d5abb0e16baf" />



### 2. Dokumentasi REST API
Berikut adalah daftar *endpoint* yang tersedia dan telah diuji:

| Method | Endpoint | Deskripsi |
| :--- | :--- | :--- |
| `POST` | `/ktp` | Menambahkan data KTP baru |
| `GET` | `/ktp` | Mengambil seluruh data KTP |
| `GET` | `/ktp/{id}` | Mengambil data KTP berdasarkan ID |
| `PUT` | `/ktp/{id}` | Memperbarui data KTP yang sudah ada |
| `DELETE`| `/ktp/{id}` | Menghapus data KTP berdasarkan ID |

