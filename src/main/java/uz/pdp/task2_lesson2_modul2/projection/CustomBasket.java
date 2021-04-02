package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Basket;
import uz.pdp.task2_lesson2_modul2.entity.OutputProduct;
import uz.pdp.task2_lesson2_modul2.entity.User;

import java.util.List;

@Projection(types = Basket.class)
public interface CustomBasket {

    Integer getId();

    Double getSum();

    User getUser();

    List<OutputProduct> getOutputProductList();
}
