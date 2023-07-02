# Job Search Portal

## Framework and Language

> Framework: SpringBoot Language: Java 8

## Data flow

1.  Controller

        @GetMapping("jobs"): To get all jobs
        @PostMapping("job"): To add job
        @PutMapping("job/{id}/{location}"): To update job location
        @DeleteMapping("job/{id}"): To delete a job
        @GetMapping("job/{companyName}"):To get a job by id
        @GetMapping("job/{location}"):To get a job by location
        @GetMapping("job/{salary}"):To get a job by salary
        @GetMapping("job/{title}"):To get a job by title
        @GetMapping("AllJobs"):To get all jobs
        @GetMapping("Jobs/{id}"): To get job by id

2.  Services

        getJobs():To get all jobs
        addJob(Job job):To add job
        updateJobLocation(Long id, String location):To update job location
        String deleteJob(Long id):To delete a job
        List<Job> searchByCompanyName(String companyName):To get a job by id
        List<Job> searchByLocation(String location):To get a job by location
        List<Job> searchBySalaryGreaterThan(Double salary):To get a job by salary
        List<Job> searchByTitle(String title):To get a job by title
        List<Job> getAllJobs():To get all jobs
        Job getJobusingID(Long id):To get job by id

3.  Repository

        - JobRepo

4.  Database Design

        private Long id;
        private String title;
        private String description;
        private String location;
        private Double salary; 
        private String companyEmail; 
        private String companyName;
        private String employerName;
        private <Some-Enum> jobType; 
        private LocalDate appliedDate; 

## Data Structure Used in Project

     CrudRepository has been used as primay datastructure

## Project Summary

    The Job Search Portal is a comprehensive software solution designed to facilitate the  job management . Its primary objective is to streamline job search -related processes. The system provides a centralized platform that enables  administrators to create, read, edit, and delete student and Job accounts.
