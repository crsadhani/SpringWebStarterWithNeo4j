package ams.cs.siemens.com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.neo4j.core.schema.Id;

import java.util.*;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Template {

    @Id
    private Long id;
    private String name;
    private String templateType;
    private int template_id;
    private String type;

    @Relationship(type="CONTAINS", direction = Relationship.OUTGOING)
    private List<PRP_Group> groups;

    @Relationship(type="CONTAINS", direction = Relationship.OUTGOING)
    private List<Device> devices;

}
