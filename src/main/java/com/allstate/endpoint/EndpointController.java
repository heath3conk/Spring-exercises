package com.allstate.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {
    @GetMapping("/drivers/{q}/trips") // matches /individual-example/foo/bar
    public String getIndividualParams(@PathVariable("q") String query) {
        return String.format("q: %s", query);
    }

    @GetMapping("/test/tasks/{taskId}/comments/{commentId}")
    public String getCommentsForTask(Endpoint ids) {
        return String.format("taskId is %s; commentId is %s", ids.getTaskId(), ids.getCommentId());
    }
}
