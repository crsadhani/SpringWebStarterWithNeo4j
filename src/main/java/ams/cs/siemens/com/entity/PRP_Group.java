package ams.cs.siemens.com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.stereotype.Component;

import java.util.*;

@NodeEntity
@Data
@Component
public class PRP_Group {
    @Id
    @GeneratedValue
    private Long id;
    private String groupType;

    private String name;

    @Relationship(type="CONTAINS", direction = Relationship.Direction.OUTGOING)
    private List<Device> devices = new ArrayList<>();

    public List<Device> getDevices() {
        return devices;
    }

    public PRP_Group() {
    }

    public Long getId() {
        return id;
    }

    public String getGroupType() {
        return groupType;
    }

    public String getName() {
        return name;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
