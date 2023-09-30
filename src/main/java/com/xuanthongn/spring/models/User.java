package com.xuanthongn.spring.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "hoten")
    private String hoten;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "namsinh")
    private int namsinh;
    @Column(name = "gioitinh")
    private boolean gioitinh;
    @Column(name = "quequan")
    private String quequan;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "role_user",
            joinColumns = @JoinColumn(name = "user_id"),  // TRong đó, khóa ngoại chính là user_id trỏ tới class hiện tại (User)
            inverseJoinColumns = @JoinColumn(name = "role_id") //Khóa ngoại thứ 2 trỏ tới thuộc tính ở dưới (Role)
    )
    private Collection<Role> roles;


    public User(Long id, String hoten, String diachi, int namsinh, boolean gioitinh, String quequan, Department department) {
        this.id = id;
        this.hoten = hoten;
        this.diachi = diachi;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.department = department;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

}
