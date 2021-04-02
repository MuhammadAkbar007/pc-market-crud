package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getNameUz();

    String getNameEng();

    String getNameRu();

    Category getParentCategory();
}
