package com.gymManege.GymManage.repository;

import com.gymManege.GymManage.models.cadAluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<cadAluno, String> {



}
