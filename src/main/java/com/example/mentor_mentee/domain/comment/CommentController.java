package com.example.mentor_mentee.domain.comment;

import org.springframework.web.bind.annotation.*;

public class CommentController {
    @PostMapping("/")
    public String createComment(@PathVariable(value = "post-id") Long id, @RequestBody String comment) {
        return id + ": " + comment + "댓글 생성 완료";}

    @GetMapping
    public String getAllComments() {
        return "댓글 리스트 조회 완료";
    }

    @GetMapping("/{post-id}")
    public String getPostById(@PathVariable(value = "post-id") Long id) {
        return id + "번 댓글 조회 완료";
    }

    @PutMapping("/{post-id}")
    public String updatePost(@PathVariable(value = "post-id") Long id) {
        return id + "번 댓글 수정 완료";
    }

    @DeleteMapping("/{post-id}")
    public String deletePost(@PathVariable(value = "post-id") Long id){
        return id + "번 댓글 삭제 완료";
    }

}
