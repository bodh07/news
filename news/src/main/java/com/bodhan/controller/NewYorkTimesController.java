package com.bodhan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bbathla on 4/4/16.
 */

@RestController
public class NewYorkTimesController {

    @RequestMapping("/NYTimesHappyNews")
    public String index() {
        return "Happy news from NYC";
    }
}
