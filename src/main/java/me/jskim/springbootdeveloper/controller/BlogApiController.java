package me.jskim.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.jskim.springbootdeveloper.domain.Article;
import me.jskim.springbootdeveloper.dto.AddArticleRequest;
import me.jskim.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController  //http 응답으로 객체 데이터를 json 형태로 반환
public class BlogApiController {

    private final BlogService blogService;
    @PostMapping("/api/articles") //method가 post형식의 /api/aritcles/ 요청이 들어오면 실행
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {

        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }
}
