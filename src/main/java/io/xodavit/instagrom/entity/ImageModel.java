package io.xodavit.instagrom.entity;

public class ImageModel {
    private Long id;
    private String name;
    private byte[] imageBytes; //blob
    //нету прямой зависимости
    private Long userId;
    private Long postId;

}
