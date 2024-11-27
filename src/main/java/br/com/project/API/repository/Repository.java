package br.com.project.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.project.API.model.Client;

public interface Repository extends JpaRepository<Client, Long>{

}
