package org.example;



import org.example.enity.SubjectsEntity;
import org.example.service.SubjectsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Runner implements CommandLineRunner {

    private final SubjectsService subjectsService;

    public Runner(SubjectsService subjectsService) {
        this.subjectsService = subjectsService;
    }

    @Override
    public void run(String... args) throws Exception {
        SubjectsEntity newSubject = subjectsService.addNewSubject("CG", "Kosenko");

        UUID subj_Uuid = newSubject.getSubject_id();

        System.out.println("Добавлен новый придмет с ID: " + subj_Uuid);

        subjectsService.updateSubject(subj_Uuid, "Math", "Kiselev");
        System.out.println("Обновили предмет");

        subjectsService.delSubjectById(subj_Uuid);
        System.out.println("Удалили предмет");
    }
}