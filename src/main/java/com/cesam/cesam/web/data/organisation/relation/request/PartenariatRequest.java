package com.cesam.cesam.web.data.organisation.relation.request;

import java.sql.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cesam.cesam.entity.finance.Contribution;

import jakarta.persistence.OneToMany;

public class PartenariatRequest {

	private Long partenariatId;

    private String partenariatName;

    private String partenariatType;

    private String descriptions;

    private Date partenariatDate;

    private MultipartFile file;

    
    @OneToMany(mappedBy = "partenariat")
    private List<Contribution> contributions;


	public PartenariatRequest(Long partenariatId, String partenariatName, String partenariatType, String descriptions,
			Date partenariatDate, MultipartFile file) {
		super();
		this.partenariatId = partenariatId;
		this.partenariatName = partenariatName;
		this.partenariatType = partenariatType;
		this.descriptions = descriptions;
		this.partenariatDate = partenariatDate;
		this.file = file;
	}


	public Long getPartenariatId() {
		return partenariatId;
	}


	public void setPartenariatId(Long partenariatId) {
		this.partenariatId = partenariatId;
	}


	public String getPartenariatName() {
		return partenariatName;
	}


	public void setPartenariatName(String partenariatName) {
		this.partenariatName = partenariatName;
	}


	public String getPartenariatType() {
		return partenariatType;
	}


	public void setPartenariatType(String partenariatType) {
		this.partenariatType = partenariatType;
	}


	public String getDescriptions() {
		return descriptions;
	}


	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}


	public Date getPartenariatDate() {
		return partenariatDate;
	}


	public void setPartenariatDate(Date partenariatDate) {
		this.partenariatDate = partenariatDate;
	}


	public MultipartFile getFile() {
		return file;
	}


	public void setFile(MultipartFile file) {
		this.file = file;
	}
    
    
}
