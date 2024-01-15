package com.cesam.cesam.web.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cesam.cesam.entity.organisation.humain.Member;
import com.cesam.cesam.entity.organisation.humain.repository.MemberRepository;

public class UserDetailService implements UserDetailsService{

	@Autowired
	MemberRepository memberRepos;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Member member = memberRepos.findByUsername(username);
		if (member!=null) {
			UserDetailsData userData = new UserDetailsData(member.getUsername(), member.getPassword());
			return userData;
		}
		return null;
	}

}
