package id.co.imaniprima.pelindo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.repository.support.Repositories;

import id.co.imaniprima.pelindo.configuration.AppConfig;
import id.co.imaniprima.pelindo.domain.Vessel;
import id.co.imaniprima.pelindo.repository.VesselRepository;

public class PortMgmt {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PortMgmt.class);
	
	public static void main(String[] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		VesselRepository vesselRepo = ctx.getBean(VesselRepository.class);
		for (Vessel v : vesselRepo.findAll()){
			System.out.println(v);
		}
	}
}
