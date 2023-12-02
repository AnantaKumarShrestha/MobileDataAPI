package com.coreTeam.MobileDataManupulationRestApi.Service;

import com.coreTeam.MobileDataManupulationRestApi.Model.MobileModel;

import java.util.List;

public interface MobileService {

    List<MobileModel> getAllMobileList();
    void addMobileData(MobileModel mobileModel);

    MobileModel findById(int id);
    void deleteAllMobileData();

    void deleteMobileDataById(int id);

    void updateMobileData(MobileModel mobileModel);


}
