package com.byes.paap.rest.byescostcenterinterface.dto;

import java.util.List;

public class CostCentersDTO
{
    public List<CostCenterDTO> CostCenters;

    public List<CostCenterDTO> getCostCenters() {
        return CostCenters;
    }

    public void setCostCenters(List<CostCenterDTO> costCenters) {
        CostCenters = costCenters;
    }

}