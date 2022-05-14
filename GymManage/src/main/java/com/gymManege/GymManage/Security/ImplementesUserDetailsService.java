package com.gymManege.GymManage.Security;

import com.gymManege.GymManage.controller.UsuarioController;
import com.gymManege.GymManage.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public class ImplementesUserDetailsService implements UserDetailsService {
    @Autowired
    private UsuarioRepository ur;




    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {

        UsuarioController usuario = ur.findByLogin(login);

        if(usuario == null){
            throw new UsernameNotFoundException("Usuario não encontrado!");
        }
        return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());

    }
}
