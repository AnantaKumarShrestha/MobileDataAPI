package com.coreTeam.MobileDataManupulationRestApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Data
@Entity
public class MobileModel {


    @Id
    @Generated
    private int id;
    private String companyName;
    private String modelName;
    private String price;



}
