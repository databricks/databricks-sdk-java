// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetResponse {
    /**
     
     */
    @JsonProperty("registered_model")
    private RegisteredModelDatabricks registeredModel;
    
    public GetResponse setRegisteredModel(RegisteredModelDatabricks registeredModel) {
        this.registeredModel = registeredModel;
        return this;
    }

    public RegisteredModelDatabricks getRegisteredModel() {
        return registeredModel;
    }
    
}
