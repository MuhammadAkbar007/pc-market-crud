package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Attachment;
import uz.pdp.task2_lesson2_modul2.entity.Category;
import uz.pdp.task2_lesson2_modul2.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    String getModel();

    String getDescription();

    Double getPrice();

    Boolean getActive();

    Attachment getAttachment();

    Category getCategory();
}
