package com.hcl.hiring.hiringapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hcl.hiring.hiringapp.security.MyUserDetails;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user =  userRepo.getUserByUsername(username);
		
		if (user == null) {
            throw new UsernameNotFoundException(username);
        }
		
		
        return new MyUserDetails(user);
	}

}
