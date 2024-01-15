package com.cesam.cesam.entity.organisation.administration;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cesam.cesam.entity.organisation.humain.Member;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "responsabilities")
@Data
public class Responsability {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "responsability_id")
    private Long responsabilityId;

    @Column(name = "title")
    private String title;

    @Column(name = "date_creation")
    private Date dateCreation;

    @Column(name = "descriptions")
    private String descriptions;
    
    @OneToMany(mappedBy = "responsability")
    private List<Bureau> bureaus;
    
    @ManyToMany(mappedBy = "responsabilities")
	@JsonIgnore
    private Set<Member> members = new HashSet<>();
    

	public Responsability(Long responsabilityId, String title, Date dateCreation, String descriptions) {
		super();
		this.responsabilityId = responsabilityId;
		this.title = title;
		this.dateCreation = dateCreation;
		this.descriptions = descriptions;
	}

	public Long getResponsabilityId() {
		return responsabilityId;
	}

	public void setResponsabilityId(Long responsabilityId) {
		this.responsabilityId = responsabilityId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
    
}
