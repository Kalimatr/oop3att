package org.example.repository;

import org.example.enity.SubjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface SubjectsRepository extends JpaRepository<SubjectsEntity, UUID> {
}
