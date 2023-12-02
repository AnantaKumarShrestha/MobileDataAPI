package com.coreTeam.MobileDataManupulationRestApi.db;

import com.coreTeam.MobileDataManupulationRestApi.Model.MobileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileDataRepo extends JpaRepository<MobileModel,Integer> {

}
