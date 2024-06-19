package com.adso.project2.service;

import com.adso.project2.model.Registro;
import com.adso.project2.repository.RepositoryRegistro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRegistro {
    @Autowired
    private RepositoryRegistro repositoryRegister;

    public ServiceRegistro() {
    }

    public List<Registro> getAllRegistro() {
        return this.repositoryRegister.findAll();
    }

    public Registro saveRegister(Registro registro) {
        return (Registro)this.repositoryRegister.save(registro);
    }

    public void deleteRegister(long id) {
        repositoryRegister.deleteById(id);
    }

    public Registro getRegistro(Long id) {
        return repositoryRegister.findById(id).orElseThrow(() -> new IllegalArgumentException("ID de registro inválido: " + id));
    }

    public void saveOrUpdate(Registro registro) {
        repositoryRegister.save(registro);
    }
}
