package com.cesam.cesam.web.data.sport.merite.response;

import com.cesam.cesam.web.data.sport.player.response.PlayerResponse;

public class MeriteResponse {

    private Long meriteId; 


    private PlayerResponse player; 
	

    private String typeMerit;

    private int numbers;

	public MeriteResponse(Long meriteId, PlayerResponse player, String typeMerit, int numbers) {
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

	public PlayerResponse getPlayer() {
		return player;
	}

	public void setPlayer(PlayerResponse player) {
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
