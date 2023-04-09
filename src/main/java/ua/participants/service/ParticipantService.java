package ua.participants.service;

import ua.participants.entity.Participant;

import java.util.List;

public interface ParticipantService {
    List<Participant> findAll();

    Participant get(int id);

    void save(Participant participant);

    void delete(int id);
}
