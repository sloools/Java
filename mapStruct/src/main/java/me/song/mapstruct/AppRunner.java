package me.song.mapstruct;

import lombok.RequiredArgsConstructor;
import me.song.mapstruct.service.ListConvert;
import me.song.mapstruct.service.SingleConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    SingleConvert singleConvert;

    @Autowired
    ListConvert listConvert;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        singleConvert.convertDtoToEntity();

        listConvert.convertListToList();
    }
}
