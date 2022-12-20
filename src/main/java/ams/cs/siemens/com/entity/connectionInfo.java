package ams.cs.siemens.com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@AllArgsConstructor
@NoArgsConstructor
public class connectionInfo {

    @Id
    private Long id;

    private String srcPortId;

    private String destPortId;

    private String srcDeviceId;

    private String destDeviceId;

}
