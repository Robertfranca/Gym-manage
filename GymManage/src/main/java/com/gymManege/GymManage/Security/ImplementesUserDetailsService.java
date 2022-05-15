package com.gymManege.GymManage.Security;

<<<<<<< HEAD
import com.gymManege.GymManage.models.UsuarioModels;
=======
import com.gymManege.GymManage.controller.UsuarioController;
>>>>>>> a2625da57ca28f36771cb13bc71c9de77e6ae9a4
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

<<<<<<< HEAD
        UsuarioModels usuario = ur.findByLogin(login);
=======
        UsuarioController usuario = ur.findByLogin(login);
>>>>>>> a2625da57ca28f36771cb13bc71c9de77e6ae9a4

        if(usuario == null){
            throw new UsernameNotFoundException("Usuario não encontrado!");
        }
        return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());

    }
}
