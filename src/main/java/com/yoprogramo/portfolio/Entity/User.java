//package com.yoprogramo.portfolio.Entity;
//
//import java.util.Collection;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.*;
//import lombok.*;
//
//@Getter @Setter
//@Entity
//@Table(name = "users")
//public class User implements UserDetails{
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer idUser;
//    
//    @Column(nullable = false, unique = true, length = 50)
//    private String userName;
//    
//    @Column(nullable = false, length = 64)
//    private String password;
//
//    public User() {
//    }
//
//    public User(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }
//    
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return this.email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
