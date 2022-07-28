package com.example.crud_gv.Service.Implement;

import com.example.crud_gv.Mapper.StatusMapper;
import com.example.crud_gv.Model.Dto.StatusDto;
import com.example.crud_gv.Model.Entity.Status;
import com.example.crud_gv.Model.In.StatusIn;
import com.example.crud_gv.Model.Response;
import com.example.crud_gv.Repository.StatusRepository;
import com.example.crud_gv.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Component
public class StatusServiceImplement implements StatusService {
    @Autowired
    private StatusRepository statusRepository;
    @Override
    public Response getAllStatus() {
        List<Status> listStatus = statusRepository.findAll();
        List<StatusDto> listStatusDto = listStatus.stream().map(StatusMapper :: EntityToDto).collect(Collectors.toList());
        return new Response(true, "Get success", listStatusDto);
    }

    @Override
    public Response create(StatusIn statusIn) {
        Status status = StatusMapper.InToEntity(statusIn);
        statusRepository.save(status);
        return new Response(true, "Add success", null);
    }

    @Override
    public Response delete(Integer id) {
        Optional<Status> status = statusRepository.findById(id);
        statusRepository.delete(status.get());
        return new Response(true, "Delete success", null);
    }

    @Override
    public Response update(Integer id, StatusIn statusIn) {
        Optional<Status> status = statusRepository.findById(id);
        Status status1 = status.get();
        status1.setNameStatus(statusIn.getNameStatus());
        status1.setSTT(statusIn.getSTT());
        statusRepository.save(status1);
        return new Response(true, "Update success", null);
    }

}
