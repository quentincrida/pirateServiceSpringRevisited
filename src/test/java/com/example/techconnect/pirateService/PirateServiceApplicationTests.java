package com.example.techconnect.pirateService;

import com.example.techconnect.pirateService.models.Pirate;
import com.example.techconnect.pirateService.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Pirate jack = new Pirate("Jack", "Sparrow", 32);
		Pirate jane = new Pirate("Jane", "Bloggs", 19);
	}
}
