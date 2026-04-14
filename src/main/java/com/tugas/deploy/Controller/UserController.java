package com.tugas.deploy.controller;

import com.tugas.deploy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // List statis untuk menyimpan data sementara selama aplikasi berjalan
    private static List<User> listMahasiswa = new ArrayList<>();

    @GetMapping("/")
    public String loginPage() {
        return "login"; // Mengarah ke login.html [cite: 56]
    }

    @PostMapping("/login")
    public String prosesLogin(@RequestParam String username,
                              @RequestParam String password,
                              Model model) {
        // Logika autentikasi sesuai requirement [cite: 70]
        // Username: admin, Password: NIM Anda (20240140046)
        if ("admin".equals(username) && "20240140046".equals(password)) {
            return "redirect:/home";
        }
        model.addAttribute("error", "Username atau Password salah!");
        return "login";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("dataMahasiswa", listMahasiswa);
        return "home"; // Mengarah ke home.html [cite: 55]
    }

    @GetMapping("/form")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "form"; // Mengarah ke form.html [cite: 54]
    }

    @PostMapping("/save")
    public String simpanData(@ModelAttribute User user) {
        listMahasiswa.add(user); // Data disimpan secara temporary
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }
}