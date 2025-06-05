// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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

/** The Azure service principal configuration. Only applicable when purpose is **STORAGE**. */
@Generated
@JsonSerialize(using = AzureServicePrincipal.AzureServicePrincipalSerializer.class)
@JsonDeserialize(using = AzureServicePrincipal.AzureServicePrincipalDeserializer.class)
public class AzureServicePrincipal {
  /** The application ID of the application registration within the referenced AAD tenant. */
  private String applicationId;

  /** The client secret generated for the above app ID in AAD. */
  private String clientSecret;

  /**
   * The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application.
   */
  private String directoryId;

  public AzureServicePrincipal setApplicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public AzureServicePrincipal setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public AzureServicePrincipal setDirectoryId(String directoryId) {
    this.directoryId = directoryId;
    return this;
  }

  public String getDirectoryId() {
    return directoryId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzureServicePrincipal that = (AzureServicePrincipal) o;
    return Objects.equals(applicationId, that.applicationId)
        && Objects.equals(clientSecret, that.clientSecret)
        && Objects.equals(directoryId, that.directoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, clientSecret, directoryId);
  }

  @Override
  public String toString() {
    return new ToStringer(AzureServicePrincipal.class)
        .add("applicationId", applicationId)
        .add("clientSecret", clientSecret)
        .add("directoryId", directoryId)
        .toString();
  }

  AzureServicePrincipalPb toPb() {
    AzureServicePrincipalPb pb = new AzureServicePrincipalPb();
    pb.setApplicationId(applicationId);
    pb.setClientSecret(clientSecret);
    pb.setDirectoryId(directoryId);

    return pb;
  }

  static AzureServicePrincipal fromPb(AzureServicePrincipalPb pb) {
    AzureServicePrincipal model = new AzureServicePrincipal();
    model.setApplicationId(pb.getApplicationId());
    model.setClientSecret(pb.getClientSecret());
    model.setDirectoryId(pb.getDirectoryId());

    return model;
  }

  public static class AzureServicePrincipalSerializer
      extends JsonSerializer<AzureServicePrincipal> {
    @Override
    public void serialize(
        AzureServicePrincipal value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AzureServicePrincipalPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AzureServicePrincipalDeserializer
      extends JsonDeserializer<AzureServicePrincipal> {
    @Override
    public AzureServicePrincipal deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AzureServicePrincipalPb pb = mapper.readValue(p, AzureServicePrincipalPb.class);
      return AzureServicePrincipal.fromPb(pb);
    }
  }
}
