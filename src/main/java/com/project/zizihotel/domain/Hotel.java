package com.project.zizihotel.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long hid;
    @Column(length = 40,nullable = false)
    private String hname;
    @Column(length = 100,nullable = false)
    private String haddr;

}
