package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Basket;
import uz.pdp.task2_lesson2_modul2.entity.Order;

import java.util.Date;

@Projection(types = Order.class)
public interface CustomOrder {

    Integer getId();

    Date getDate();

    String getDetails();

    Basket getBasket();
}
