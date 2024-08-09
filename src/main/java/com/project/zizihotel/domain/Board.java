package com.project.zizihotel.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long bid;
    @ManyToOne
    @JoinColumn(name = "mid")
    private Member member;
    @Column(length = 40,nullable = false)
    private String title;
    @Column(length = 200,nullable = false)
    private String content;
    private LocalDateTime bdate;

}
