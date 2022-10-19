package org.example.repository.secondary;


import org.example.entity.FieldMemberValidationMessageMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryFieldMemberValidationMessageRepository extends JpaRepository<FieldMemberValidationMessageMap, Long> {

}
