package me.song.mapstruct.dto;

import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SampleDto {
    Integer id;
    String name;

    public SampleDto(SampleEntity sampleEntity){
        BeanUtils.copyProperties(sampleEntity, this);
    }
}
