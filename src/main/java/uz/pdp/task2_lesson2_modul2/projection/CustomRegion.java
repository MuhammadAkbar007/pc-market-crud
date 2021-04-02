package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Region;

@Projection(types = Region.class)
public interface CustomRegion {

    Integer getId();

    String getName();
}
