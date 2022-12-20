package ams.cs.siemens.com.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;
@NodeEntity
@Data
public class Port {

    @Id @GeneratedValue
    private Long id;
    private String portName;
    private String portType;

    private String name;

    //Source Class
    @Relationship(type="connectedTo", direction = Relationship.Direction.OUTGOING)
    private PortConnection connectedTo;


    public Port() {
    }

    public Long getId() {
        return id;
    }

    public String getPortName() {
        return portName;
    }

    public String getPortType() {
        return portType;
    }

    public String getName() {
        return name;
    }
}

