package com.project.zizihotel.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(length = 40,nullable = false)
    private String mid;
    @Column(length = 100,nullable = false)
    private String mpw;
    @Column(length = 40,nullable = false)
    private String email;
    @Column(length = 20,nullable = false)
    private String mname;
    @Column(length = 20,nullable = false)
    private String phone;

}
