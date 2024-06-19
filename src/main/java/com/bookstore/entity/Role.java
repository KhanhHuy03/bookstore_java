package com.bookstore.entity;


import com.bookstore.valid.ValidUserId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.internal.util.stereotypes.Lazy;
import org.springframework.security.authorization.method.HandleAuthorizationDenied;

import java.util.List;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50,message = "Tên tối đa 50 ký tự")
    @NotBlank
    @Column
    private String name;

    @Size(max = 250,message = "Tối đa 250 ký tự")
    @Column(name="description",length = 250)
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name = "role_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;


}
