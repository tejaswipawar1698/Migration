package org.example.repository.secondary;


import org.example.entity.DocumentKitFieldGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryDocumentKitFieldGroupsRepository extends JpaRepository<DocumentKitFieldGroups, Long> {


}
