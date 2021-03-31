package uz.pdp.task2_lesson2_modul2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2_lesson2_modul2.entity.Article;
import uz.pdp.task2_lesson2_modul2.projection.CustomArticle;

@RepositoryRestResource(path = "article", excerptProjection = CustomArticle.class)
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
