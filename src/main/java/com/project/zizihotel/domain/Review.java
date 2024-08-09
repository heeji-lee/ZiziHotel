package com.project.zizihotel.domain;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long revid;

    @Column(length = 100,nullable = false)
    private String revcontent;
    private Integer rating;

}
