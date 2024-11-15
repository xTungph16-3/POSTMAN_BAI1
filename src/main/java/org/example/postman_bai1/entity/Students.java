package org.example.postman_bai1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Thêm trường id

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name = "marks")
    private Float marks;

    @Column(name = "gender")
    private Boolean gender; // Sử dụng Boolean cho trường BIT

    @Column(name = "ccounty", nullable = false)
    private String ccounty;


}
