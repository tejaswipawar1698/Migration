package org.example.repository.secondary;

import org.example.entity.DocumentKit;
import org.example.entity.DocumentKitFieldGroupsFieldMemberMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SecondaryDocumentKitFieldGroupsFieldMemberMapRepository extends JpaRepository<DocumentKitFieldGroupsFieldMemberMap, Long> {



}
