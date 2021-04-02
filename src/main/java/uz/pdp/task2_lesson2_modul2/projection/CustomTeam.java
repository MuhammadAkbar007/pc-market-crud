package uz.pdp.task2_lesson2_modul2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task2_lesson2_modul2.entity.Attachment;
import uz.pdp.task2_lesson2_modul2.entity.Team;

@Projection(types = Team.class)
public interface CustomTeam {

    Integer getId();

    String getName();

    String getOccupation();

    Attachment getAttachment();
}
