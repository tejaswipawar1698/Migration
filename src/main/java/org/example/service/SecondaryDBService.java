package org.example.service;

import org.example.entity.FieldGroupMembers;
import org.example.repository.secondary.SecondaryFieldGroupMembersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SecondaryDBService {

    @Autowired
    SecondaryFieldGroupMembersRepository secondaryFieldGroupMembersRepository;

    public List<FieldGroupMembers> fetchFieldGroupMembers(Long companyMstrSeq, Character status)
    {
        return secondaryFieldGroupMembersRepository.findByCompanyMstrSeqAndStatus(companyMstrSeq, status);
    }

}
