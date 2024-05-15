package com.cesam.cesam.entity.organisation.humain;

import java.sql.Date;
import java.util.List;

import com.cesam.cesam.entity.finance.Adhesion;
import com.cesam.cesam.entity.organisation.administration.Secretaire;
import com.cesam.cesam.entity.sport.Team;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "communities")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Community {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "community_id")
    private Long communityId;

    @Column(name = "country")
    private String country;

    @Column(name = "belong_date")
    private Date belongDate;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "community_name")
    private String communityName;

    @Column(name = "path_to_logo")
    private String pathToLogo;
    
    @ManyToMany(mappedBy = "communities")
	@JsonIgnore
    private List<Member> members;
    
    @OneToMany(mappedBy = "community")
    private List<Member> communityMembers;
    
    @OneToMany(mappedBy = "community")
    private List<Adhesion> adhesions;
    
    @OneToMany(mappedBy = "community")
    private List<Secretaire> secretaires;
    
    @OneToMany(mappedBy = "community")
    private List<Team> teams;
    
    public  Community() {
		
   	}

	public Community(Long communityId, String country, Date belongDate, String descriptions, String communityName,
			String pathToLogo, List<Member> members, List<Adhesion> adhesions, List<Secretaire> secretaires,
			List<Team> teams) {
		super();
		this.communityId = communityId;
		this.country = country;
		this.belongDate = belongDate;
		this.descriptions = descriptions;
		this.communityName = communityName;
		this.pathToLogo = pathToLogo;
		this.members = members;
		this.adhesions = adhesions;
		this.secretaires = secretaires;
		this.teams = teams;
	}


	public Date getBelongDate() {
		return belongDate;
	}



	public void setBelongDate(Date belongDate) {
		this.belongDate = belongDate;
	}



	public List<Secretaire> getSecretaires() {
		return secretaires;
	}



	public void setSecretaires(List<Secretaire> secretaires) {
		this.secretaires = secretaires;
	}



	public Long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Long communityId) {
		this.communityId = communityId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getBelongData() {
		return belongDate;
	}

	public void setBelongData(Date belongData) {
		this.belongDate = belongData;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getPathToLogo() {
		return pathToLogo;
	}

	public void setPathToLogo(String pathToLogo) {
		this.pathToLogo = pathToLogo;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Adhesion> getAdhesions() {
		return adhesions;
	}

	public void setAdhesions(List<Adhesion> adhesions) {
		this.adhesions = adhesions;
	}
}
