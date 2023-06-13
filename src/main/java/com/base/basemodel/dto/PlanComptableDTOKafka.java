package com.base.basemodel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WIAM
 **/
@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class PlanComptableDTOKafka {
    private String id;
    private String numeroCompte;
    private String intitule;
    private Boolean reporter;
    private String compteGeneralId;
}
