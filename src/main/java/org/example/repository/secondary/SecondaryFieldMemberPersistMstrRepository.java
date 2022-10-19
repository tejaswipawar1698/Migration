package org.example.repository.secondary;

import org.example.entity.FieldMemberPersistMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryFieldMemberPersistMstrRepository extends JpaRepository<FieldMemberPersistMstr, Long> {



}
