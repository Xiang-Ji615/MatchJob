
package main.java.match.job.model.worker;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Worker {

    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("certificates")
    @Expose
    private List<String> certificates = null;
    @SerializedName("skills")
    @Expose
    private List<String> skills = null;
    @SerializedName("jobSearchAddress")
    @Expose
    private JobSearchAddress jobSearchAddress;
    @SerializedName("transportation")
    @Expose
    private String transportation;
    @SerializedName("hasDriversLicense")
    @Expose
    private Boolean hasDriversLicense;
    @SerializedName("availability")
    @Expose
    private List<Availability> availability = null;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("userId")
    @Expose
    private Integer userId;

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public JobSearchAddress getJobSearchAddress() {
        return jobSearchAddress;
    }

    public void setJobSearchAddress(JobSearchAddress jobSearchAddress) {
        this.jobSearchAddress = jobSearchAddress;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Boolean getHasDriversLicense() {
        return hasDriversLicense;
    }

    public void setHasDriversLicense(Boolean hasDriversLicense) {
        this.hasDriversLicense = hasDriversLicense;
    }

    public List<Availability> getAvailability() {
        return availability;
    }

    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
