// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = SetWorkspaceWarehouseConfigRequest.SetWorkspaceWarehouseConfigRequestSerializer.class)
@JsonDeserialize(
    using = SetWorkspaceWarehouseConfigRequest.SetWorkspaceWarehouseConfigRequestDeserializer.class)
public class SetWorkspaceWarehouseConfigRequest {
  /** Optional: Channel selection details */
  private Channel channel;

  /** Deprecated: Use sql_configuration_parameters */
  private RepeatedEndpointConfPairs configParam;

  /**
   * Spark confs for external hive metastore configuration JSON serialized size must be less than <=
   * 512K
   */
  private Collection<EndpointConfPair> dataAccessConfig;

  /**
   * List of Warehouse Types allowed in this workspace (limits allowed value of the type field in
   * CreateWarehouse and EditWarehouse). Note: Some types cannot be disabled, they don't need to be
   * specified in SetWorkspaceWarehouseConfig. Note: Disabling a type may cause existing warehouses
   * to be converted to another type. Used by frontend to save specific type availability in the
   * warehouse create and edit form UI.
   */
  private Collection<WarehouseTypePair> enabledWarehouseTypes;

  /** Deprecated: Use sql_configuration_parameters */
  private RepeatedEndpointConfPairs globalParam;

  /** GCP only: Google Service Account used to pass to cluster to access Google Cloud Storage */
  private String googleServiceAccount;

  /** AWS Only: Instance profile used to pass IAM role to the cluster */
  private String instanceProfileArn;

  /** Security policy for warehouses */
  private SetWorkspaceWarehouseConfigRequestSecurityPolicy securityPolicy;

  /** SQL configuration parameters */
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
    return new ToStringer(SetWorkspaceWarehouseConfigRequest.class)
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

  SetWorkspaceWarehouseConfigRequestPb toPb() {
    SetWorkspaceWarehouseConfigRequestPb pb = new SetWorkspaceWarehouseConfigRequestPb();
    pb.setChannel(channel);
    pb.setConfigParam(configParam);
    pb.setDataAccessConfig(dataAccessConfig);
    pb.setEnabledWarehouseTypes(enabledWarehouseTypes);
    pb.setGlobalParam(globalParam);
    pb.setGoogleServiceAccount(googleServiceAccount);
    pb.setInstanceProfileArn(instanceProfileArn);
    pb.setSecurityPolicy(securityPolicy);
    pb.setSqlConfigurationParameters(sqlConfigurationParameters);

    return pb;
  }

  static SetWorkspaceWarehouseConfigRequest fromPb(SetWorkspaceWarehouseConfigRequestPb pb) {
    SetWorkspaceWarehouseConfigRequest model = new SetWorkspaceWarehouseConfigRequest();
    model.setChannel(pb.getChannel());
    model.setConfigParam(pb.getConfigParam());
    model.setDataAccessConfig(pb.getDataAccessConfig());
    model.setEnabledWarehouseTypes(pb.getEnabledWarehouseTypes());
    model.setGlobalParam(pb.getGlobalParam());
    model.setGoogleServiceAccount(pb.getGoogleServiceAccount());
    model.setInstanceProfileArn(pb.getInstanceProfileArn());
    model.setSecurityPolicy(pb.getSecurityPolicy());
    model.setSqlConfigurationParameters(pb.getSqlConfigurationParameters());

    return model;
  }

  public static class SetWorkspaceWarehouseConfigRequestSerializer
      extends JsonSerializer<SetWorkspaceWarehouseConfigRequest> {
    @Override
    public void serialize(
        SetWorkspaceWarehouseConfigRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetWorkspaceWarehouseConfigRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetWorkspaceWarehouseConfigRequestDeserializer
      extends JsonDeserializer<SetWorkspaceWarehouseConfigRequest> {
    @Override
    public SetWorkspaceWarehouseConfigRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetWorkspaceWarehouseConfigRequestPb pb =
          mapper.readValue(p, SetWorkspaceWarehouseConfigRequestPb.class);
      return SetWorkspaceWarehouseConfigRequest.fromPb(pb);
    }
  }
}
