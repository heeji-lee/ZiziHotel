package com.project.zizihotel.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long rid;

    @ManyToOne
    @JoinColumn(name = "hid")
    private Hotel hotel;

    @Column(length = 40,nullable = false)
    private String rname;

    @Column(length = 20,nullable = false)
    private String rtype;

    private String info;

}
