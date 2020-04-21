package com.example.techconnect.pirateService;

import com.example.techconnect.pirateService.models.Pirate;
import com.example.techconnect.pirateService.models.Ship;
import com.example.techconnect.pirateService.repositories.PirateRepository;
import com.example.techconnect.pirateService.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createPirate(){
//		Pirate jack = new Pirate("Jack", "Sparrow", 32);
//		Pirate jane = new Pirate("Jane", "Bloggs", 19);
//		pirateRepository.save(jack);
//		pirateRepository.save(jane);
//	}

	@Test
	public void createPirateAndShip(){
		Ship ship = new Ship("Dutchy");
		shipRepository.save(ship);
		Pirate pirate1 = new Pirate("Bob", "Cairns", 45, ship);
		pirateRepository.save(pirate1);
	}
}
