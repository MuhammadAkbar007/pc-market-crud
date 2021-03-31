package uz.pdp.task2_lesson2_modul2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task2_lesson2_modul2.entity.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

    Optional<AttachmentContent> findByAttachmentId(Integer attachment_id);
}
