package com.gymManege.GymManage.repository;

<<<<<<< HEAD
import com.gymManege.GymManage.models.UsuarioModels;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <UsuarioModels, String>{
    UsuarioModels findByLogin(String login);
=======
import com.gymManege.GymManage.controller.UsuarioController;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <UsuarioController, String>{
    UsuarioController findByLogin(String login);
>>>>>>> a2625da57ca28f36771cb13bc71c9de77e6ae9a4
}
