package com.allstate.comment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts/{postId}/comments")
public class CommentsController {

    @GetMapping("/") // <-- will match /posts/34/comments
    public String getComments(@PathVariable int postId) {
        return String.format("the post id is %s; comment id is %s");
    }

    @GetMapping("/{commentId}") // <-- will match /posts/34/comments
    public String getComment(@PathVariable int postId, @PathVariable int commentId) {
       return "a string";
    }
}

