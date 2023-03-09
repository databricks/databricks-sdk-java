// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ApproveResponse {
    /**
     * Activity recorded for the action.
     */
    @JsonProperty("activity")
    private Activity activity;
    
    public ApproveResponse setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public Activity getActivity() {
        return activity;
    }
    
}
