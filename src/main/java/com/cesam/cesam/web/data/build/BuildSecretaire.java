package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.organisation.administration.Secretaire;
import com.cesam.cesam.web.data.organisation.administration.response.secretaire.SecretaireResponse;

public class BuildSecretaire {

	public static SecretaireResponse buildSecretaire(Secretaire secretaire) {
		SecretaireResponse secretaireResponse = new SecretaireResponse();
		secretaireResponse.setCommunity(BuildCommunity.buildCommunity(secretaire.getCommunity()));
		secretaireResponse.setMandatEnd(secretaire.getMandatEnd());
		secretaireResponse.setMandatStart(secretaire.getMandatStart());
		secretaireResponse.setSecretaireId(secretaire.getSecretaireId());
		secretaireResponse.setMember(BuildMember.buildMember(secretaire.getMember()));
		return secretaireResponse;
	}
	
	public static List<SecretaireResponse> buildSecretaire(List<Secretaire> secretaires) {
		ArrayList<SecretaireResponse> secretairesResponses = new ArrayList<SecretaireResponse>();
		for (Secretaire secretaire : secretaires) {
			secretairesResponses.add(buildSecretaire(secretaire));
		}
		return secretairesResponses;
	}
}
