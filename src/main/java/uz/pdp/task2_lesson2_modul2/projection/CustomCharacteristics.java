package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Characteristics;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {

    Integer getId();

    String getName();

    String getType();
}
