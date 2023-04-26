package fr.arialwhite.meteobacktesting;

import fr.arialwhite.meteobacktesting.service.DatafileService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyApplicationListener implements
        ApplicationListener<ContextRefreshedEvent> {

    private final DatafileService datafileService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        datafileService.testTheThing();
    }
}
