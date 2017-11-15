import com.example.demo.TestElasticsearchApplication;
import com.example.demo.dao.ArticleSearchRepository;
import com.example.demo.pojo.Article;
import com.example.demo.pojo.Author;
import com.example.demo.pojo.Tutorial;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Iterator;

/**
 * Created by sunzhenzhou on 2017/11/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestElasticsearchApplication.class)
@ContextConfiguration
public class ElasticSearchTest {

    @Autowired
    private ArticleSearchRepository repository;

    @Test
    public void testSaveArticleIndex(){
        Author author=new Author();
        author.setId(1L);
        author.setName("tianshouzhi");
        author.setRemark("java developer");

        Tutorial tutorial=new Tutorial();
        tutorial.setId(1L);
        tutorial.setName("elastic search");

        Article article =new Article();
        article.setId(1L);
        article.setTitle("springboot integreate elasticsearch");
        article.setAbstracts("springboot integreate elasticsearch is very easy");
        article.setTutorial(tutorial);
        article.setAuthor(author);
        article.setContent("elasticsearch based on lucene,"
                + "spring-data-elastichsearch based on elaticsearch"
                + ",this tutorial tell you how to integrete springboot with spring-data-elasticsearch");
        article.setPostTime(new Date());
        article.setClickCount(1L);

        repository.save(article);
    }

    @Test
    public void testSearch(){
        String queryString="springboot";//搜索关键字
        QueryStringQueryBuilder builder=new QueryStringQueryBuilder(queryString);
        Iterable<Article> searchResult = repository.search(builder);
        Iterator<Article> iterator = searchResult.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
