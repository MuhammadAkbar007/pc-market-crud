package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.Address;

public interface CustomUser {

    Integer getId();

    String getFullName();

    String getEmail();

    String getPassword();

    Address getAddress();
}
