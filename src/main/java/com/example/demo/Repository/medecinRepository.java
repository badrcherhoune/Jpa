package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Entities.Medecin;

@RepositoryRestResource
public interface medecinRepository extends JpaRepository<Medecin, Long> {

}
