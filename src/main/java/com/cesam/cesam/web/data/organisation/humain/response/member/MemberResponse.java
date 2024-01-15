package com.cesam.cesam.web.data.organisation.humain.response.member;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberResponse {

    private Long memberId;

    private String firstName;

    private String lastName;

    private String filliere;

    private String cycle;
    
    private String matricule;

    private String username;

    private String password;

    private String description;
    
    private String etablissement;
    
    private Date dateNaissance;
    
    private Date dateInscription;
    
    private String pathToProfile;

	public MemberResponse(Long memberId, String firstName, String lastName, String filliere, String cycle,
			String matricule, String username, String password, String description, String etablissement,
			Date dateNaissance, Date dateInscription, String pathToProfile) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.filliere = filliere;
		this.cycle = cycle;
		this.matricule = matricule;
		this.username = username;
		this.password = password;
		this.description = description;
		this.etablissement = etablissement;
		this.dateNaissance = dateNaissance;
		this.dateInscription = dateInscription;
		this.pathToProfile = pathToProfile;
	}

	public MemberResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFilliere() {
		return filliere;
	}

	public void setFilliere(String filliere) {
		this.filliere = filliere;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getPathToProfile() {
		return pathToProfile;
	}

	public void setPathToProfile(String pathToProfile) {
		this.pathToProfile = pathToProfile;
	}
  
}
