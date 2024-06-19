package com.bookstore.entity;

import com.bookstore.entity.Book;
import com.bookstore.valid.ValidUserName;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",length = 100,nullable = false,unique = true)
    @NotBlank(message = "Khong đc để trống")
    @Size(max = 100,message = "Không quá 100 ký tự")
    @ValidUserName
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Book> books;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;
}
