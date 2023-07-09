package me.jskim.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jskim.springbootdeveloper.domain.Article;
import me.jskim.springbootdeveloper.dto.AddArticleRequest;
import me.jskim.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {

        return blogRepository.save(request.toEntity());
    }
}
