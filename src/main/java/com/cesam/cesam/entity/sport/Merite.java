package com.cesam.cesam.entity.sport;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "merite")
public class Merite {

	@Id
	@Column(name = "merite_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long meriteId; 

	@ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    private Player player; 
	
	@Column(name = "type_merite")
    private String typeMerit;
	@Column(name = "numbers")
    private int numbers;
	public Merite(Long meriteId, Player player, String typeMerit, int numbers) {
		super();
		this.meriteId = meriteId;
		this.player = player;
		this.typeMerit = typeMerit;
		this.numbers = numbers;
	}
	public Long getMeriteId() {
		return meriteId;
	}
	public void setMeriteId(Long meriteId) {
		this.meriteId = meriteId;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getTypeMerit() {
		return typeMerit;
	}
	public void setTypeMerit(String typeMerit) {
		this.typeMerit = typeMerit;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

    

}
