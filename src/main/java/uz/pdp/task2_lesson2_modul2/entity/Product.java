package uz.pdp.task2_lesson2_modul2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String model;

    private String description;

    private Double price;

    private Boolean active;

    @OneToOne
    private Attachment attachment;

    @ManyToOne
    private Category category;
}
