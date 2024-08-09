package com.project.zizihotel.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {

    private Long hid;
    @NotEmpty
    private String hname;
    @NotEmpty
    private String haddr;

}
