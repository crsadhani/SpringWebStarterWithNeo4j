package ams.cs.siemens.com.repository;

import ams.cs.siemens.com.entity.Device;
import ams.cs.siemens.com.entity.Port;
import ams.cs.siemens.com.entity.Template;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PortRepository extends Neo4jRepository<Port, Long> {

        @Query("MATCH (p:Port) RETURN p")
        List<Port> getAllPorts();
}
