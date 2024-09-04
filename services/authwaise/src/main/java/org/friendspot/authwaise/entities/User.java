package org.friendspot.authwaise.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Entity
@Table(name = "users")
public class User {

    @Getter
    @Setter
    @Id
    private Long id;

    @Getter
    @Setter
    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Getter
    @Setter
    @Column(name = "password", nullable = false)
    private char[] password;

    public void clearSensitiveDate() {
        Arrays.fill(password, '\0');
    }
}
