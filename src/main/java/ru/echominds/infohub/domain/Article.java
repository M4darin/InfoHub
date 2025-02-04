package ru.echominds.infohub.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "article", schema = "infoHub_backend")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "creation_time")
    private LocalDateTime creationTime;

    @Column(name = "updated_time")
    private LocalDateTime updateTime;

    @Column(name = "views")
    private Long views;

    // Хз как сделаем теги

    // +1 и -1
    @OneToMany(mappedBy = "article")
    private List<Rating> rating;

}
