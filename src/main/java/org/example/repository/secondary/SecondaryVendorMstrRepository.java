package org.example.repository.secondary;

import org.example.entity.VendorMstr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryVendorMstrRepository extends JpaRepository<VendorMstr,Integer> {
}
