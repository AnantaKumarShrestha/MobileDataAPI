package com.coreTeam.MobileDataManupulationRestApi.Service.ServiceImpl;

import com.coreTeam.MobileDataManupulationRestApi.Model.MobileModel;
import com.coreTeam.MobileDataManupulationRestApi.Service.MobileService;
import com.coreTeam.MobileDataManupulationRestApi.db.MobileDataRepo;
import io.micrometer.observation.annotation.Observed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    private MobileDataRepo mobileDataRepo;

    @Override
    public List<MobileModel> getAllMobileList(){
        return  mobileDataRepo.findAll();
    }

    @Override
    public void addMobileData(MobileModel mobileModel) {
      mobileDataRepo.save(mobileModel);
    }

    @Override
    public MobileModel findById(int id) {
        return mobileDataRepo.findById(id).get();
    }

    @Override
    public void deleteAllMobileData() {
        mobileDataRepo.deleteAll();
    }

    @Override
    public void deleteMobileDataById(int id) {
      mobileDataRepo.deleteById(id);
    }

    @Override
    public void updateMobileData(MobileModel mobileModel) {
       mobileDataRepo.save(mobileModel);
    }


}
