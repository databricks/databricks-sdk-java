// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateRunResponse {
    /**
     * The newly created run.
     */
    @JsonProperty("run")
    private Run run;
    
    public CreateRunResponse setRun(Run run) {
        this.run = run;
        return this;
    }

    public Run getRun() {
        return run;
    }
    
}
