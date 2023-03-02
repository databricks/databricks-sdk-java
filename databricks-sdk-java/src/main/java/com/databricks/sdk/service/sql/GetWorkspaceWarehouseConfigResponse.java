// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class GetWorkspaceWarehouseConfigResponse {
    /**
     * Optional: Channel selection details
     */
    @JsonProperty("channel")
    private Channel channel;
    
    /**
     * Deprecated: Use sql_configuration_parameters
     */
    @JsonProperty("config_param")
    private RepeatedEndpointConfPairs configParam;
    
    /**
     * Spark confs for external hive metastore configuration JSON serialized
     * size must be less than <= 512K
     */
    @JsonProperty("data_access_config")
    private java.util.List<EndpointConfPair> dataAccessConfig;
    
    /**
     * Enable Serverless compute for SQL Endpoints
     * 
     * Deprecated: Use enable_serverless_compute
     */
    @JsonProperty("enable_databricks_compute")
    private Boolean enableDatabricksCompute;
    
    /**
     * Enable Serverless compute for SQL Endpoints
     */
    @JsonProperty("enable_serverless_compute")
    private Boolean enableServerlessCompute;
    
    /**
     * List of Warehouse Types allowed in this workspace (limits allowed value
     * of the type field in CreateWarehouse and EditWarehouse). Note: Some types
     * cannot be disabled, they don't need to be specified in
     * SetWorkspaceWarehouseConfig. Note: Disabling a type may cause existing
     * warehouses to be converted to another type. Used by frontend to save
     * specific type availability in the warehouse create and edit form UI.
     */
    @JsonProperty("enabled_warehouse_types")
    private java.util.List<WarehouseTypePair> enabledWarehouseTypes;
    
    /**
     * Deprecated: Use sql_configuration_parameters
     */
    @JsonProperty("global_param")
    private RepeatedEndpointConfPairs globalParam;
    
    /**
     * GCP only: Google Service Account used to pass to cluster to access Google
     * Cloud Storage
     */
    @JsonProperty("google_service_account")
    private String googleServiceAccount;
    
    /**
     * AWS Only: Instance profile used to pass IAM role to the cluster
     */
    @JsonProperty("instance_profile_arn")
    private String instanceProfileArn;
    
    /**
     * Security policy for endpoints
     */
    @JsonProperty("security_policy")
    private GetWorkspaceWarehouseConfigResponseSecurityPolicy securityPolicy;
    
    /**
     * SQL configuration parameters
     */
    @JsonProperty("sql_configuration_parameters")
    private RepeatedEndpointConfPairs sqlConfigurationParameters;
    
    public GetWorkspaceWarehouseConfigResponse setChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }
    
    public GetWorkspaceWarehouseConfigResponse setConfigParam(RepeatedEndpointConfPairs configParam) {
        this.configParam = configParam;
        return this;
    }

    public RepeatedEndpointConfPairs getConfigParam() {
        return configParam;
    }
    
    public GetWorkspaceWarehouseConfigResponse setDataAccessConfig(java.util.List<EndpointConfPair> dataAccessConfig) {
        this.dataAccessConfig = dataAccessConfig;
        return this;
    }

    public java.util.List<EndpointConfPair> getDataAccessConfig() {
        return dataAccessConfig;
    }
    
    public GetWorkspaceWarehouseConfigResponse setEnableDatabricksCompute(Boolean enableDatabricksCompute) {
        this.enableDatabricksCompute = enableDatabricksCompute;
        return this;
    }

    public Boolean getEnableDatabricksCompute() {
        return enableDatabricksCompute;
    }
    
    public GetWorkspaceWarehouseConfigResponse setEnableServerlessCompute(Boolean enableServerlessCompute) {
        this.enableServerlessCompute = enableServerlessCompute;
        return this;
    }

    public Boolean getEnableServerlessCompute() {
        return enableServerlessCompute;
    }
    
    public GetWorkspaceWarehouseConfigResponse setEnabledWarehouseTypes(java.util.List<WarehouseTypePair> enabledWarehouseTypes) {
        this.enabledWarehouseTypes = enabledWarehouseTypes;
        return this;
    }

    public java.util.List<WarehouseTypePair> getEnabledWarehouseTypes() {
        return enabledWarehouseTypes;
    }
    
    public GetWorkspaceWarehouseConfigResponse setGlobalParam(RepeatedEndpointConfPairs globalParam) {
        this.globalParam = globalParam;
        return this;
    }

    public RepeatedEndpointConfPairs getGlobalParam() {
        return globalParam;
    }
    
    public GetWorkspaceWarehouseConfigResponse setGoogleServiceAccount(String googleServiceAccount) {
        this.googleServiceAccount = googleServiceAccount;
        return this;
    }

    public String getGoogleServiceAccount() {
        return googleServiceAccount;
    }
    
    public GetWorkspaceWarehouseConfigResponse setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
        return this;
    }

    public String getInstanceProfileArn() {
        return instanceProfileArn;
    }
    
    public GetWorkspaceWarehouseConfigResponse setSecurityPolicy(GetWorkspaceWarehouseConfigResponseSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }

    public GetWorkspaceWarehouseConfigResponseSecurityPolicy getSecurityPolicy() {
        return securityPolicy;
    }
    
    public GetWorkspaceWarehouseConfigResponse setSqlConfigurationParameters(RepeatedEndpointConfPairs sqlConfigurationParameters) {
        this.sqlConfigurationParameters = sqlConfigurationParameters;
        return this;
    }

    public RepeatedEndpointConfPairs getSqlConfigurationParameters() {
        return sqlConfigurationParameters;
    }
    
}
