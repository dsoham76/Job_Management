package com.example.Job.Search.Portal.repository;

import com.example.Job.Search.Portal.model.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends CrudRepository<Job,Long> {

    List<Job> findByCompanyName(String companyName);

    List<Job> findByLocation(String location);

    List<Job> findBySalaryGreaterThan(Double salary);

    List<Job> findByTitle(String title);

    @Query(value = "select * from Job",nativeQuery = true)
    List<Job> getAllJobs();

    @Query(value = "select * from Job where id=:jobid",nativeQuery = true)
    Job getJobusingID(Long jobid);
}
