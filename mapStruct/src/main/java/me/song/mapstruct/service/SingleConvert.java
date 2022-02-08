package me.song.mapstruct.service;

import me.song.mapstruct.dto.SampleDto;
import me.song.mapstruct.dto.SampleEntity;
import org.springframework.stereotype.Service;

@Service
public class SingleConvert {

    public void convertDtoToEntity(){

        SampleDto sampleDto = SampleDto.builder()
                .id(1)
                .name("Song")
                .build();

        SampleEntity sampleEntity = new SampleEntity(sampleDto);
        System.out.println("=========convertDtoToEntity==========");
        System.out.println(sampleEntity.toString());
    }

    public void convertEntityToDto(){

        SampleEntity sampleEntity = SampleEntity.builder()
                .id(2)
                .name("Song")
                .build();

        SampleDto sampleDto = new SampleDto(sampleEntity);
        System.out.println("=========convertEntityToDto==========");
        System.out.println(sampleDto.toString());
    }
}
