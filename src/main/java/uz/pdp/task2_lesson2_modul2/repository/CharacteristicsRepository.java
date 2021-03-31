package uz.pdp.task2_lesson2_modul2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2_lesson2_modul2.entity.Characteristics;
import uz.pdp.task2_lesson2_modul2.projection.CustomCharacteristics;

@RepositoryRestResource(path = "characteristics", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepository extends JpaRepository<Characteristics, Integer> {
}
