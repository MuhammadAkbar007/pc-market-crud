package uz.pdp.task2_lesson2_modul2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2_lesson2_modul2.entity.Region;
import uz.pdp.task2_lesson2_modul2.projection.CustomRegion;

@RepositoryRestResource(path = "region", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
