package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.OutputProduct;
import uz.pdp.task2_lesson2_modul2.entity.User;

import java.util.List;

public interface CustomBasket {

    Integer getId();

    Double getSum();

    User getUser();

    List<OutputProduct> getOutputProductList();
}
