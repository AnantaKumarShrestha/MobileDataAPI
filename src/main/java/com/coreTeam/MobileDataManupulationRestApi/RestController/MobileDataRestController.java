package com.coreTeam.MobileDataManupulationRestApi.RestController;


import com.coreTeam.MobileDataManupulationRestApi.Model.MobileModel;
import com.coreTeam.MobileDataManupulationRestApi.Service.MobileService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobileAPI")
public class MobileDataRestController {


    @Autowired
    private MobileService mobileService;


    @GetMapping("/getAllMobileData")
    public List<MobileModel> getAllMobileData(){
      return mobileService.getAllMobileList();

    }

    @GetMapping("/getMobileById/{id}")
    public MobileModel getMobileById(@PathVariable("id") int id){
     return mobileService.findById(id);
    }

    @DeleteMapping("/deleteAllMobileData")
    public void deleteAllMobileData(){
        mobileService.deleteAllMobileData();
    }

    @DeleteMapping("/deleteMobileData/{id}")
    public void deleteMobileDataById(@PathVariable("id") int id){
        mobileService.deleteMobileDataById(id);
    }

    @PostMapping("/addMobileData")
    public void addMobileData(@RequestBody MobileModel mobileModel){
        mobileService.addMobileData(mobileModel);
    }

    @PutMapping("/updateMobileData/{id}")
    public String updateMobileDataUsingPut(@RequestBody MobileModel mobileModel,@PathVariable("id") int id){

        MobileModel mobileModel1=mobileService.findById(id);
        if(mobileModel1!=null) {
            mobileModel.setId(id);
            mobileService.updateMobileData(mobileModel);
            return "Success";
        }
        return "User Not Found";
    }

    @PatchMapping("/patchMobileCompanyName/{id}")
    public String updateMobileCompanyNameUsingPatch(@RequestBody MobileModel mobileModel,@PathVariable("id") int id){

        MobileModel mobileModel1=mobileService.findById(id);
        if(mobileModel1!=null) {
            mobileModel1.setCompanyName(mobileModel.getCompanyName());
            mobileService.updateMobileData(mobileModel1);
            return "Success";
        }
        return "User Not Found";
    }

    @PatchMapping("/patchMobileModelName/{id}")
    public String updateMobileModelNameUsingPatch(@RequestBody MobileModel mobileModel,@PathVariable("id") int id){

        MobileModel mobileModel1=mobileService.findById(id);
        if(mobileModel1!=null) {
            mobileModel1.setModelName(mobileModel.getModelName());
            mobileService.updateMobileData(mobileModel1);
            return "Success";
        }
        return "User Not Found";
    }

    @PatchMapping("/patchMobilePrice/{id}")
    public String updateMobilePriceUsingPatch(@RequestBody MobileModel mobileModel,@PathVariable("id") int id){

        MobileModel mobileModel1=mobileService.findById(id);
        if(mobileModel1!=null) {
            mobileModel1.setPrice(mobileModel.getPrice());
            mobileService.updateMobileData(mobileModel1);
            return "Success";
        }
        return "User Not Found";
    }



}
