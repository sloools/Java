package me.song.mapstruct.util;

import me.song.mapstruct.dto.SampleDto;
import me.song.mapstruct.dto.SampleEntity;
import org.mapstruct.Mapper;

/* Mapper 인터페이스
*  맵핑하고자 하는 객체 간의 메소드를 정의
*  */
@Mapper
public interface DtoMapper {
    SampleDto entityToDto(SampleEntity sampleEntity);

    SampleEntity dtoToEntity(SampleDto sampleDto);
}
