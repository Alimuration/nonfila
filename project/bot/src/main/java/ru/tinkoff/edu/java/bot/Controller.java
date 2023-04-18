package ru.tinkoff.edu.java.bot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    private final datafile linkService;

    public Controller(datafile linksService) {
        this.linkService = linksService;
    }

    @PostMapping(value = "updates")
    public void sendUpdate(@RequestBody scrapperVOT request){
    	 datafile.updateLink(request);
    }
}
