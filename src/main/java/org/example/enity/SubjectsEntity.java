package org.example.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "subjects")
@Accessors(chain = true)
public class SubjectsEntity {

    @Id
    @Column(nullable = false, unique = true, name = "subject_id")
    private UUID subject_id;

    @Column(nullable = false, name = "subj_name")
    private String subject_name;

    @Column(nullable = false, name = "lecturer")
    private String lecturer;

}