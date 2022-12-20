package ams.cs.siemens.com.controller;

import ams.cs.siemens.com.entity.Port;
import ams.cs.siemens.com.repository.PortRepository;
import ams.cs.siemens.com.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/sinecams/ports/")
public class PortController {

    @Autowired
    PortService portService;

    @GetMapping
    public Collection<Port> getAllPorts(){
        return portService.getAllPorts();
    }

}
