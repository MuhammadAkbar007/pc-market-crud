package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Article;
import uz.pdp.task2_lesson2_modul2.entity.Attachment;

@Projection(types = Article.class)
public interface CustomArticle {

    Integer getId();

    String getTitle();

    String getDescription();

    String getLink();

    Attachment getAttachment();
}
