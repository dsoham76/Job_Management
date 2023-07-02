package com.example.Job.Search.Portal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Job")
public class Job {
    @NotNull
    @Id
    private Long id;
    private String title;
    private String description;
    private String location;
    @Min(20000)
    private Double salary;
    @Email
    private String companyEmail;
    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private Role jobType;
    private LocalDate appliedDate;
}
