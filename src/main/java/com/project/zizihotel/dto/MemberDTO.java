package com.project.zizihotel.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private String mid;
    @NotEmpty
    private String mpw;
    @NotEmpty
    private String email;
    @NotEmpty
    private String mname;
    @NotEmpty
    private String phone;

}
