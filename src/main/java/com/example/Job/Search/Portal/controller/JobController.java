package com.example.Job.Search.Portal.controller;

import com.example.Job.Search.Portal.model.Job;
import com.example.Job.Search.Portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping("jobs")
    public Iterable<Job> getJobs(){
        return jobService.getJobs();
    }

    @PostMapping("job")
    public String addJob(@RequestBody Job job){
        return jobService.addJob(job);
    }

    @PutMapping("job/{id}/{location}")
    public String updateJobLocation(@PathVariable Long id,@PathVariable String location){
        return jobService.updateJobLocation(id,location);
    }

    @DeleteMapping("job/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);
    }

    @GetMapping("job/{companyName}")
    public List<Job> searchByCompanyName(@PathVariable String companyName){
        return jobService.searchByCompanyName(companyName);
    }

    @GetMapping("job/{location}")
    public List<Job> searchByLocation(@PathVariable String location){
        return jobService.searchByLocation(location);
    }

    @GetMapping("job/{salary}")
    public List<Job> searchBySalaryGreaterThan(@PathVariable Double salary){
        return jobService.searchBySalaryGreaterThan(salary);
    }

    @GetMapping("job/{title}")
    public List<Job> searchByTitle(@PathVariable String title){
        return jobService.searchByTitle(title);
    }

    @GetMapping("AllJobs")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("Jobs/{id}")
    public Job getJobusingID(@PathVariable Long id){
        return jobService.getJobusingID(id);
    }





}
