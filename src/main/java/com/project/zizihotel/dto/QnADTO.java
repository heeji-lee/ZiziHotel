package com.project.zizihotel.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QnADTO {

    private Long qno;
    @NotEmpty
    private String qtitle;
    @NotEmpty
    private String qcontent;
    @NotEmpty
    private LocalDateTime qdate;

}
