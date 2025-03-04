package com.example.apienglishapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Immutable;
@Entity
@Getter
@Setter
@Table(name = "va")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Immutable
public class VietnameseToEnglishEntity {
    @Id
    Integer id;
    String word;
    String html;
    String description;
    String pronounce;

}
