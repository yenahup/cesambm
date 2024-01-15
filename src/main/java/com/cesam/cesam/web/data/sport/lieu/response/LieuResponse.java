package com.cesam.cesam.web.data.sport.lieu.response;


public class LieuResponse {

    private Long lieuxId;

    private String name;

    private String descriptions;

    private String pathToLogo;

	public LieuResponse(Long lieuxId, String name, String descriptions, String pathToLogo) {
		super();
		this.lieuxId = lieuxId;
		this.name = name;
		this.descriptions = descriptions;
		this.pathToLogo = pathToLogo;
	}

	public Long getLieuxId() {
		return lieuxId;
	}

	public void setLieuxId(Long lieuxId) {
		this.lieuxId = lieuxId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getPathToLogo() {
		return pathToLogo;
	}

	public void setPathToLogo(String pathToLogo) {
		this.pathToLogo = pathToLogo;
	}
    
    
}
