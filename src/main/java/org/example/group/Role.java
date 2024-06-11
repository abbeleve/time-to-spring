package org.example.group;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
@Table(name = "t_role")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Role implements GrantedAuthority {
    @Id
    private Long id;
    private Roles name;
    @Transient
    @ManyToMany
    private Set<Student> users;

    public Role(long l, Roles roles) {
        id = l;
        name = roles;
    }


    @Override
    public String getAuthority() {
        return name.name();
    }
}
