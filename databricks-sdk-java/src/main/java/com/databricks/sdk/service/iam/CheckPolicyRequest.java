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

/** Check access policy to a resource */
@Generated
@JsonSerialize(using = CheckPolicyRequest.CheckPolicyRequestSerializer.class)
@JsonDeserialize(using = CheckPolicyRequest.CheckPolicyRequestDeserializer.class)
public class CheckPolicyRequest {
  /** */
  private Actor actor;

  /** */
  private RequestAuthzIdentity authzIdentity;

  /** */
  private ConsistencyToken consistencyToken;

  /** */
  private String permission;

  /**
   * Ex: (servicePrincipal/use, accounts/<account-id>/servicePrincipals/<sp-id>) Ex:
   * (servicePrincipal.ruleSet/update,
   * accounts/<account-id>/servicePrincipals/<sp-id>/ruleSets/default)
   */
  private String resource;

  /** */
  private ResourceInfo resourceInfo;

  public CheckPolicyRequest setActor(Actor actor) {
    this.actor = actor;
    return this;
  }

  public Actor getActor() {
    return actor;
  }

  public CheckPolicyRequest setAuthzIdentity(RequestAuthzIdentity authzIdentity) {
    this.authzIdentity = authzIdentity;
    return this;
  }

  public RequestAuthzIdentity getAuthzIdentity() {
    return authzIdentity;
  }

  public CheckPolicyRequest setConsistencyToken(ConsistencyToken consistencyToken) {
    this.consistencyToken = consistencyToken;
    return this;
  }

  public ConsistencyToken getConsistencyToken() {
    return consistencyToken;
  }

  public CheckPolicyRequest setPermission(String permission) {
    this.permission = permission;
    return this;
  }

  public String getPermission() {
    return permission;
  }

  public CheckPolicyRequest setResource(String resource) {
    this.resource = resource;
    return this;
  }

  public String getResource() {
    return resource;
  }

  public CheckPolicyRequest setResourceInfo(ResourceInfo resourceInfo) {
    this.resourceInfo = resourceInfo;
    return this;
  }

  public ResourceInfo getResourceInfo() {
    return resourceInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckPolicyRequest that = (CheckPolicyRequest) o;
    return Objects.equals(actor, that.actor)
        && Objects.equals(authzIdentity, that.authzIdentity)
        && Objects.equals(consistencyToken, that.consistencyToken)
        && Objects.equals(permission, that.permission)
        && Objects.equals(resource, that.resource)
        && Objects.equals(resourceInfo, that.resourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, authzIdentity, consistencyToken, permission, resource, resourceInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(CheckPolicyRequest.class)
        .add("actor", actor)
        .add("authzIdentity", authzIdentity)
        .add("consistencyToken", consistencyToken)
        .add("permission", permission)
        .add("resource", resource)
        .add("resourceInfo", resourceInfo)
        .toString();
  }

  CheckPolicyRequestPb toPb() {
    CheckPolicyRequestPb pb = new CheckPolicyRequestPb();
    pb.setActor(actor);
    pb.setAuthzIdentity(authzIdentity);
    pb.setConsistencyToken(consistencyToken);
    pb.setPermission(permission);
    pb.setResource(resource);
    pb.setResourceInfo(resourceInfo);

    return pb;
  }

  static CheckPolicyRequest fromPb(CheckPolicyRequestPb pb) {
    CheckPolicyRequest model = new CheckPolicyRequest();
    model.setActor(pb.getActor());
    model.setAuthzIdentity(pb.getAuthzIdentity());
    model.setConsistencyToken(pb.getConsistencyToken());
    model.setPermission(pb.getPermission());
    model.setResource(pb.getResource());
    model.setResourceInfo(pb.getResourceInfo());

    return model;
  }

  public static class CheckPolicyRequestSerializer extends JsonSerializer<CheckPolicyRequest> {
    @Override
    public void serialize(CheckPolicyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CheckPolicyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CheckPolicyRequestDeserializer extends JsonDeserializer<CheckPolicyRequest> {
    @Override
    public CheckPolicyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CheckPolicyRequestPb pb = mapper.readValue(p, CheckPolicyRequestPb.class);
      return CheckPolicyRequest.fromPb(pb);
    }
  }
}
