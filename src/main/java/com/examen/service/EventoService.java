package com.examen.service;

import com.examen.entity.Evento;
import com.examen.repository.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements iEventoService{
 
    @Autowired
    private EventoRepository EventoRepository;
@Override
    public List<Evento> getAllPerson() {
        return (List<Evento>)EventoRepository.findAll();
    }
@Override
    public void saveEvento(Evento evento) {
        EventoRepository.save(evento);
    }
@Override
    public Evento getEventoById(long id) {
        return EventoRepository.findById(id).orElse(null);
    }
@Override
    public void delete(long id) {
        EventoRepository.deleteById(id);
    }

}
