package ams.cs.siemens.com.repository;

import ams.cs.siemens.com.entity.PRP_Group;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface GroupRepository extends Neo4jRepository<PRP_Group, Long> {
    @Query("Match (n:PRP_Group) RETURN n")
    Collection<PRP_Group> getGroups();

    @Query("Match (g:PRP_Group) - [r:CONTAINS] -> (p:Device)  RETURN g,r,p")
    Collection<PRP_Group> getGroupDevices();


    /*@Query("MATCH p = (a)-->(b)-->(c) WHERE a.name = $name AND c.name = $name1 RETURN nodes(p), relationships(p)")
    Collection<PRP_Group> findPathToPort(@Param("name") String name, @Param("name") String name1); */
}
