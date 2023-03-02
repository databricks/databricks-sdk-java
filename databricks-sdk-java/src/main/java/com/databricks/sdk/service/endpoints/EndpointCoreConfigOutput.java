// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.endpoints;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class EndpointCoreConfigOutput {
    /**
     * The config version that the serving endpoint is currently serving.
     */
    @JsonProperty("config_version")
    private Long configVersion;
    
    /**
     * The list of served models under the serving endpoint config.
     */
    @JsonProperty("served_models")
    private java.util.List<ServedModelOutput> servedModels;
    
    /**
     * The traffic configuration associated with the serving endpoint config.
     */
    @JsonProperty("traffic_config")
    private TrafficConfig trafficConfig;
    
    public EndpointCoreConfigOutput setConfigVersion(Long configVersion) {
        this.configVersion = configVersion;
        return this;
    }

    public Long getConfigVersion() {
        return configVersion;
    }
    
    public EndpointCoreConfigOutput setServedModels(java.util.List<ServedModelOutput> servedModels) {
        this.servedModels = servedModels;
        return this;
    }

    public java.util.List<ServedModelOutput> getServedModels() {
        return servedModels;
    }
    
    public EndpointCoreConfigOutput setTrafficConfig(TrafficConfig trafficConfig) {
        this.trafficConfig = trafficConfig;
        return this;
    }

    public TrafficConfig getTrafficConfig() {
        return trafficConfig;
    }
    
}
