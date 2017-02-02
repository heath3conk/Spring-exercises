package com.allstate.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/vehicles")
    public String getIndividualParams(@RequestParam String year, String doors) {
        return String.format("Year is: %s and doors is: %s", year, doors);
    }

}
