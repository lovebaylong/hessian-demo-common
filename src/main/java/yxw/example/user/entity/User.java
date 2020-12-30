package yxw.example.user.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Long id;

    private Integer type;

    private String name;

    private Integer age;

    private Boolean isLive;

    private String idCardNo;

    private String phone;

    private String address;

    private String email;
}
