package com.example.crud_gv.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusDto {
    private Integer id;
    private String nameStatus;
    private String STT;
}
