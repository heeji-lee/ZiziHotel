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
public class ReviewDTO {

    private Long revid;
    @NotEmpty
    private String revcontent;
    @NotEmpty
    private Integer rating;

}
