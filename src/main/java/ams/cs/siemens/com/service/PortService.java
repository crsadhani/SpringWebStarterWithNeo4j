package ams.cs.siemens.com.service;

import ams.cs.siemens.com.entity.Device;
import ams.cs.siemens.com.entity.Port;
import ams.cs.siemens.com.repository.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PortService {

    @Autowired
    PortRepository portRepo;

   public Collection<Port> getAllPorts() {
       System.out.println("Ports are " + portRepo.getAllPorts());
        return portRepo.getAllPorts();
    }

}
