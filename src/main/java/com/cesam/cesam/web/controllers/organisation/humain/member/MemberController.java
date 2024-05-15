package com.cesam.cesam.web.controllers.organisation.humain.member;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cesam.cesam.web.data.organisation.humain.request.member.MemberRequest;

@RestController("/api/members")
public class MemberController {

	@GetMapping("")
	public void getAllMembers() {
		
	}
	
	@PostMapping()
	public void addMember(@RequestBody MemberRequest member){
	
		
	}
	
	@PutMapping("/{username}")
	public void updateMember(@RequestBody MemberRequest member) {
		
	}
	
	@DeleteMapping("/delete/{username}/")
	public void deleteMember(){
		
	}
	
	@GetMapping("/search/")
	public void searchMember(){
		
	}
	
}
