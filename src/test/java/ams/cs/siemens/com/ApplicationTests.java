package ams.cs.siemens.com;

import ams.cs.siemens.com.repository.NetworkRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.neo4j.repository.Neo4jRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	NetworkRepository networkRepository;


	@Test
	void contextLoads() {
		System.out.println(networkRepository.getClass().getName());
		System.out.println(networkRepository.getClass().getPackageName());

	}

}
