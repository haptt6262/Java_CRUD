package com.example.crud_gv.Service;

import com.example.crud_gv.Model.In.StatusIn;
import com.example.crud_gv.Model.Response;
import org.springframework.stereotype.Service;

@Service
public interface StatusService {
    Response getAllStatus();
    Response create(StatusIn statusIn);
    Response delete(Integer id);
    Response update(Integer id, StatusIn statusIn);
}
