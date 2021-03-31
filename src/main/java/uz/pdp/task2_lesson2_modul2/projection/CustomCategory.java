package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.Category;

public interface CustomCategory {

    Integer getId();

    String getNameUz();

    String getNameEng();

    String getNameRu();

    Category getParentCategory();
}
