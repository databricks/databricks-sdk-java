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
@JsonSerialize(using = PublishedAppOutput.PublishedAppOutputSerializer.class)
@JsonDeserialize(using = PublishedAppOutput.PublishedAppOutputDeserializer.class)
public class PublishedAppOutput {
  /** Unique ID of the published OAuth app. */
  private String appId;

  /** Client ID of the published OAuth app. It is the client_id in the OAuth flow */
  private String clientId;

  /** Description of the published OAuth app. */
  private String description;

  /**
   * Whether the published OAuth app is a confidential client. It is always false for published
   * OAuth apps.
   */
  private Boolean isConfidentialClient;

  /** The display name of the published OAuth app. */
  private String name;

  /** Redirect URLs of the published OAuth app. */
  private Collection<String> redirectUrls;

  /** Required scopes for the published OAuth app. */
  private Collection<String> scopes;

  public PublishedAppOutput setAppId(String appId) {
    this.appId = appId;
    return this;
  }

  public String getAppId() {
    return appId;
  }

  public PublishedAppOutput setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public PublishedAppOutput setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PublishedAppOutput setIsConfidentialClient(Boolean isConfidentialClient) {
    this.isConfidentialClient = isConfidentialClient;
    return this;
  }

  public Boolean getIsConfidentialClient() {
    return isConfidentialClient;
  }

  public PublishedAppOutput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public PublishedAppOutput setRedirectUrls(Collection<String> redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

  public Collection<String> getRedirectUrls() {
    return redirectUrls;
  }

  public PublishedAppOutput setScopes(Collection<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Collection<String> getScopes() {
    return scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishedAppOutput that = (PublishedAppOutput) o;
    return Objects.equals(appId, that.appId)
        && Objects.equals(clientId, that.clientId)
        && Objects.equals(description, that.description)
        && Objects.equals(isConfidentialClient, that.isConfidentialClient)
        && Objects.equals(name, that.name)
        && Objects.equals(redirectUrls, that.redirectUrls)
        && Objects.equals(scopes, that.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appId, clientId, description, isConfidentialClient, name, redirectUrls, scopes);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishedAppOutput.class)
        .add("appId", appId)
        .add("clientId", clientId)
        .add("description", description)
        .add("isConfidentialClient", isConfidentialClient)
        .add("name", name)
        .add("redirectUrls", redirectUrls)
        .add("scopes", scopes)
        .toString();
  }

  PublishedAppOutputPb toPb() {
    PublishedAppOutputPb pb = new PublishedAppOutputPb();
    pb.setAppId(appId);
    pb.setClientId(clientId);
    pb.setDescription(description);
    pb.setIsConfidentialClient(isConfidentialClient);
    pb.setName(name);
    pb.setRedirectUrls(redirectUrls);
    pb.setScopes(scopes);

    return pb;
  }

  static PublishedAppOutput fromPb(PublishedAppOutputPb pb) {
    PublishedAppOutput model = new PublishedAppOutput();
    model.setAppId(pb.getAppId());
    model.setClientId(pb.getClientId());
    model.setDescription(pb.getDescription());
    model.setIsConfidentialClient(pb.getIsConfidentialClient());
    model.setName(pb.getName());
    model.setRedirectUrls(pb.getRedirectUrls());
    model.setScopes(pb.getScopes());

    return model;
  }

  public static class PublishedAppOutputSerializer extends JsonSerializer<PublishedAppOutput> {
    @Override
    public void serialize(PublishedAppOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PublishedAppOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PublishedAppOutputDeserializer extends JsonDeserializer<PublishedAppOutput> {
    @Override
    public PublishedAppOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PublishedAppOutputPb pb = mapper.readValue(p, PublishedAppOutputPb.class);
      return PublishedAppOutput.fromPb(pb);
    }
  }
}
