// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>SetWorkspaceWarehouseConfigRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>channel</code>.</p>
   *
   * @param channel a {@link com.databricks.sdk.service.sql.Channel} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setChannel(Channel channel) {
    this.channel = channel;
    return this;
  }

  /**
   * <p>Getter for the field <code>channel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.Channel} object
   */
  public Channel getChannel() {
    return channel;
  }

  /**
   * <p>Setter for the field <code>configParam</code>.</p>
   *
   * @param configParam a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setConfigParam(RepeatedEndpointConfPairs configParam) {
    this.configParam = configParam;
    return this;
  }

  /**
   * <p>Getter for the field <code>configParam</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   */
  public RepeatedEndpointConfPairs getConfigParam() {
    return configParam;
  }

  /**
   * <p>Setter for the field <code>dataAccessConfig</code>.</p>
   *
   * @param dataAccessConfig a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setDataAccessConfig(
      Collection<EndpointConfPair> dataAccessConfig) {
    this.dataAccessConfig = dataAccessConfig;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataAccessConfig</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EndpointConfPair> getDataAccessConfig() {
    return dataAccessConfig;
  }

  /**
   * <p>Setter for the field <code>enabledWarehouseTypes</code>.</p>
   *
   * @param enabledWarehouseTypes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setEnabledWarehouseTypes(
      Collection<WarehouseTypePair> enabledWarehouseTypes) {
    this.enabledWarehouseTypes = enabledWarehouseTypes;
    return this;
  }

  /**
   * <p>Getter for the field <code>enabledWarehouseTypes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<WarehouseTypePair> getEnabledWarehouseTypes() {
    return enabledWarehouseTypes;
  }

  /**
   * <p>Setter for the field <code>globalParam</code>.</p>
   *
   * @param globalParam a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setGlobalParam(RepeatedEndpointConfPairs globalParam) {
    this.globalParam = globalParam;
    return this;
  }

  /**
   * <p>Getter for the field <code>globalParam</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   */
  public RepeatedEndpointConfPairs getGlobalParam() {
    return globalParam;
  }

  /**
   * <p>Setter for the field <code>googleServiceAccount</code>.</p>
   *
   * @param googleServiceAccount a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setGoogleServiceAccount(String googleServiceAccount) {
    this.googleServiceAccount = googleServiceAccount;
    return this;
  }

  /**
   * <p>Getter for the field <code>googleServiceAccount</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGoogleServiceAccount() {
    return googleServiceAccount;
  }

  /**
   * <p>Setter for the field <code>instanceProfileArn</code>.</p>
   *
   * @param instanceProfileArn a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setInstanceProfileArn(String instanceProfileArn) {
    this.instanceProfileArn = instanceProfileArn;
    return this;
  }

  /**
   * <p>Getter for the field <code>instanceProfileArn</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getInstanceProfileArn() {
    return instanceProfileArn;
  }

  /**
   * <p>Setter for the field <code>securityPolicy</code>.</p>
   *
   * @param securityPolicy a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequestSecurityPolicy} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setSecurityPolicy(
      SetWorkspaceWarehouseConfigRequestSecurityPolicy securityPolicy) {
    this.securityPolicy = securityPolicy;
    return this;
  }

  /**
   * <p>Getter for the field <code>securityPolicy</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequestSecurityPolicy} object
   */
  public SetWorkspaceWarehouseConfigRequestSecurityPolicy getSecurityPolicy() {
    return securityPolicy;
  }

  /**
   * <p>Setter for the field <code>serverlessAgreement</code>.</p>
   *
   * @param serverlessAgreement a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setServerlessAgreement(Boolean serverlessAgreement) {
    this.serverlessAgreement = serverlessAgreement;
    return this;
  }

  /**
   * <p>Getter for the field <code>serverlessAgreement</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getServerlessAgreement() {
    return serverlessAgreement;
  }

  /**
   * <p>Setter for the field <code>sqlConfigurationParameters</code>.</p>
   *
   * @param sqlConfigurationParameters a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   * @return a {@link com.databricks.sdk.service.sql.SetWorkspaceWarehouseConfigRequest} object
   */
  public SetWorkspaceWarehouseConfigRequest setSqlConfigurationParameters(
      RepeatedEndpointConfPairs sqlConfigurationParameters) {
    this.sqlConfigurationParameters = sqlConfigurationParameters;
    return this;
  }

  /**
   * <p>Getter for the field <code>sqlConfigurationParameters</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.RepeatedEndpointConfPairs} object
   */
  public RepeatedEndpointConfPairs getSqlConfigurationParameters() {
    return sqlConfigurationParameters;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
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
