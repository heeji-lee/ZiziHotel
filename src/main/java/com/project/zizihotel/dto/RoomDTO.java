package com.project.zizihotel.dto;

import com.project.zizihotel.domain.Hotel;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO {

    private Long rid;
    @NotEmpty
    private String rname;
    @NotEmpty
    private String rtype;
    @NotEmpty
    private String info;

}
