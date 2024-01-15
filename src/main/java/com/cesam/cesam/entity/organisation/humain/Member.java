package com.cesam.cesam.entity.organisation.humain;


import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cesam.cesam.entity.organisation.administration.Responsability;
import com.cesam.cesam.entity.organisation.administration.Secretaire;
import com.cesam.cesam.entity.organisation.informations.Laureat;
import com.cesam.cesam.entity.sport.Player;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "members")
@Data
public class Member {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "filliere")
    private String filliere;

    @Column(name = "cycle")
    private String cycle;
    
    @Column(name = "matricule")
    private String matricule;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "description")
    private String description;
    
    @Column(name = "etablissement")
    private String etablissement;
    
    @Column(name = "date_naissance")
    private Date dateNaissance;
    
    @Column(name = "date_inscription")
    private Date dateInscription;
    
    @Column(name = "path_to_profile")
    private String pathToProfile;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "bureau",
               joinColumns = @JoinColumn(name = "member_id"),
               inverseJoinColumns = @JoinColumn(name = "responsability_id"))
    private Set<Responsability> responsabilities = new HashSet<>();
    
    @OneToMany(mappedBy = "member")
    private List<Laureat> laureats = new ArrayList<>();
    
    @OneToOne(mappedBy = "member")
    private Player player = new Player();
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "secretaire", joinColumns = @JoinColumn(name = "member_id"),
               inverseJoinColumns = @JoinColumn(name = "community_id"))
    private List<Community> communities = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "community" , referencedColumnName = "community_id")
    private Community community = new Community();
    
    
    @OneToMany(mappedBy = "member")
    private List<Secretaire> secretaires;
    
    public  Member() {
		
	}
    
    
	public Member(Long memberId, String firstName, String lastName, String filliere, String cycle, String matricule,
			String username, String password, String description, String etablissement, Date dateNaissance,
			Date dateInscription, String pathToProfile, Set<Responsability> responsabilities, List<Laureat> laureats,
			Player player, Community community, List<Secretaire> secretaires) {
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
		this.responsabilities = responsabilities;
		this.laureats = laureats;
		this.player = player;
		this.secretaires = secretaires;
	}


	
	
	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public Set<Responsability> getResponsabilities() {
		return responsabilities;
	}


	public void setResponsabilities(Set<Responsability> responsabilities) {
		this.responsabilities = responsabilities;
	}


	public List<Laureat> getLaureats() {
		return laureats;
	}


	public void setLaureats(List<Laureat> laureats) {
		this.laureats = laureats;
	}


	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public Date getDateInscription() {
		return dateInscription;
	}


	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}


	public List<Secretaire> getSecretaires() {
		return secretaires;
	}


	public void setSecretaires(List<Secretaire> secretaires) {
		this.secretaires = secretaires;
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



	public String getPathToProfile() {
		return pathToProfile;
	}

	public void setPathToProfile(String pathToProfile) {
		this.pathToProfile = pathToProfile;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public Date getInscriptionDate() {
		return dateInscription;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.dateInscription = inscriptionDate;
	}


	public List<Community> getCommunities() {
		return communities;
	}


	public void setCommunities(List<Community> communities) {
		this.communities = communities;
	}


	public Community getCommunity() {
		return community;
	}


	public void setCommunity(Community community) {
		this.community = community;
	}
    
    
}
