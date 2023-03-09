// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CronSchedule {
    /**
     * Indicate whether this schedule is paused or not.
     */
    @JsonProperty("pause_status")
    private CronSchedulePauseStatus pauseStatus;
    
    /**
     * A Cron expression using Quartz syntax that describes the schedule for a
     * job. See [Cron Trigger] for details. This field is required."
     * 
     * [Cron Trigger]: http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html
     */
    @JsonProperty("quartz_cron_expression")
    private String quartzCronExpression;
    
    /**
     * A Java timezone ID. The schedule for a job is resolved with respect to
     * this timezone. See [Java TimeZone] for details. This field is required.
     * 
     * [Java TimeZone]: https://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html
     */
    @JsonProperty("timezone_id")
    private String timezoneId;
    
    public CronSchedule setPauseStatus(CronSchedulePauseStatus pauseStatus) {
        this.pauseStatus = pauseStatus;
        return this;
    }

    public CronSchedulePauseStatus getPauseStatus() {
        return pauseStatus;
    }
    
    public CronSchedule setQuartzCronExpression(String quartzCronExpression) {
        this.quartzCronExpression = quartzCronExpression;
        return this;
    }

    public String getQuartzCronExpression() {
        return quartzCronExpression;
    }
    
    public CronSchedule setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
        return this;
    }

    public String getTimezoneId() {
        return timezoneId;
    }
    
}
