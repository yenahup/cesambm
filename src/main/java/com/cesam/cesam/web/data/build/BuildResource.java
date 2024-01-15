package com.cesam.cesam.web.data.build;

import java.util.ArrayList;
import java.util.List;

import com.cesam.cesam.entity.ressources.Ressource;
import com.cesam.cesam.web.data.resources.response.ResourceResponse;

public class BuildResource {

	public static ResourceResponse buildResource(Ressource resource) {
		ResourceResponse resourceResponse = new ResourceResponse();
		resourceResponse.setDateRessource(resource.getDateRessource());
		resourceResponse.setPathToRessource(resource.getPathToRessource());
		resourceResponse.setRessourcesId(resource.getRessourcesId());
		resourceResponse.setTitleRessource(resource.getTitleRessource());
		resourceResponse.setTypeRessource(resource.getTypeRessource());
		resourceResponse.setBureau(BuildBureau.buildBureau(resource.getAdministration()));
		return resourceResponse;
	}
	
	public static List<ResourceResponse> buildResource(List<Ressource> resources) {
		ArrayList<ResourceResponse> resourcesResponses = new ArrayList<ResourceResponse>();
		for (Ressource resource : resources) {
			resourcesResponses.add(buildResource(resource));
		}
		return resourcesResponses;
	}
}
