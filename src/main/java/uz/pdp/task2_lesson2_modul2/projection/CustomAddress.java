package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Address;
import uz.pdp.task2_lesson2_modul2.entity.District;

@Projection(types = Address.class)
public interface CustomAddress {

    Integer getId();

    String getStreet();

    Integer getHomeNumber();

    District getDistrict();
}
