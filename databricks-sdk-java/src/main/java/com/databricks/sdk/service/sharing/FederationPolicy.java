// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = FederationPolicy.FederationPolicySerializer.class)
@JsonDeserialize(using = FederationPolicy.FederationPolicyDeserializer.class)
public class FederationPolicy {
  /** Description of the policy. This is a user-provided description. */
  private String comment;

  /** System-generated timestamp indicating when the policy was created. */
  private String createTime;

  /** Unique, immutable system-generated identifier for the federation policy. */
  private String id;

  /**
   * Name of the federation policy. A recipient can have multiple policies with different names. The
   * name must contain only lowercase alphanumeric characters, numbers, and hyphens.
   */
  private String name;

  /** Specifies the policy to use for validating OIDC claims in the federated tokens. */
  private OidcFederationPolicy oidcPolicy;

  /** System-generated timestamp indicating when the policy was last updated. */
  private String updateTime;

  public FederationPolicy setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public FederationPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public FederationPolicy setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public FederationPolicy setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FederationPolicy setOidcPolicy(OidcFederationPolicy oidcPolicy) {
    this.oidcPolicy = oidcPolicy;
    return this;
  }

  public OidcFederationPolicy getOidcPolicy() {
    return oidcPolicy;
  }

  public FederationPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FederationPolicy that = (FederationPolicy) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(oidcPolicy, that.oidcPolicy)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createTime, id, name, oidcPolicy, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(FederationPolicy.class)
        .add("comment", comment)
        .add("createTime", createTime)
        .add("id", id)
        .add("name", name)
        .add("oidcPolicy", oidcPolicy)
        .add("updateTime", updateTime)
        .toString();
  }

  FederationPolicyPb toPb() {
    FederationPolicyPb pb = new FederationPolicyPb();
    pb.setComment(comment);
    pb.setCreateTime(createTime);
    pb.setId(id);
    pb.setName(name);
    pb.setOidcPolicy(oidcPolicy);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static FederationPolicy fromPb(FederationPolicyPb pb) {
    FederationPolicy model = new FederationPolicy();
    model.setComment(pb.getComment());
    model.setCreateTime(pb.getCreateTime());
    model.setId(pb.getId());
    model.setName(pb.getName());
    model.setOidcPolicy(pb.getOidcPolicy());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class FederationPolicySerializer extends JsonSerializer<FederationPolicy> {
    @Override
    public void serialize(FederationPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FederationPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FederationPolicyDeserializer extends JsonDeserializer<FederationPolicy> {
    @Override
    public FederationPolicy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FederationPolicyPb pb = mapper.readValue(p, FederationPolicyPb.class);
      return FederationPolicy.fromPb(pb);
    }
  }
}
