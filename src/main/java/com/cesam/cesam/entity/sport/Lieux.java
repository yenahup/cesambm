package com.cesam.cesam.entity.sport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lieu")
public class Lieux {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lieux_id")
    private Long lieuxId;

	@Column(name = "name")
    private String name;
	@Column(name = "descriptions")
    private String descriptions;
	@Column(name = "path_to_logo")
    private String pathToLogo;
	
	
	public Lieux(Long lieuxId, String name, String descriptions, String pathToLogo) {
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
