package ams.cs.siemens.com.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.*;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "CONTAINS")
@Data
public class GroupRelation {

    @Id @GeneratedValue
    private List<String> values = new ArrayList<>();

    @StartNode
    private PRP_Group group;

    @TargetNode
    private Device device;

}
