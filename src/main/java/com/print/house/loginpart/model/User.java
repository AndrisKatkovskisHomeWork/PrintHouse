package com.print.house.loginpart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    @Column(name = "email")
    @Email(message = "*The email address you entered is invalid")
    @NotEmpty(message = "*Please enter an email address")
    private String email;
    @Column(name = "password")
    @Length(min = 5, message = "*Password must be at least 5 siboles long")
    private String password;
    @Column(name = "name")
    @NotEmpty(message = "*Please enter a name")
    private String name;
    @Column(name = "last_name")
    @NotEmpty(message = "*Please enter a last name")
    private String lastName;
    @Column(name = "active")
    private int active;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
