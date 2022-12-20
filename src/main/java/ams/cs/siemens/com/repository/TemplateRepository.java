package ams.cs.siemens.com.repository;

import ams.cs.siemens.com.entity.Device;
import ams.cs.siemens.com.entity.Template;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TemplateRepository extends Neo4jRepository<Template, Long> {

    @Query("Match (n) RETURN n")
    Collection<Template> getTemplates();


}
