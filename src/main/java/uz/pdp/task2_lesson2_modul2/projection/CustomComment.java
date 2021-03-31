package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.Product;
import uz.pdp.task2_lesson2_modul2.entity.User;

public interface CustomComment {

    Integer getId();

    String getBody();

    Integer getNumberOfStars();

    User getUser();

    Product getProduct();
}
