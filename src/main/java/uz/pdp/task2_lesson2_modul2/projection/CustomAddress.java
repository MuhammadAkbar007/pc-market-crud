package uz.pdp.task2_lesson2_modul2.projection;

import uz.pdp.task2_lesson2_modul2.entity.District;

public interface CustomAddress {

    Integer getId();

    String getStreet();

    Integer getHomeNumber();

    District getDistrict();
}
