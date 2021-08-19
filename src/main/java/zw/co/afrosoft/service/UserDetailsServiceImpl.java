package zw.co.afrosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import zw.co.afrosoft.model.MyUserDetails;
import zw.co.afrosoft.model.User;
import zw.co.afrosoft.model.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);

        if(user== null){
            throw new UsernameNotFoundException("Could not find the Username");
        }else{
            return new MyUserDetails(user);
        }
    }
}
