package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Comment;
import uz.pdp.task2_lesson2_modul2.entity.Product;
import uz.pdp.task2_lesson2_modul2.entity.User;

@Projection(types = Comment.class)
public interface CustomComment {

    Integer getId();

    String getBody();

    Integer getNumberOfStars();

    User getUser();

    Product getProduct();
}
