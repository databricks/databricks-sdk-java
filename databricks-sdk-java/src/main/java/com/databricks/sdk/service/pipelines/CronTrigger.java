// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CronTrigger {
    /**
     
     */
    @JsonProperty("quartz_cron_schedule")
    private String quartzCronSchedule;
    
    /**
     
     */
    @JsonProperty("timezone_id")
    private String timezoneId;
    
    public CronTrigger setQuartzCronSchedule(String quartzCronSchedule) {
        this.quartzCronSchedule = quartzCronSchedule;
        return this;
    }

    public String getQuartzCronSchedule() {
        return quartzCronSchedule;
    }
    
    public CronTrigger setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
        return this;
    }

    public String getTimezoneId() {
        return timezoneId;
    }
    
}
