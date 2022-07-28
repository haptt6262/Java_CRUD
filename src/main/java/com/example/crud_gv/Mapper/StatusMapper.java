package com.example.crud_gv.Mapper;

import com.example.crud_gv.Model.Dto.StatusDto;
import com.example.crud_gv.Model.Entity.Status;
import com.example.crud_gv.Model.In.StatusIn;

public class StatusMapper {
    public static Status InToEntity(StatusIn statusIn){
        Status status = new Status();
        status.setId(statusIn.getId());
        status.setNameStatus(statusIn.getNameStatus());
        status.setSTT(statusIn.getSTT());
        return status;
    }
    public static StatusDto EntityToDto(Status status){
        StatusDto statusDto = new StatusDto();
        statusDto.setId(status.getId());
        statusDto.setNameStatus(status.getNameStatus());
        statusDto.setSTT(status.getSTT());
        return statusDto;
    }
}