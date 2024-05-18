package com.cesam.cesam.entity.organisation.relation;

import java.sql.Date;
import java.util.List;

import com.cesam.cesam.entity.finance.Contribution;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "partenariats")
@Data
public class Partenariat {
	/*
	 * This class represent Partner of the confederation
	 * */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partenariat_id")
    private Long partenariatId;

    @Column(name = "partenariat_name")
    private String partenariatName;

    @Column(name = "partenariat_type")
    private String partenariatType;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "partenariat_date")
    private Date partenariatDate;

    @Column(name = "path_to_logo")
    private String pathToLogo;

    
    @OneToMany(mappedBy = "partenariat")
    private List<Contribution> contributions;

	public Partenariat(Long partenariatId, String partenariatName, String partenariatType, String descriptions,
			Date partenariatDate, String pathToLogo, List<Contribution> contributions) {
		super();
		this.partenariatId = partenariatId;
		this.partenariatName = partenariatName;
		this.partenariatType = partenariatType;
		this.descriptions = descriptions;
		this.partenariatDate = partenariatDate;
		this.pathToLogo = pathToLogo;
		this.contributions = contributions;
	}

	public Partenariat() {
		// TODO Auto-generated constructor stub
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

	public String getPathToLogo() {
		return pathToLogo;
	}

	public void setPathToLogo(String pathToLogo) {
		this.pathToLogo = pathToLogo;
	}

}
