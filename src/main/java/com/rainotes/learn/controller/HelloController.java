package com.rainotes.learn.controller;

import com.rainotes.learn.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Article hello() {
//        Article article = new Article(1L, "rainotes");
//        article.setAuthor("雨音");
        Article articlel = Article.builder().id(1).author("社区").build();
        log.info("测试" + articlel);
        return articlel;
    }
}
