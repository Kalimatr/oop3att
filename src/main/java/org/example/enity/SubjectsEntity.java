package org.example.enity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "subjects")
public class SubjectsEntity {

    @Id
    private UUID subject_id;
    private String subject_name;
    private String lecturer;

    // Getters and Setters
    public UUID getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(UUID subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}