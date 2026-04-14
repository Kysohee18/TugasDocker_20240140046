# Content for the README.md file based on the previously discussed structure
readme_content = """# Tugas Deployment Spring Boot & Docker
**Nama:** Shahky Yandhana Putra  
**NIM:** 20240140046  
**Repositori:** TugasDocker_20240140046

## 📝 Deskripsi Proyek
Proyek ini adalah implementasi aplikasi manajemen data mahasiswa berbasis web yang dibangun menggunakan **Spring Boot**, **Thymeleaf**, dan **Tailwind CSS**. Aplikasi ini telah dikemas dalam bentuk Docker Image untuk memastikan aplikasi dapat berjalan secara konsisten di lingkungan manapun melalui proses kontainerisasi. Sesuai dengan spesifikasi tugas, data mahasiswa disimpan secara sementara dalam memori (*temporary storage*) selama aplikasi berjalan.

---

## 📸 Dokumentasi (Screenshot 10 Hal)

### 1. Halaman Images - Docker Desktop
Berikut adalah bukti visual daftar *image* di Docker Desktop setelah saya berhasil melakukan *push* image proyek saya ke Docker Hub dan melakukan *pull* image proyek milik rekan saya.
<img width="1919" height="1033" alt="image" src="https://github.com/user-attachments/assets/8bacd677-ff21-43a1-aa6d-786a6d46e682" />


### 2. Halaman Containers - Docker Desktop
Menampilkan kontainer yang sedang berjalan di sistem, mencakup kontainer aplikasi saya sendiri dan kontainer dari image rekan saya yang sudah berhasil dijalankan.
<img width="1915" height="1020" alt="image" src="https://github.com/user-attachments/assets/eff816a0-bc79-4849-ac3c-511096082206" />


### 3. Aplikasi Pribadi (Shahky - 20240140046)
Dokumentasi fungsionalitas aplikasi pribadi yang dijalankan melalui Docker:
- **Halaman Login:** Proses autentikasi menggunakan username `admin` dan password NIM.
<img width="1919" height="869" alt="image" src="https://github.com/user-attachments/assets/282e0a80-4e25-4115-85d9-54d7c4a6da4a" />

- **Halaman Home:** Tampilan dashboard utama yang memuat identitas unik pembuat.
<img width="1919" height="969" alt="Screenshot 2026-04-14 112905" src="https://github.com/user-attachments/assets/980dab5a-be45-4acc-a704-7b545a1ec5ee" />

- **Halaman Form:** Antarmuka input data mahasiswa baru.
<img width="1916" height="957" alt="Screenshot 2026-04-14 112923" src="https://github.com/user-attachments/assets/982ab51b-c4c6-42a2-95f3-d54a1dd5f2f7" />

- **Halaman Home (Setelah Input):** Verifikasi data yang baru saja diinput muncul pada tabel dashboard.
<img width="1911" height="960" alt="Screenshot 2026-04-14 113022" src="https://github.com/user-attachments/assets/ca6bf5c1-e68f-49ff-be42-0e270b1970d2" />


### 4. Aplikasi Rekan (Hasil Pull)
Dokumentasi pengujian aplikasi milik rekan yang dijalankan pada port lokal yang berbeda:
- **Halaman Login Rekan:** Pengujian akses login pada aplikasi rekan.
<img width="1918" height="864" alt="image" src="https://github.com/user-attachments/assets/9a673bfe-a9e3-4601-8660-f0659569d2d2" />
- **Halaman Home Rekan:** Tampilan utama aplikasi rekan dengan identitas miliknya.
<img width="1915" height="873" alt="image" src="https://github.com/user-attachments/assets/86cc5ed5-80b8-46e0-8a0b-5d4d53502db0" />

- **Halaman Form Rekan:** Pengujian input data pada form aplikasi rekan.
<img width="1919" height="864" alt="image" src="https://github.com/user-attachments/assets/9781bfea-3655-405c-a6ad-6825d4c3e32a" />

- **Halaman Home Rekan (Setelah Input):** Memastikan fungsionalitas input aplikasi rekan berjalan dengan baik di kontainer lokal saya.
<img width="1919" height="874" alt="image" src="https://github.com/user-attachments/assets/1366218f-7167-4316-b189-79e75d194c65" />


---

## 🛠️ Cara Menjalankan Aplikasi
1. Pastikan Docker Desktop sudah terinstal dan berjalan.
2. Tarik image dari Docker Hub (Opsional jika sudah ada):
   ```bash
   docker pull username_dockerhub/tugas-20240140046:1.0
