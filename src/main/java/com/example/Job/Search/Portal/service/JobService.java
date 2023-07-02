package com.example.Job.Search.Portal.service;

import com.example.Job.Search.Portal.model.Job;
import com.example.Job.Search.Portal.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public Iterable<Job> getJobs() {
        return jobRepo.findAll();
    }


    public String addJob(Job job) {
        jobRepo.save(job);
        return "Job has been saved.";
    }

    public String updateJobLocation(Long id, String location) {
        Optional<Job> allJobs=jobRepo.findById(id);
        Job job=allJobs.get();
        if(allJobs.isPresent()){
            job.setLocation(location);
            jobRepo.save(job);
            return "Job location has been updated.";
        }else{
            return "No job found for given id.";
        }

    }

    public String deleteJob(Long id) {
        Optional<Job> allJobs=jobRepo.findById(id);
        Job job=allJobs.get();
        if(allJobs.isPresent()){
            jobRepo.deleteById(id);
            return "Job has been deleted.";
        }else{
            return "No job found for given id.";
        }
    }

    public List<Job> searchByCompanyName(String companyName) {
        return jobRepo.findByCompanyName(companyName);
    }

    public List<Job> searchByLocation(String location) {
        return jobRepo.findByLocation(location);
    }

    public List<Job> searchBySalaryGreaterThan(Double salary) {
        return jobRepo.findBySalaryGreaterThan(salary);
    }

    public List<Job> searchByTitle(String title) {
        return jobRepo.findByTitle(title);
    }

    public List<Job> getAllJobs() {
        return jobRepo.getAllJobs();
    }

    public Job getJobusingID(Long id) {
        return jobRepo.getJobusingID(id);
    }
}
