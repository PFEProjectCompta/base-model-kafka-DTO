package com.base.basemodel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data @NoArgsConstructor@AllArgsConstructor@Builder
public class SocieteDTOKafka implements Serializable {
    private String id;
    private String raison_social;
    private String activite;
    private String adresse;
    private String compteUtilisateurId;
}
