package com.gymManege.GymManage.repository;

import com.gymManege.GymManage.controller.UsuarioController;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <UsuarioController, String>{
    UsuarioController findByLogin(String login);
}
