package com.lld.splitwise.controllers;

import com.lld.splitwise.models.Group;
import com.lld.splitwise.models.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;

    public GroupController() {
        groupList = new ArrayList<>();
    }

    public void createGroup(Integer id, String name, User createdByUser) {
        Group group = new Group();
        group.setId(id);
        group.setName(name);
        group.addMember(createdByUser);
        groupList.add(group);
    }

    public Group getGroupById(Integer groupId) {
        for (Group group : groupList) {
            if (group.getId().equals(groupId)) {
                return group;
            }
        }
        return null;
    }
}
