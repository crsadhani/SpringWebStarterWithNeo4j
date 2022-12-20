package ams.cs.siemens.com;

import ams.cs.siemens.com.repository.NetworkRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public class RepositoryInterfaceTest {

    @Autowired
    private NetworkRepository neoRepository;

    @Test
    void contextLoads(){
        System.out.println(neoRepository.getClass().getName());
        System.out.println(neoRepository.getClass().getPackageName());
    }

}
