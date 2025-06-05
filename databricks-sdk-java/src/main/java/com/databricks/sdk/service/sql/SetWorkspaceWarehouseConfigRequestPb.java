// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class SetWorkspaceWarehouseConfigRequestPb {
  @JsonProperty("channel")
  private Channel channel;

  @JsonProperty("config_param")
  private RepeatedEndpointConfPairs configParam;

  @JsonProperty("data_access_config")
  private Collection<EndpointConfPair> dataAccessConfig;

  @JsonProperty("enabled_warehouse_types")
  private Collection<WarehouseTypePair> enabledWarehouseTypes;

  @JsonProperty("global_param")
  private RepeatedEndpointConfPairs globalParam;

  @JsonProperty("google_service_account")
  private String googleServiceAccount;

  @JsonProperty("instance_profile_arn")
  private String instanceProfileArn;

  @JsonProperty("security_policy")
  private SetWorkspaceWarehouseConfigRequestSecurityPolicy securityPolicy;

  @JsonProperty("sql_configuration_parameters")
  private RepeatedEndpointConfPairs sqlConfigurationParameters;

  public SetWorkspaceWarehouseConfigRequestPb setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  public Channel getChannel() {
    return channel;
  }

  public SetWorkspaceWarehouseConfigRequestPb setConfigParam(
      RepeatedEndpointConfPairs configParam) {
    this.configParam = configParam;
    return this;
  }

  public RepeatedEndpointConfPairs getConfigParam() {
    return configParam;
  }

  public SetWorkspaceWarehouseConfigRequestPb setDataAccessConfig(
      Collection<EndpointConfPair> dataAccessConfig) {
    this.dataAccessConfig = dataAccessConfig;
    return this;
  }

  public Collection<EndpointConfPair> getDataAccessConfig() {
    return dataAccessConfig;
  }

  public SetWorkspaceWarehouseConfigRequestPb setEnabledWarehouseTypes(
      Collection<WarehouseTypePair> enabledWarehouseTypes) {
    this.enabledWarehouseTypes = enabledWarehouseTypes;
    return this;
  }

  public Collection<WarehouseTypePair> getEnabledWarehouseTypes() {
    return enabledWarehouseTypes;
  }

  public SetWorkspaceWarehouseConfigRequestPb setGlobalParam(
      RepeatedEndpointConfPairs globalParam) {
    this.globalParam = globalParam;
    return this;
  }

  public RepeatedEndpointConfPairs getGlobalParam() {
    return globalParam;
  }

  public SetWorkspaceWarehouseConfigRequestPb setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  public SetWorkspaceWarehouseConfigRequestPb setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  public SetWorkspaceWarehouseConfigRequestPb setSecurityPolicy(
      SetWorkspaceWarehouseConfigRequestSecurityPolicy securityPolicy) {
    this.securityPolicy = securityPolicy;
    return this;
  }

  public SetWorkspaceWarehouseConfigRequestSecurityPolicy getSecurityPolicy() {
    return securityPolicy;
  }

  public SetWorkspaceWarehouseConfigRequestPb setSqlConfigurationParameters(
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
    SetWorkspaceWarehouseConfigRequestPb that = (SetWorkspaceWarehouseConfigRequestPb) o;
    return Objects.equals(channel, that.channel)
        && Objects.equals(configParam, that.configParam)
        && Objects.equals(dataAccessConfig, that.dataAccessConfig)
        && Objects.equals(enabledWarehouseTypes, that.enabledWarehouseTypes)
        && Objects.equals(globalParam, that.globalParam)
        && Objects.equals(googleServiceAccount, that.googleServiceAccount)
        && Objects.equals(instanceProfileArn, that.instanceProfileArn)
        && Objects.equals(securityPolicy, that.securityPolicy)
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
        sqlConfigurationParameters);
  }

  @Override
  public String toString() {
    return new ToStringer(SetWorkspaceWarehouseConfigRequestPb.class)
        .add("channel", channel)
        .add("configParam", configParam)
        .add("dataAccessConfig", dataAccessConfig)
        .add("enabledWarehouseTypes", enabledWarehouseTypes)
        .add("globalParam", globalParam)
        .add("googleServiceAccount", googleServiceAccount)
        .add("instanceProfileArn", instanceProfileArn)
        .add("securityPolicy", securityPolicy)
        .add("sqlConfigurationParameters", sqlConfigurationParameters)
        .toString();
  }
}
