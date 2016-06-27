package id.co.imaniprima.pelindo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import id.co.imaniprima.pelindo.domain.Vessel;

public interface VesselRepository extends CrudRepository<Vessel, Integer> {
	
	List<Vessel> findByOwner(String owner);
	
	Vessel findById(int id);
}
