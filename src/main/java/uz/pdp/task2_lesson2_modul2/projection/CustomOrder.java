package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.Basket;

import java.util.Date;

public interface CustomOrder {

    Integer getId();

    Date getDate();

    String getDetails();

    Basket getBasket();
}
