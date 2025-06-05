// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
import java.util.Objects;

@Generated
@JsonSerialize(using = PipelineAccessControlRequest.PipelineAccessControlRequestSerializer.class)
@JsonDeserialize(
    using = PipelineAccessControlRequest.PipelineAccessControlRequestDeserializer.class)
public class PipelineAccessControlRequest {
  /** name of the group */
  private String groupName;

  /** Permission level */
  private PipelinePermissionLevel permissionLevel;

  /** application ID of a service principal */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public PipelineAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public PipelineAccessControlRequest setPermissionLevel(PipelinePermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PipelinePermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public PipelineAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public PipelineAccessControlRequest setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineAccessControlRequest that = (PipelineAccessControlRequest) o;
    return Objects.equals(groupName, that.groupName)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, permissionLevel, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  PipelineAccessControlRequestPb toPb() {
    PipelineAccessControlRequestPb pb = new PipelineAccessControlRequestPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static PipelineAccessControlRequest fromPb(PipelineAccessControlRequestPb pb) {
    PipelineAccessControlRequest model = new PipelineAccessControlRequest();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class PipelineAccessControlRequestSerializer
      extends JsonSerializer<PipelineAccessControlRequest> {
    @Override
    public void serialize(
        PipelineAccessControlRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineAccessControlRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineAccessControlRequestDeserializer
      extends JsonDeserializer<PipelineAccessControlRequest> {
    @Override
    public PipelineAccessControlRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineAccessControlRequestPb pb = mapper.readValue(p, PipelineAccessControlRequestPb.class);
      return PipelineAccessControlRequest.fromPb(pb);
    }
  }
}
