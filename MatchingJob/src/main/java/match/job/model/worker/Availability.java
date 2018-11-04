
package main.java.match.job.model.worker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Availability {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("dayIndex")
    @Expose
    private Integer dayIndex;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDayIndex() {
        return dayIndex;
    }

    public void setDayIndex(Integer dayIndex) {
        this.dayIndex = dayIndex;
    }

}
