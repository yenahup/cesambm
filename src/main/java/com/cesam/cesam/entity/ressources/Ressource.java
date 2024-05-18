package com.cesam.cesam.entity.ressources;

import java.sql.Date;

import com.cesam.cesam.entity.organisation.administration.Bureau;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ressources")
@Data
public class Ressource {
	/*
	 * This class represent Resource
	 * */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ressources_id")
    private Long ressourcesId;

    @Column(name = "title_ressource")
    private String titleRessource;

    @Column(name = "type_ressource")
    private String typeRessource;

    @Column(name = "path_to_ressource")
    private String pathToRessource;

    @Column(name = "date_ressource")
    private Date dateRessource;

    @ManyToOne
    @JoinColumns({
    	@JoinColumn(name = "bureau_id", referencedColumnName = "bureau_id"),
        @JoinColumn(name = "member_id", referencedColumnName = "member_id"),
        @JoinColumn(name = "responsability_id", referencedColumnName = "responsability_id")
    })
    private Bureau bureau;

	public Ressource(Long ressourcesId, String titleRessource, String typeRessource, String pathToRessource,
			Date dateRessource, Bureau bureau) {
		super();
		this.ressourcesId = ressourcesId;
		this.titleRessource = titleRessource;
		this.typeRessource = typeRessource;
		this.pathToRessource = pathToRessource;
		this.dateRessource = dateRessource;
		this.bureau = bureau;
	}

	public Long getRessourcesId() {
		return ressourcesId;
	}

	public void setRessourcesId(Long ressourcesId) {
		this.ressourcesId = ressourcesId;
	}

	public String getTitleRessource() {
		return titleRessource;
	}

	public void setTitleRessource(String titleRessource) {
		this.titleRessource = titleRessource;
	}

	public String getTypeRessource() {
		return typeRessource;
	}

	public void setTypeRessource(String typeRessource) {
		this.typeRessource = typeRessource;
	}

	public String getPathToRessource() {
		return pathToRessource;
	}

	public void setPathToRessource(String pathToRessource) {
		this.pathToRessource = pathToRessource;
	}

	public Date getDateRessource() {
		return dateRessource;
	}

	public void setDateRessource(Date dateRessource) {
		this.dateRessource = dateRessource;
	}

	public Bureau getAdministration() {
		return bureau;
	}

	public void setAdministration(Bureau bureau) {
		this.bureau = bureau;
	}
    
    
}
