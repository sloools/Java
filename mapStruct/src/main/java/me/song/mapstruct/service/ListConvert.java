package me.song.mapstruct.service;

import me.song.mapstruct.dto.SampleDto;
import me.song.mapstruct.dto.SampleEntity;
import me.song.mapstruct.util.DtoMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListConvert {

    private final DtoMapper mapper = Mappers.getMapper(DtoMapper.class);

    public void convertListToList(){
        List<SampleEntity> sampleEntityList = new ArrayList<>();

        sampleEntityList.add(new SampleEntity(1,"Song"));
        sampleEntityList.add(new SampleEntity(2,"Andrew"));

        // MapStruct를 사용한 방법 - MapStruct가 BeanUtils보다 빠리고 type-safe 하다
        List<SampleDto> sampleDtoList = sampleEntityList
                                                .stream()
                                                .map(sampleEntity -> mapper.entityToDto(sampleEntity))
                                                .collect(Collectors.toList());

        // Spring BeanUtils.copyProperties 를 사용한 방법
        List<SampleDto> sampleDtoList2 = sampleEntityList
                .stream()
                .map(sampleEntity -> new SampleDto(sampleEntity))
                .collect(Collectors.toList());

        System.out.println("=========convertListToList1===========");
        sampleDtoList.forEach(x ->
                        System.out.println(x.toString()));

        System.out.println("=========convertListToList2===========");
        sampleDtoList2.forEach(x ->
                System.out.println(x.toString()));
    }
}
