package com.tienda.service;

import com.tienda.domain.Credito;
import java.util.List;

public interface CreditoService {
    
    public List<Credito> getCreditos();
    
    public void save(Credito cliente);
    
    public void delete(Credito cliente);
    
    public Credito getCredito(Credito cliente);
    
}