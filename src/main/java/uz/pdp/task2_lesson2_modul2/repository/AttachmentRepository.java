package uz.pdp.task2_lesson2_modul2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task2_lesson2_modul2.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
