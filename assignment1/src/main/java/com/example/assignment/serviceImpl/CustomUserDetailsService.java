//package com.example.assignment.serviceImpl;
//
//import java.util.HashSet;
//
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.example.assignment.request.entity.User;
//
//public class CustomUserDetailsService implements UserDetailsService{
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////		User user=new User();
////		user.setUserName("RAJ");
////		user.setPassWord("RAJ");
////		user.setRole("USER");
//		
//		Set<GrantedAuthority> authorities = new HashSet<>();
//        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//        return (UserDetails) new User("RAJ", new BCryptPasswordEncoder().encode("RAJ"), authorities);
//		
//		return new org.springframework.security.core.userdetails.User("sagar", "sagar", null);
//	}
//
//}
