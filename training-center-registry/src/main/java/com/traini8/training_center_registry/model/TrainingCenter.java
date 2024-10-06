
package com.traini8.training_center_registry.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "training_centers")
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Center name is required")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is required")
    @Size(min = 12, max = 12, message = "Center code must be exactly 12 characters")
    private String centerCode;

    @Embedded
    private Address address;

    @Min(value = 1, message = "Student capacity must be at least 1")
    private Integer studentCapacity;

    @ElementCollection
    @Size(min = 1, message = "At least one course must be offered")
    private List<String> coursesOffered;

    private Instant createdOn;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String contactPhone;

    @PrePersist
    public void prePersist() {
        this.createdOn = Instant.now(); 
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
