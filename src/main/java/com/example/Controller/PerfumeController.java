package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dao.PerfumeClass;
import com.example.Entity.Hair;
import com.example.Entity.Perfume;

@RestController
public class PerfumeController {
	@Autowired
	private PerfumeClass perfumeClass;
	
	@PostMapping("/Perfume_register")
	public Perfume register(@RequestBody Perfume perfume) {
		return perfumeClass.register(perfume);
	}
	@DeleteMapping("/DeletePerfume/{id}")
	public void deleteId(@PathVariable int id) {
		perfumeClass.deleteId(id);
	}
	@PutMapping("/updatePerfume/{id}")
	public Perfume updateId(Perfume perfume) {
		return perfumeClass.updateId(perfume);
	}
	@GetMapping("/getPerfume")
	public List<Perfume> getPerfume() {
		return perfumeClass.getPerfume();
	}
}
