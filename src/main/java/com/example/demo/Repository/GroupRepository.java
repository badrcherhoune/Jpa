package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Entities.Groupe;

@RepositoryRestResource
public interface GroupRepository extends JpaRepository<Groupe, Long> {

}
