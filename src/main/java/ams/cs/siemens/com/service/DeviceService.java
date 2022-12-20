package ams.cs.siemens.com.service;

import ams.cs.siemens.com.entity.Device;
import ams.cs.siemens.com.entity.Port;
import ams.cs.siemens.com.repository.NetworkRepository;
import ams.cs.siemens.com.repository.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class DeviceService {

    @Autowired
    NetworkRepository networkRepo;

    @Autowired
    PortRepository portRepo;


    public Collection<Device> getDevicePorts()
    {
        return networkRepo.listDevices();
    }

    public Collection<Device> getAllDevices() {
        return networkRepo.getAllGroupDevices();
    }

    public Device saveDevices(Device devices) {
        return networkRepo.save(devices);

    }
    public ResponseEntity<HttpStatus> deleteNodeByID(Long id){
        networkRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public Device createDevices(Device devices) {

         networkRepo.save(devices);

         if(devices.getPorts()!=null){
             for(Port p: devices.getPorts()){
                 portRepo.save(p);
             }
         }

         return devices;

    }
    public Device updateDevice(Device device) {
        Device device1 = networkRepo.findById(device.getId()).get();
        device1.setHostname(device.getHostname());
        device1.setIp(device.getIp());
        device1.setName(device1.getName());

        networkRepo.save(device1);

        return device1;
    }
}
