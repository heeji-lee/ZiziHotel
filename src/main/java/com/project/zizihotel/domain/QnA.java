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
public class QnA {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long qno;
    @ManyToOne
    @JoinColumn(name = "mid")
    private Member member;
    @Column(length = 40,nullable = false)
    private String qtitle;
    @Column(length = 200,nullable = false)
    private String qcontent;
    private LocalDateTime qdate;

}
