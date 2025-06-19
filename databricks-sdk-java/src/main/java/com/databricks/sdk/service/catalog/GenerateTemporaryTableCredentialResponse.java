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
@JsonSerialize(
    using =
        GenerateTemporaryTableCredentialResponse.GenerateTemporaryTableCredentialResponseSerializer
            .class)
@JsonDeserialize(
    using =
        GenerateTemporaryTableCredentialResponse
            .GenerateTemporaryTableCredentialResponseDeserializer.class)
public class GenerateTemporaryTableCredentialResponse {
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
   * Azure temporary credentials for API authentication. Read more at
   * https://docs.microsoft.com/en-us/rest/api/storageservices/create-user-delegation-sas
   */
  private AzureUserDelegationSas azureUserDelegationSas;

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

  /**
   * R2 temporary credentials for API authentication. Read more at
   * https://developers.cloudflare.com/r2/api/s3/tokens/.
   */
  private R2Credentials r2TempCredentials;

  /** The URL of the storage path accessible by the temporary credential. */
  private String url;

  public GenerateTemporaryTableCredentialResponse setAwsTempCredentials(
      AwsCredentials awsTempCredentials) {
    this.awsTempCredentials = awsTempCredentials;
    return this;
  }

  public AwsCredentials getAwsTempCredentials() {
    return awsTempCredentials;
  }

  public GenerateTemporaryTableCredentialResponse setAzureAad(AzureActiveDirectoryToken azureAad) {
    this.azureAad = azureAad;
    return this;
  }

  public AzureActiveDirectoryToken getAzureAad() {
    return azureAad;
  }

  public GenerateTemporaryTableCredentialResponse setAzureUserDelegationSas(
      AzureUserDelegationSas azureUserDelegationSas) {
    this.azureUserDelegationSas = azureUserDelegationSas;
    return this;
  }

  public AzureUserDelegationSas getAzureUserDelegationSas() {
    return azureUserDelegationSas;
  }

  public GenerateTemporaryTableCredentialResponse setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public GenerateTemporaryTableCredentialResponse setGcpOauthToken(GcpOauthToken gcpOauthToken) {
    this.gcpOauthToken = gcpOauthToken;
    return this;
  }

  public GcpOauthToken getGcpOauthToken() {
    return gcpOauthToken;
  }

  public GenerateTemporaryTableCredentialResponse setR2TempCredentials(
      R2Credentials r2TempCredentials) {
    this.r2TempCredentials = r2TempCredentials;
    return this;
  }

  public R2Credentials getR2TempCredentials() {
    return r2TempCredentials;
  }

  public GenerateTemporaryTableCredentialResponse setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryTableCredentialResponse that = (GenerateTemporaryTableCredentialResponse) o;
    return Objects.equals(awsTempCredentials, that.awsTempCredentials)
        && Objects.equals(azureAad, that.azureAad)
        && Objects.equals(azureUserDelegationSas, that.azureUserDelegationSas)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(gcpOauthToken, that.gcpOauthToken)
        && Objects.equals(r2TempCredentials, that.r2TempCredentials)
        && Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsTempCredentials,
        azureAad,
        azureUserDelegationSas,
        expirationTime,
        gcpOauthToken,
        r2TempCredentials,
        url);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryTableCredentialResponse.class)
        .add("awsTempCredentials", awsTempCredentials)
        .add("azureAad", azureAad)
        .add("azureUserDelegationSas", azureUserDelegationSas)
        .add("expirationTime", expirationTime)
        .add("gcpOauthToken", gcpOauthToken)
        .add("r2TempCredentials", r2TempCredentials)
        .add("url", url)
        .toString();
  }

  GenerateTemporaryTableCredentialResponsePb toPb() {
    GenerateTemporaryTableCredentialResponsePb pb =
        new GenerateTemporaryTableCredentialResponsePb();
    pb.setAwsTempCredentials(awsTempCredentials);
    pb.setAzureAad(azureAad);
    pb.setAzureUserDelegationSas(azureUserDelegationSas);
    pb.setExpirationTime(expirationTime);
    pb.setGcpOauthToken(gcpOauthToken);
    pb.setR2TempCredentials(r2TempCredentials);
    pb.setUrl(url);

    return pb;
  }

  static GenerateTemporaryTableCredentialResponse fromPb(
      GenerateTemporaryTableCredentialResponsePb pb) {
    GenerateTemporaryTableCredentialResponse model = new GenerateTemporaryTableCredentialResponse();
    model.setAwsTempCredentials(pb.getAwsTempCredentials());
    model.setAzureAad(pb.getAzureAad());
    model.setAzureUserDelegationSas(pb.getAzureUserDelegationSas());
    model.setExpirationTime(pb.getExpirationTime());
    model.setGcpOauthToken(pb.getGcpOauthToken());
    model.setR2TempCredentials(pb.getR2TempCredentials());
    model.setUrl(pb.getUrl());

    return model;
  }

  public static class GenerateTemporaryTableCredentialResponseSerializer
      extends JsonSerializer<GenerateTemporaryTableCredentialResponse> {
    @Override
    public void serialize(
        GenerateTemporaryTableCredentialResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenerateTemporaryTableCredentialResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenerateTemporaryTableCredentialResponseDeserializer
      extends JsonDeserializer<GenerateTemporaryTableCredentialResponse> {
    @Override
    public GenerateTemporaryTableCredentialResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenerateTemporaryTableCredentialResponsePb pb =
          mapper.readValue(p, GenerateTemporaryTableCredentialResponsePb.class);
      return GenerateTemporaryTableCredentialResponse.fromPb(pb);
    }
  }
}
