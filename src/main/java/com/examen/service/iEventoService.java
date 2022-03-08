package com.examen.service;

import com.examen.entity.Evento;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface iEventoService {
    
    public List<Evento> getAllPerson();
    public void saveEvento (Evento evento);
    public Evento getEventoById (long id);
    public void delete(long id);

    
}
