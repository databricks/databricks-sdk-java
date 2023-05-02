// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class SetWorkspaceWarehouseConfigRequest {
  /** Optional: Channel selection details */
  @JsonProperty("channel")
  private Channel channel;

  /** Deprecated: Use sql_configuration_parameters */
  @JsonProperty("config_param")
  private RepeatedEndpointConfPairs configParam;

  /**
   * Spark confs for external hive metastore configuration JSON serialized size must be less than <=
   * 512K
   */
  @JsonProperty("data_access_config")
  private Collection<EndpointConfPair> dataAccessConfig;

  /**
   * List of Warehouse Types allowed in this workspace (limits allowed value of the type field in
   * CreateWarehouse and EditWarehouse). Note: Some types cannot be disabled, they don't need to be
   * specified in SetWorkspaceWarehouseConfig. Note: Disabling a type may cause existing warehouses
   * to be converted to another type. Used by frontend to save specific type availability in the
   * warehouse create and edit form UI.
   */
  @JsonProperty("enabled_warehouse_types")
  private Collection<WarehouseTypePair> enabledWarehouseTypes;

  /** Deprecated: Use sql_configuration_parameters */
  @JsonProperty("global_param")
  private RepeatedEndpointConfPairs globalParam;

  /** GCP only: Google Service Account used to pass to cluster to access Google Cloud Storage */
  @JsonProperty("google_service_account")
  private String googleServiceAccount;

  /** AWS Only: Instance profile used to pass IAM role to the cluster */
  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  /** Security policy for warehouses */
  @JsonProperty("security_policy")
  private SetWorkspaceWarehouseConfigRequestSecurityPolicy securityPolicy;

  /** Internal. Used by frontend to save serverless compute agreement value. */
  @JsonProperty("serverless_agreement")
  private Boolean serverlessAgreement;

  /** SQL configuration parameters */
  @JsonProperty("sql_configuration_parameters")
  private RepeatedEndpointConfPairs sqlConfigurationParameters;

  public SetWorkspaceWarehouseConfigRequest setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }

  public SetWorkspaceWarehouseConfigRequest setConfigParam(RepeatedEndpointConfPairs configParam) {
    this.configParam = configParam;
    return this;
  }

  public RepeatedEndpointConfPairs getConfigParam() {
    return configParam;
  }

  public SetWorkspaceWarehouseConfigRequest setDataAccessConfig(
      Collection<EndpointConfPair> dataAccessConfig) {
    this.dataAccessConfig = dataAccessConfig;
    return this;
  }

  public Collection<EndpointConfPair> getDataAccessConfig() {
    return dataAccessConfig;
  }

  public SetWorkspaceWarehouseConfigRequest setEnabledWarehouseTypes(
      Collection<WarehouseTypePair> enabledWarehouseTypes) {
    this.enabledWarehouseTypes = enabledWarehouseTypes;
    return this;
  }

  public Collection<WarehouseTypePair> getEnabledWarehouseTypes() {
    return enabledWarehouseTypes;
  }

  public SetWorkspaceWarehouseConfigRequest setGlobalParam(RepeatedEndpointConfPairs globalParam) {
    this.globalParam = globalParam;
    return this;
  }

  public RepeatedEndpointConfPairs getGlobalParam() {
    return globalParam;
  }

  public SetWorkspaceWarehouseConfigRequest setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  public SetWorkspaceWarehouseConfigRequest setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public SetWorkspaceWarehouseConfigRequest setSecurityPolicy(
      SetWorkspaceWarehouseConfigRequestSecurityPolicy securityPolicy) {
    this.securityPolicy = securityPolicy;
    return this;
  }

  public SetWorkspaceWarehouseConfigRequestSecurityPolicy getSecurityPolicy() {
    return securityPolicy;
  }

  public SetWorkspaceWarehouseConfigRequest setServerlessAgreement(Boolean serverlessAgreement) {
    this.serverlessAgreement = serverlessAgreement;
    return this;
  }

  public Boolean getServerlessAgreement() {
    return serverlessAgreement;
  }

  public SetWorkspaceWarehouseConfigRequest setSqlConfigurationParameters(
      RepeatedEndpointConfPairs sqlConfigurationParameters) {
    this.sqlConfigurationParameters = sqlConfigurationParameters;
    return this;
  }

  public RepeatedEndpointConfPairs getSqlConfigurationParameters() {
    return sqlConfigurationParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetWorkspaceWarehouseConfigRequest that = (SetWorkspaceWarehouseConfigRequest) o;
    return Objects.equals(channel, that.channel)
        && Objects.equals(configParam, that.configParam)
        && Objects.equals(dataAccessConfig, that.dataAccessConfig)
        && Objects.equals(enabledWarehouseTypes, that.enabledWarehouseTypes)
        && Objects.equals(globalParam, that.globalParam)
        && Objects.equals(googleServiceAccount, that.googleServiceAccount)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(securityPolicy, that.securityPolicy)
        && Objects.equals(serverlessAgreement, that.serverlessAgreement)
        && Objects.equals(sqlConfigurationParameters, that.sqlConfigurationParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        channel,
        configParam,
        dataAccessConfig,
        enabledWarehouseTypes,
        globalParam,
        googleServiceAccount,
        instanceProfileArn,
        securityPolicy,
        serverlessAgreement,
        sqlConfigurationParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(SetWorkspaceWarehouseConfigRequest.class)
        .add("channel", channel)
        .add("configParam", configParam)
        .add("dataAccessConfig", dataAccessConfig)
        .add("enabledWarehouseTypes", enabledWarehouseTypes)
        .add("globalParam", globalParam)
        .add("googleServiceAccount", googleServiceAccount)
        .add("instanceProfileArn", instanceProfileArn)
        .add("securityPolicy", securityPolicy)
        .add("serverlessAgreement", serverlessAgreement)
        .add("sqlConfigurationParameters", sqlConfigurationParameters)
        .toString();
  }
}
