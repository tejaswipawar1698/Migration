package org.example.repository.secondary;

import org.example.entity.ReasonMstrTranslation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecondaryReasonMstrTranslationRepository extends JpaRepository<ReasonMstrTranslation, Long>{


}
