package org.example.repository.secondary;


import org.example.entity.RequestTransitionMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface SecondaryRequestTransitionMstrRepository extends JpaRepository<RequestTransitionMstr, Long> {

}
