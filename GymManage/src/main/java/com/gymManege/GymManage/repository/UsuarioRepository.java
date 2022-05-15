package com.gymManege.GymManage.repository;

import com.gymManege.GymManage.models.UsuarioModels;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <UsuarioModels, String>{
    UsuarioModels findByLogin(String login);
}
