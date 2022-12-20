package ams.cs.siemens.com.controller;

import ams.cs.siemens.com.entity.Device;
import ams.cs.siemens.com.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/sinecams/networks")
public class DeviceController {

    @Autowired
    DeviceService deviceService;

    @GetMapping
    public Collection<Device> getDevicePorts() {
        return deviceService.getDevicePorts();
    }

    @GetMapping(path = "/devices")
    public Collection<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @GetMapping(path = "/devices/{id}")
    public List<Device> getDevice(@PathVariable("id") Long id) {
        List<Device> deviceList = new ArrayList<Device>();
        Stream<Device> devices = deviceService.getAllDevices().stream();
        deviceList =devices.filter(x-> x.getId().equals(id)).collect(Collectors.toList());
        return deviceList;
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createDevice(@RequestBody Device device){
        deviceService.saveDevices(device);
        return new ResponseEntity("Device Created", HttpStatus.OK);
    }

    @DeleteMapping(path= "/{id}")
    public ResponseEntity<HttpStatus> deleteNodeById(@PathVariable("id") Long id){
        System.out.println("Device id getting deleted is " + id);
        deviceService.deleteNodeByID(id);
        return  new ResponseEntity("Device Deleted", HttpStatus.OK);
    }

    @PutMapping("/update")
    public Device updateDevice(@RequestBody Device device){
        return deviceService.updateDevice(device);

    }


}
