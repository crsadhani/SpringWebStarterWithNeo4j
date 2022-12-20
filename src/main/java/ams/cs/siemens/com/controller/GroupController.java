package ams.cs.siemens.com.controller;

import ams.cs.siemens.com.entity.PRP_Group;
import ams.cs.siemens.com.service.GroupService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path= "/sinecams/groups")
public class GroupController {
    @Autowired
    GroupService groupService;

    @GetMapping
    public Collection<PRP_Group> getAllGroups(){

        return groupService.getAllGroups();
    }


    @GetMapping("/groupDevices")
    public Collection<PRP_Group> getGroupDevices() {

        return groupService.getGroupDevices();
    }

    @GetMapping("/groupDevices/{id}")
    public Optional<PRP_Group> getGroupDevices(@PathVariable("id") Long id){

        return groupService.getGroupInfoById(id);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createGroup(@RequestBody PRP_Group group){
        groupService.createGroup(group);
        return new ResponseEntity("Group Created", HttpStatus.OK);
    }


}
