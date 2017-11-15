package com.example.demo.dao;

import com.example.demo.pojo.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by sunzhenzhou on 2017/11/15.
 * 泛型的参数分别是实体类型和主键类型
 */
public interface ArticleSearchRepository extends ElasticsearchRepository<Article,Long> {
}
