
package main.java.match.job.model.worker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobSearchAddress {

    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("maxJobDistance")
    @Expose
    private Integer maxJobDistance;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getMaxJobDistance() {
        return maxJobDistance;
    }

    public void setMaxJobDistance(Integer maxJobDistance) {
        this.maxJobDistance = maxJobDistance;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

}
