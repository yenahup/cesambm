package com.cesam.cesam.entity.finance;

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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "montants")
    private double montants;

    @Column(name = "date_transaction")
    private Date dateTransaction;

    @ManyToOne
    @JoinColumns({
    	@JoinColumn(name = "bureau_id", referencedColumnName = "bureau_id"),
        @JoinColumn(name = "member_id", referencedColumnName = "member_id"),
        @JoinColumn(name = "responsability_id", referencedColumnName = "responsability_id")
    })
    private Bureau creator;
    
    @OneToOne
    @JoinColumn(name = "contribution_id")
    private Contribution contribution;

	

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public double getMontants() {
		return montants;
	}

	public void setMontants(double montants) {
		this.montants = montants;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public Bureau getCreator() {
		return creator;
	}

	public void setCreator(Bureau creator) {
		this.creator = creator;
	}
    
    
}
