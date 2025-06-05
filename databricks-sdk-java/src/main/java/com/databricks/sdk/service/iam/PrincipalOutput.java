// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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

/** Information about the principal assigned to the workspace. */
@Generated
@JsonSerialize(using = PrincipalOutput.PrincipalOutputSerializer.class)
@JsonDeserialize(using = PrincipalOutput.PrincipalOutputDeserializer.class)
public class PrincipalOutput {
  /** The display name of the principal. */
  private String displayName;

  /** The group name of the group. Present only if the principal is a group. */
  private String groupName;

  /** The unique, opaque id of the principal. */
  private Long principalId;

  /** The name of the service principal. Present only if the principal is a service principal. */
  private String servicePrincipalName;

  /** The username of the user. Present only if the principal is a user. */
  private String userName;

  public PrincipalOutput setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public PrincipalOutput setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public PrincipalOutput setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  public Long getPrincipalId() {
    return principalId;
  }

  public PrincipalOutput setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public PrincipalOutput setUserName(String userName) {
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
    PrincipalOutput that = (PrincipalOutput) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, groupName, principalId, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(PrincipalOutput.class)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("principalId", principalId)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  PrincipalOutputPb toPb() {
    PrincipalOutputPb pb = new PrincipalOutputPb();
    pb.setDisplayName(displayName);
    pb.setGroupName(groupName);
    pb.setPrincipalId(principalId);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static PrincipalOutput fromPb(PrincipalOutputPb pb) {
    PrincipalOutput model = new PrincipalOutput();
    model.setDisplayName(pb.getDisplayName());
    model.setGroupName(pb.getGroupName());
    model.setPrincipalId(pb.getPrincipalId());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class PrincipalOutputSerializer extends JsonSerializer<PrincipalOutput> {
    @Override
    public void serialize(PrincipalOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PrincipalOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PrincipalOutputDeserializer extends JsonDeserializer<PrincipalOutput> {
    @Override
    public PrincipalOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PrincipalOutputPb pb = mapper.readValue(p, PrincipalOutputPb.class);
      return PrincipalOutput.fromPb(pb);
    }
  }
}
