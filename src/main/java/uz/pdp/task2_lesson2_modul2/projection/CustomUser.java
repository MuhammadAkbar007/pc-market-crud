package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Address;
import uz.pdp.task2_lesson2_modul2.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Address getAddress();
}
