package uz.pdp.task2_lesson2_modul2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2_lesson2_modul2.entity.Address;
import uz.pdp.task2_lesson2_modul2.projection.CustomAddress;

@RepositoryRestResource(path = "address", excerptProjection = CustomAddress.class)
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
