package io.xodavit.instagrom.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Data
@Entity
public class ImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imageBytes;
    @JsonIgnore //нету прямой зависимости,и мы сделаем свои dto, поэтому не сохранем в базу
    private Long userId;
    @JsonIgnore //нету прямой зависимости,и мы сделаем свои dto, поэтому не сохранем в базу
    private Long postId;

}
