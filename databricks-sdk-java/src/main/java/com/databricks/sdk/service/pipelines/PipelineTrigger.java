// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PipelineTrigger {
    /**
     
     */
    @JsonProperty("cron")
    private CronTrigger cron;
    
    /**
     
     */
    @JsonProperty("manual")
    private Object /* MISSING TYPE */ manual;
    
    public PipelineTrigger setCron(CronTrigger cron) {
        this.cron = cron;
        return this;
    }

    public CronTrigger getCron() {
        return cron;
    }
    
    public PipelineTrigger setManual(Object /* MISSING TYPE */ manual) {
        this.manual = manual;
        return this;
    }

    public Object /* MISSING TYPE */ getManual() {
        return manual;
    }
    
}
