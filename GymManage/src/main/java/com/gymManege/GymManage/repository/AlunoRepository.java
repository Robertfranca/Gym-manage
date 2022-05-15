package com.gymManege.GymManage.repository;

import com.gymManege.GymManage.models.AlunoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModels, Long> {
}
