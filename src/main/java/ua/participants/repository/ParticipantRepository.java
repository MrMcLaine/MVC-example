package ua.participants.repository;

import ua.participants.entity.Participant;

import java.util.List;

public interface ParticipantRepository {
    List<Participant> findAll();

    Participant get(int id);

    void save(Participant participant);

    void delete(int id);
}
