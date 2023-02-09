package com.portfolio.julianfranco.Interface;

import com.portfolio.julianfranco.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Trae una lista de personas
    public List<Persona> getPersona();
    
    //Guarda un objeto de tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un usuario buscado por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);

}
