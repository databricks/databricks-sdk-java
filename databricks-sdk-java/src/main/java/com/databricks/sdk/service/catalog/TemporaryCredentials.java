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

@Generated
@JsonSerialize(using = TemporaryCredentials.TemporaryCredentialsSerializer.class)
@JsonDeserialize(using = TemporaryCredentials.TemporaryCredentialsDeserializer.class)
public class TemporaryCredentials {
  /**
   * AWS temporary credentials for API authentication. Read more at
   * https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html.
   */
  private AwsCredentials awsTempCredentials;

  /**
   * Azure Active Directory token, essentially the Oauth token for Azure Service Principal or
   * Managed Identity. Read more at
   * https://learn.microsoft.com/en-us/azure/databricks/dev-tools/api/latest/aad/service-prin-aad-token
   */
  private AzureActiveDirectoryToken azureAad;

  /**
   * Server time when the credential will expire, in epoch milliseconds. The API client is advised
   * to cache the credential given this expiration time.
   */
  private Long expirationTime;

  /**
   * GCP temporary credentials for API authentication. Read more at
   * https://developers.google.com/identity/protocols/oauth2/service-account
   */
  private GcpOauthToken gcpOauthToken;

  public TemporaryCredentials setAwsTempCredentials(AwsCredentials awsTempCredentials) {
    this.awsTempCredentials = awsTempCredentials;
    return this;
  }

  public AwsCredentials getAwsTempCredentials() {
    return awsTempCredentials;
  }

  public TemporaryCredentials setAzureAad(AzureActiveDirectoryToken azureAad) {
    this.azureAad = azureAad;
    return this;
  }

  public AzureActiveDirectoryToken getAzureAad() {
    return azureAad;
  }

  public TemporaryCredentials setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public TemporaryCredentials setGcpOauthToken(GcpOauthToken gcpOauthToken) {
    this.gcpOauthToken = gcpOauthToken;
    return this;
  }

  public GcpOauthToken getGcpOauthToken() {
    return gcpOauthToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TemporaryCredentials that = (TemporaryCredentials) o;
    return Objects.equals(awsTempCredentials, that.awsTempCredentials)
        && Objects.equals(azureAad, that.azureAad)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(gcpOauthToken, that.gcpOauthToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsTempCredentials, azureAad, expirationTime, gcpOauthToken);
  }

  @Override
  public String toString() {
    return new ToStringer(TemporaryCredentials.class)
        .add("awsTempCredentials", awsTempCredentials)
        .add("azureAad", azureAad)
        .add("expirationTime", expirationTime)
        .add("gcpOauthToken", gcpOauthToken)
        .toString();
  }

  TemporaryCredentialsPb toPb() {
    TemporaryCredentialsPb pb = new TemporaryCredentialsPb();
    pb.setAwsTempCredentials(awsTempCredentials);
    pb.setAzureAad(azureAad);
    pb.setExpirationTime(expirationTime);
    pb.setGcpOauthToken(gcpOauthToken);

    return pb;
  }

  static TemporaryCredentials fromPb(TemporaryCredentialsPb pb) {
    TemporaryCredentials model = new TemporaryCredentials();
    model.setAwsTempCredentials(pb.getAwsTempCredentials());
    model.setAzureAad(pb.getAzureAad());
    model.setExpirationTime(pb.getExpirationTime());
    model.setGcpOauthToken(pb.getGcpOauthToken());

    return model;
  }

  public static class TemporaryCredentialsSerializer extends JsonSerializer<TemporaryCredentials> {
    @Override
    public void serialize(
        TemporaryCredentials value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TemporaryCredentialsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TemporaryCredentialsDeserializer
      extends JsonDeserializer<TemporaryCredentials> {
    @Override
    public TemporaryCredentials deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TemporaryCredentialsPb pb = mapper.readValue(p, TemporaryCredentialsPb.class);
      return TemporaryCredentials.fromPb(pb);
    }
  }
}
