package br.com.project.API.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.API.model.Client;
import br.com.project.API.repository.Repository;

@RestController
@CrossOrigin(origins = "https://kayquemts.github.io")
public class Control {
	
	@Autowired
	private Repository action;
	
	@PostMapping("/")
	public Client register(@RequestBody Client c) {
		return action.save(c);
	}
	
	
	@GetMapping("/")
	public List<Client> selectAllClients() {
		return action.findAll();
	}
	
	@PutMapping("/")
	public Client edit(@RequestBody Client c) {
		return action.save(c);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		action.deleteById(id);
	}
}
