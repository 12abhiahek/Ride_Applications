package com.ride.RideApplication.entity;

import com.ride.RideApplication.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name = "users")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(nullable = false)
    private String name;
@Column(nullable = false, unique = true)
    private String email;
@Column(nullable = false)
    private String password;

@Enumerated(EnumType.STRING)
@Column(nullable = false)
    private Role role;

}
