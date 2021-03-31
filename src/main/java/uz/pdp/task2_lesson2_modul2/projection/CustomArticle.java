package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.Attachment;

public interface CustomArticle {

    Integer getId();

    String getTitle();

    String getDescription();

    String getLink();

    Attachment getAttachment();
}
