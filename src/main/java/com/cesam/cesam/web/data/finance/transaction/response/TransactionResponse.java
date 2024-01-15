package com.cesam.cesam.web.data.finance.transaction.response;

import java.sql.Date;

import com.cesam.cesam.web.data.organisation.bureau.response.BureauResponse;



public class TransactionResponse {


    private Long transactionId;

    private String transactionType;

    private String descriptions;

    private double montants;

    private Date dateTransaction;

    private BureauResponse creator;

	public TransactionResponse(Long transactionId, String transactionType, String descriptions, double montants,
			Date dateTransaction, BureauResponse creator) {
		super();
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.descriptions = descriptions;
		this.montants = montants;
		this.dateTransaction = dateTransaction;
		this.creator = creator;
	}

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

	public BureauResponse getCreator() {
		return creator;
	}

	public void setCreator(BureauResponse creator) {
		this.creator = creator;
	}
    
    
}
