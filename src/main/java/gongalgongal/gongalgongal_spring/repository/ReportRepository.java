package gongalgongal.gongalgongal_spring.repository;

import gongalgongal.gongalgongal_spring.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
    // 추가적인 쿼리 메서드 정의 가능
}