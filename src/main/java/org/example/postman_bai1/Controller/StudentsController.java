package org.example.postman_bai1.Controller;

import org.example.postman_bai1.Repository.StudentsRepository;
import org.example.postman_bai1.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable; // Sửa import ở đây
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    StudentsRepository studentsRepository;

    @GetMapping("/hien-thi")
    public List<Students> hienThi() {
        return studentsRepository.findAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Students students) {
        Students st = studentsRepository.save(students);
        if (st == null) {
            return "Them loi";
        }
        return "Them thanh cong";
    }

    @PostMapping("/update")
    public String update(@RequestBody Students students) {
        Students st = studentsRepository.save(students);
        if (st == null) {
            return "Sua loi";
        }
        return "Sua thanh cong";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        studentsRepository.deleteById(id);
        return "Xoa thanh cong";
    }

    @GetMapping("/phan-trang")
    public List<Students> phanTrang(@RequestParam(value = "page", defaultValue = "0") Integer page) {
        int pageSize = 2;
        Pageable pageable = PageRequest.of(page, pageSize); // Sử dụng đúng Pageable
        return studentsRepository.findAll(pageable).getContent();
    }
}