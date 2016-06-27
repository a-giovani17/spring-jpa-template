package id.co.imaniprima.pelindo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.co.imaniprima.pelindo.domain.Vessel;
import id.co.imaniprima.pelindo.repository.VesselRepository;

@RestController
@RequestMapping(path = "/vessel")
public class VesselController {

	@Autowired
	private VesselRepository vesselRepo;

	@RequestMapping(path = "/all")
	public List<Vessel> getAllVessel() {
		return (List<Vessel>) vesselRepo.findAll();
	}

}
