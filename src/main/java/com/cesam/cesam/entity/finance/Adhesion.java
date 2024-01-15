package com.cesam.cesam.entity.finance;

import java.sql.Date;

import com.cesam.cesam.entity.organisation.humain.Community;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "adhesion")
@Data
public class Adhesion {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adhesion_id")
    private Long adhesionId;

    @ManyToOne
    @JoinColumn(name = "transaction_id", referencedColumnName = "transaction_id")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "community_id", referencedColumnName = "community_id")
    private Community community;

    @Column(name = "date_adhesion")
    private Date dateAdhesion;

    @Column(name = "type_adhesion")
    private String typeAdhesion;
    
    

	public Adhesion(Long adhesionId, Transaction transaction, Community community, Date dateAdhesion,
			String typeAdhesion) {
		super();
		this.adhesionId = adhesionId;
		this.transaction = transaction;
		this.community = community;
		this.dateAdhesion = dateAdhesion;
		this.typeAdhesion = typeAdhesion;
	}

	public Long getAdhesionId() {
		return adhesionId;
	}

	public void setAdhesionId(Long adhesionId) {
		this.adhesionId = adhesionId;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Community getCommunity() {
		return community;
	}

	public void setCommunity(Community community) {
		this.community = community;
	}

	public Date getDateAdhesion() {
		return dateAdhesion;
	}

	public void setDateAdhesion(Date dateAdhesion) {
		this.dateAdhesion = dateAdhesion;
	}

	public String getTypeAdhesion() {
		return typeAdhesion;
	}

	public void setTypeAdhesion(String typeAdhesion) {
		this.typeAdhesion = typeAdhesion;
	}
    
}

