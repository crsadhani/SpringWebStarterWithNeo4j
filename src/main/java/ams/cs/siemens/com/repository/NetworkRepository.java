package ams.cs.siemens.com.repository;

import ams.cs.siemens.com.entity.Device;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface NetworkRepository extends Neo4jRepository<Device, Long> {

    @Query("Match (d:Device) - [r:hasPort] -> (p:Port) RETURN d,p,r")
    Collection<Device> listDevices();

    @Query("Match (g:PRP_Group) - [r:CONTAINS] -> (d:Device) RETURN g,r,d")
    Collection<Device> getAllGroupDevices();

}
