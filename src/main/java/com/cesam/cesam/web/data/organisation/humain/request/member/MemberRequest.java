package com.cesam.cesam.web.data.organisation.humain.request.member;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class MemberRequest {

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
        
    private Long communityId;
    
    private MultipartFile file;

	public MemberRequest(Long memberId, String firstName, String lastName, String filliere, String cycle,
			String matricule, String username, String password, String description, String etablissement,
			Date dateNaissance, Date dateInscription, String pathToProfile, Long communityId, MultipartFile file) {
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
		this.communityId = communityId;
		this.file = file;
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

	public Long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(Long communityId) {
		this.communityId = communityId;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
    
    
}
