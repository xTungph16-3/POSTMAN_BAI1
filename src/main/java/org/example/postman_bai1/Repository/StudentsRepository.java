package org.example.postman_bai1.Repository;

import org.example.postman_bai1.entity.Students;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {
}
