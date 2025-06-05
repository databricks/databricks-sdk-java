// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
    using = ExperimentAccessControlResponse.ExperimentAccessControlResponseSerializer.class)
@JsonDeserialize(
    using = ExperimentAccessControlResponse.ExperimentAccessControlResponseDeserializer.class)
public class ExperimentAccessControlResponse {
  /** All permissions. */
  private Collection<ExperimentPermission> allPermissions;

  /** Display name of the user or service principal. */
  private String displayName;

  /** name of the group */
  private String groupName;

  /** Name of the service principal. */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public ExperimentAccessControlResponse setAllPermissions(
      Collection<ExperimentPermission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  public Collection<ExperimentPermission> getAllPermissions() {
    return allPermissions;
  }

  public ExperimentAccessControlResponse setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ExperimentAccessControlResponse setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ExperimentAccessControlResponse setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ExperimentAccessControlResponse setUserName(String userName) {
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
    ExperimentAccessControlResponse that = (ExperimentAccessControlResponse) o;
    return Objects.equals(allPermissions, that.allPermissions)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPermissions, displayName, groupName, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(ExperimentAccessControlResponse.class)
        .add("allPermissions", allPermissions)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  ExperimentAccessControlResponsePb toPb() {
    ExperimentAccessControlResponsePb pb = new ExperimentAccessControlResponsePb();
    pb.setAllPermissions(allPermissions);
    pb.setDisplayName(displayName);
    pb.setGroupName(groupName);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static ExperimentAccessControlResponse fromPb(ExperimentAccessControlResponsePb pb) {
    ExperimentAccessControlResponse model = new ExperimentAccessControlResponse();
    model.setAllPermissions(pb.getAllPermissions());
    model.setDisplayName(pb.getDisplayName());
    model.setGroupName(pb.getGroupName());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class ExperimentAccessControlResponseSerializer
      extends JsonSerializer<ExperimentAccessControlResponse> {
    @Override
    public void serialize(
        ExperimentAccessControlResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExperimentAccessControlResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExperimentAccessControlResponseDeserializer
      extends JsonDeserializer<ExperimentAccessControlResponse> {
    @Override
    public ExperimentAccessControlResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExperimentAccessControlResponsePb pb =
          mapper.readValue(p, ExperimentAccessControlResponsePb.class);
      return ExperimentAccessControlResponse.fromPb(pb);
    }
  }
}
