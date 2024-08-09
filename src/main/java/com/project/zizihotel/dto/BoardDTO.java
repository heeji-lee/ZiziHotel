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
public class BoardDTO {

    private Long bid;
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;
    @NotEmpty
    private LocalDateTime bdate;

}
