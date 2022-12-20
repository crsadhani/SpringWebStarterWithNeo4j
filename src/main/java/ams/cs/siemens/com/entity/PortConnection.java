package ams.cs.siemens.com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
//This is intermediate node helps to provide relationship between 2 same type of nodes. @TargetNode helps to find dest node.
//Port class will be the source. Control will come to this class after Port Class to create relationship
public class PortConnection {

    @Id
    @GeneratedValue
    private Long id;

    @TargetNode
    private Port port;

    private String linkType;

    public String getLinkType() {
        return linkType;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }
}
