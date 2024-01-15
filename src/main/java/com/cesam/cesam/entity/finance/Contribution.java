package com.cesam.cesam.entity.finance;

import com.cesam.cesam.entity.organisation.relation.Partenariat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "contributions")
@Data
public class Contribution {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contribution_id")
    private Long contributionId;

    @Column(name = "contribution_type")
    private String contributionType;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "partenaire", referencedColumnName = "partenariat_id")
    private Partenariat partenariat;
    
    @OneToOne(mappedBy = "contribution", cascade = CascadeType.ALL)
    private Transaction transaction;

	public Contribution(Long contributionId, String contributionType, String description, Transaction transaction,
			Partenariat partenariat) {
		super();
		this.contributionId = contributionId;
		this.contributionType = contributionType;
		this.description = description;
		this.transaction = transaction;
		this.partenariat = partenariat;
	}

	public Long getContributionId() {
		return contributionId;
	}

	public void setContributionId(Long contributionId) {
		this.contributionId = contributionId;
	}

	public String getContributionType() {
		return contributionType;
	}

	public void setContributionType(String contributionType) {
		this.contributionType = contributionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Partenariat getPartenariat() {
		return partenariat;
	}

	public void setPartenariat(Partenariat partenariat) {
		this.partenariat = partenariat;
	}
    
    
}
