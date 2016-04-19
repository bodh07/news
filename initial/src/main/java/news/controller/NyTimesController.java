package news.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bbathla on 4/19/16.
 */

@RestController
public class NyTimesController {

    @RequestMapping("/NyTimes/WorldNews")
    public String worldNewsController (){

        return "World News";
    }
}
