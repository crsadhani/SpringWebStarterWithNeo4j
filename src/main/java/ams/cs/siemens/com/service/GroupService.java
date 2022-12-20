package ams.cs.siemens.com.service;

import ams.cs.siemens.com.entity.Device;
import ams.cs.siemens.com.entity.PRP_Group;
import ams.cs.siemens.com.repository.GroupRepository;
import ams.cs.siemens.com.repository.NetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepo;

    @Autowired
    NetworkRepository deviceRepo;

    public Collection<PRP_Group> getGroupDevices()
    {
        return groupRepo.getGroupDevices();
    }

    public Collection<PRP_Group> getAllGroups() {
        return groupRepo.getGroups();
    }

    public PRP_Group createGroup(PRP_Group group) {
            groupRepo.save(group);
            if (group.getDevices() != null) {
                for (Device d : group.getDevices()) {
                    deviceRepo.save(d);
                }
            }

        return group;
    }
    public Optional<PRP_Group> getGroupInfoById(Long id) {
        return  groupRepo.findById(id);
    }



    }

