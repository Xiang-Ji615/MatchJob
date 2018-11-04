
package main.java.match.job.model.job;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Job {

    @SerializedName("driverLicenseRequired")
    @Expose
    private Boolean driverLicenseRequired;
    @SerializedName("requiredCertificates")
    @Expose
    private List<String> requiredCertificates = null;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("billRate")
    @Expose
    private String billRate;
    @SerializedName("workersRequired")
    @Expose
    private Integer workersRequired;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("about")
    @Expose
    private String about;
    @SerializedName("jobTitle")
    @Expose
    private String jobTitle;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("jobId")
    @Expose
    private Integer jobId;

    public Boolean getDriverLicenseRequired() {
        return driverLicenseRequired;
    }

    public void setDriverLicenseRequired(Boolean driverLicenseRequired) {
        this.driverLicenseRequired = driverLicenseRequired;
    }

    public List<String> getRequiredCertificates() {
        return requiredCertificates;
    }

    public void setRequiredCertificates(List<String> requiredCertificates) {
        this.requiredCertificates = requiredCertificates;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getBillRate() {
        return billRate;
    }

    public void setBillRate(String billRate) {
        this.billRate = billRate;
    }

    public Integer getWorkersRequired() {
        return workersRequired;
    }

    public void setWorkersRequired(Integer workersRequired) {
        this.workersRequired = workersRequired;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

}
