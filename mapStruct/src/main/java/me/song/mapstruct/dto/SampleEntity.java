package me.song.mapstruct.dto;

import lombok.*;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SampleEntity {
    Integer id;
    String name;

    public SampleEntity(SampleDto sampleDto){
        BeanUtils.copyProperties(sampleDto, this);
    }
}
