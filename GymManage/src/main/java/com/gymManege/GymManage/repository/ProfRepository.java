package com.gymManege.GymManage.repository;

import com.gymManege.GymManage.models.ProfModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepository extends JpaRepository<ProfModels, Long> {
}