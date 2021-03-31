package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.Attachment;
import uz.pdp.task2_lesson2_modul2.entity.Category;

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
