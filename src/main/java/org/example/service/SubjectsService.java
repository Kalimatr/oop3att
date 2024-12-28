package org.example.service;


import lombok.RequiredArgsConstructor;
import org.example.enity.SubjectsEntity;
import org.example.repository.SubjectsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SubjectsService {

    private final SubjectsRepository subjectsRepository;

    @Transactional
    public SubjectsEntity updateSubject(UUID subject_ID, String subject_name, String lecturer){
        Optional<SubjectsEntity> subjectOpt = subjectsRepository.findById(subject_ID);

        SubjectsEntity subject = subjectOpt.orElse(null);

        assert subject != null;
        subject.setSubject_name(subject_name);
        subject.setLecturer(lecturer);

        return subjectsRepository.save(subject);
    }

    @Transactional
    public SubjectsEntity addNewSubject(String subject_name, String lecturer){
        SubjectsEntity subject = new SubjectsEntity();
        subject.setSubject_id(UUID.randomUUID());
        subject.setSubject_name(subject_name);
        subject.setLecturer(lecturer);

        return subjectsRepository.save(subject);
    }

    @Transactional
    public void delSubjectById(UUID ID){
        subjectsRepository.deleteById(ID);
    }
}
