package org.example.repository.secondary;


import org.example.entity.StaticFileMstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SecondaryStaticFileMstrRepository extends JpaRepository<StaticFileMstr, Long> {


}
