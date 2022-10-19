package org.example.repository.secondary;

import org.example.entity.DocumentConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by suyog on 23/7/20.
 */
@Repository
public interface SecondaryDocumentConfigRepository extends JpaRepository <DocumentConfig, Long>{


}
