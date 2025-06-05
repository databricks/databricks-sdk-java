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
@JsonSerialize(using = CreateCustomAppIntegration.CreateCustomAppIntegrationSerializer.class)
@JsonDeserialize(using = CreateCustomAppIntegration.CreateCustomAppIntegrationDeserializer.class)
public class CreateCustomAppIntegration {
  /**
   * This field indicates whether an OAuth client secret is required to authenticate this client.
   */
  private Boolean confidential;

  /** Name of the custom OAuth app */
  private String name;

  /** List of OAuth redirect urls */
  private Collection<String> redirectUrls;

  /**
   * OAuth scopes granted to the application. Supported scopes: all-apis, sql, offline_access,
   * openid, profile, email.
   */
  private Collection<String> scopes;

  /** Token access policy */
  private TokenAccessPolicy tokenAccessPolicy;

  /**
   * Scopes that will need to be consented by end user to mint the access token. If the user does
   * not authorize the access token will not be minted. Must be a subset of scopes.
   */
  private Collection<String> userAuthorizedScopes;

  public CreateCustomAppIntegration setConfidential(Boolean confidential) {
    this.confidential = confidential;
    return this;
  }

  public Boolean getConfidential() {
    return confidential;
  }

  public CreateCustomAppIntegration setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateCustomAppIntegration setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public CreateCustomAppIntegration setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  public CreateCustomAppIntegration setTokenAccessPolicy(TokenAccessPolicy tokenAccessPolicy) {
    this.tokenAccessPolicy = tokenAccessPolicy;
    return this;
  }

  public TokenAccessPolicy getTokenAccessPolicy() {
    return tokenAccessPolicy;
  }

  public CreateCustomAppIntegration setUserAuthorizedScopes(
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
    CreateCustomAppIntegration that = (CreateCustomAppIntegration) o;
    return Objects.equals(confidential, that.confidential)
        && Objects.equals(name, that.name)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(scopes, that.scopes)
        && Objects.equals(tokenAccessPolicy, that.tokenAccessPolicy)
        && Objects.equals(userAuthorizedScopes, that.userAuthorizedScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        confidential, name, redirectUrls, scopes, tokenAccessPolicy, userAuthorizedScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCustomAppIntegration.class)
        .add("confidential", confidential)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("scopes", scopes)
        .add("tokenAccessPolicy", tokenAccessPolicy)
        .add("userAuthorizedScopes", userAuthorizedScopes)
        .toString();
  }

  CreateCustomAppIntegrationPb toPb() {
    CreateCustomAppIntegrationPb pb = new CreateCustomAppIntegrationPb();
    pb.setConfidential(confidential);
    pb.setName(name);
    pb.setRedirectUrls(redirectUrls);
    pb.setScopes(scopes);
    pb.setTokenAccessPolicy(tokenAccessPolicy);
    pb.setUserAuthorizedScopes(userAuthorizedScopes);

    return pb;
  }

  static CreateCustomAppIntegration fromPb(CreateCustomAppIntegrationPb pb) {
    CreateCustomAppIntegration model = new CreateCustomAppIntegration();
    model.setConfidential(pb.getConfidential());
    model.setName(pb.getName());
    model.setRedirectUrls(pb.getRedirectUrls());
    model.setScopes(pb.getScopes());
    model.setTokenAccessPolicy(pb.getTokenAccessPolicy());
    model.setUserAuthorizedScopes(pb.getUserAuthorizedScopes());

    return model;
  }

  public static class CreateCustomAppIntegrationSerializer
      extends JsonSerializer<CreateCustomAppIntegration> {
    @Override
    public void serialize(
        CreateCustomAppIntegration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCustomAppIntegrationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCustomAppIntegrationDeserializer
      extends JsonDeserializer<CreateCustomAppIntegration> {
    @Override
    public CreateCustomAppIntegration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCustomAppIntegrationPb pb = mapper.readValue(p, CreateCustomAppIntegrationPb.class);
      return CreateCustomAppIntegration.fromPb(pb);
    }
  }
}
