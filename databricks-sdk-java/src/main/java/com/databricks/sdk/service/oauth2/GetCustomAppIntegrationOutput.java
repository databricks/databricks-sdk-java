// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
@JsonSerialize(using = GetCustomAppIntegrationOutput.GetCustomAppIntegrationOutputSerializer.class)
@JsonDeserialize(
    using = GetCustomAppIntegrationOutput.GetCustomAppIntegrationOutputDeserializer.class)
public class GetCustomAppIntegrationOutput {
  /** The client id of the custom OAuth app */
  private String clientId;

  /**
   * This field indicates whether an OAuth client secret is required to authenticate this client.
   */
  private Boolean confidential;

  /** */
  private String createTime;

  /** */
  private Long createdBy;

  /** */
  private String creatorUsername;

  /** ID of this custom app */
  private String integrationId;

  /** The display name of the custom OAuth app */
  private String name;

  /** List of OAuth redirect urls */
  private Collection<String> redirectUrls;

  /** */
  private Collection<String> scopes;

  /** Token access policy */
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * Scopes that will need to be consented by end user to mint the access token. If the user does
   * not authorize the access token will not be minted. Must be a subset of scopes.
   */
  private Collection<String> userAuthorizedScopes;

  public GetCustomAppIntegrationOutput setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public GetCustomAppIntegrationOutput setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  public Boolean getConfidential() {
    return confidential;
  }

  public GetCustomAppIntegrationOutput setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public GetCustomAppIntegrationOutput setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public GetCustomAppIntegrationOutput setCreatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
    return this;
  }

  public String getCreatorUsername() {
    return creatorUsername;
  }

  public GetCustomAppIntegrationOutput setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  public GetCustomAppIntegrationOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetCustomAppIntegrationOutput setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public GetCustomAppIntegrationOutput setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public GetCustomAppIntegrationOutput setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  public GetCustomAppIntegrationOutput setUserAuthorizedScopes(
      Collection<String> userAuthorizedScopes) {
    this.userAuthorizedScopes = userAuthorizedScopes;
    return this;
  }

  public Collection<String> getUserAuthorizedScopes() {
    return userAuthorizedScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetCustomAppIntegrationOutput that = (GetCustomAppIntegrationOutput) o;
    return Objects.equals(clientId, that.clientId)
        && Objects.equals(confidential, that.confidential)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(creatorUsername, that.creatorUsername)
        && Objects.equals(integrationId, that.integrationId)
        && Objects.equals(name, that.name)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy)
        && Objects.equals(userAuthorizedScopes, that.userAuthorizedScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientId,
        confidential,
        createTime,
        createdBy,
        creatorUsername,
        integrationId,
        name,
        redirectUrls,
        scopes,
        tokenAccessPolicy,
        userAuthorizedScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCustomAppIntegrationOutput.class)
        .add("clientId", clientId)
        .add("confidential", confidential)
        .add("createTime", createTime)
        .add("createdBy", createdBy)
        .add("creatorUsername", creatorUsername)
        .add("integrationId", integrationId)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("scopes", scopes)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .add("userAuthorizedScopes", userAuthorizedScopes)
        .toString();
  }

  GetCustomAppIntegrationOutputPb toPb() {
    GetCustomAppIntegrationOutputPb pb = new GetCustomAppIntegrationOutputPb();
    pb.setClientId(clientId);
    pb.setConfidential(confidential);
    pb.setCreateTime(createTime);
    pb.setCreatedBy(createdBy);
    pb.setCreatorUsername(creatorUsername);
    pb.setIntegrationId(integrationId);
    pb.setName(name);
    pb.setRedirectUrls(redirectUrls);
    pb.setScopes(scopes);
    pb.setTokenAccessPolicy(tokenAccessPolicy);
    pb.setUserAuthorizedScopes(userAuthorizedScopes);

    return pb;
  }

  static GetCustomAppIntegrationOutput fromPb(GetCustomAppIntegrationOutputPb pb) {
    GetCustomAppIntegrationOutput model = new GetCustomAppIntegrationOutput();
    model.setClientId(pb.getClientId());
    model.setConfidential(pb.getConfidential());
    model.setCreateTime(pb.getCreateTime());
    model.setCreatedBy(pb.getCreatedBy());
    model.setCreatorUsername(pb.getCreatorUsername());
    model.setIntegrationId(pb.getIntegrationId());
    model.setName(pb.getName());
    model.setRedirectUrls(pb.getRedirectUrls());
    model.setScopes(pb.getScopes());
    model.setTokenAccessPolicy(pb.getTokenAccessPolicy());
    model.setUserAuthorizedScopes(pb.getUserAuthorizedScopes());

    return model;
  }

  public static class GetCustomAppIntegrationOutputSerializer
      extends JsonSerializer<GetCustomAppIntegrationOutput> {
    @Override
    public void serialize(
        GetCustomAppIntegrationOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCustomAppIntegrationOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCustomAppIntegrationOutputDeserializer
      extends JsonDeserializer<GetCustomAppIntegrationOutput> {
    @Override
    public GetCustomAppIntegrationOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCustomAppIntegrationOutputPb pb =
          mapper.readValue(p, GetCustomAppIntegrationOutputPb.class);
      return GetCustomAppIntegrationOutput.fromPb(pb);
    }
  }
}
