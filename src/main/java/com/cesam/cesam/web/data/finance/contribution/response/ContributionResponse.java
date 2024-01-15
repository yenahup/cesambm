package com.cesam.cesam.web.data.finance.contribution.response;

import com.cesam.cesam.web.data.finance.transaction.response.TransactionResponse;
import com.cesam.cesam.web.data.organisation.relation.response.PartenariatResponse;

public class ContributionResponse {

    private Long contributionId;

    private String contributionType;

    private String description;

    private PartenariatResponse partenariat;
    
    private TransactionResponse transaction;

	public ContributionResponse(Long contributionId, String contributionType, String description,
			PartenariatResponse partenariat, TransactionResponse transaction) {
		super();
		this.contributionId = contributionId;
		this.contributionType = contributionType;
		this.description = description;
		this.partenariat = partenariat;
		this.transaction = transaction;
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

	public PartenariatResponse getPartenariat() {
		return partenariat;
	}

	public void setPartenariat(PartenariatResponse partenariat) {
		this.partenariat = partenariat;
	}

	public TransactionResponse getTransaction() {
		return transaction;
	}

	public void setTransaction(TransactionResponse transaction) {
		this.transaction = transaction;
	}
    
    
}
