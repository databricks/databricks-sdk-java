// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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

/** Configs needed to create an OpenAI model route. */
@Generated
@JsonSerialize(using = OpenAiConfig.OpenAiConfigSerializer.class)
@JsonDeserialize(using = OpenAiConfig.OpenAiConfigDeserializer.class)
public class OpenAiConfig {
  /** This field is only required for Azure AD OpenAI and is the Microsoft Entra Client ID. */
  private String microsoftEntraClientId;

  /**
   * The Databricks secret key reference for a client secret used for Microsoft Entra ID
   * authentication. If you prefer to paste your client secret directly, see
   * `microsoft_entra_client_secret_plaintext`. You must provide an API key using one of the
   * following fields: `microsoft_entra_client_secret` or `microsoft_entra_client_secret_plaintext`.
   */
  private String microsoftEntraClientSecret;

  /**
   * The client secret used for Microsoft Entra ID authentication provided as a plaintext string. If
   * you prefer to reference your key using Databricks Secrets, see `microsoft_entra_client_secret`.
   * You must provide an API key using one of the following fields: `microsoft_entra_client_secret`
   * or `microsoft_entra_client_secret_plaintext`.
   */
  private String microsoftEntraClientSecretPlaintext;

  /** This field is only required for Azure AD OpenAI and is the Microsoft Entra Tenant ID. */
  private String microsoftEntraTenantId;

  /**
   * This is a field to provide a customized base URl for the OpenAI API. For Azure OpenAI, this
   * field is required, and is the base URL for the Azure OpenAI API service provided by Azure. For
   * other OpenAI API types, this field is optional, and if left unspecified, the standard OpenAI
   * base URL is used.
   */
  private String openaiApiBase;

  /**
   * The Databricks secret key reference for an OpenAI API key using the OpenAI or Azure service. If
   * you prefer to paste your API key directly, see `openai_api_key_plaintext`. You must provide an
   * API key using one of the following fields: `openai_api_key` or `openai_api_key_plaintext`.
   */
  private String openaiApiKey;

  /**
   * The OpenAI API key using the OpenAI or Azure service provided as a plaintext string. If you
   * prefer to reference your key using Databricks Secrets, see `openai_api_key`. You must provide
   * an API key using one of the following fields: `openai_api_key` or `openai_api_key_plaintext`.
   */
  private String openaiApiKeyPlaintext;

  /**
   * This is an optional field to specify the type of OpenAI API to use. For Azure OpenAI, this
   * field is required, and adjust this parameter to represent the preferred security access
   * validation protocol. For access token validation, use azure. For authentication using Azure
   * Active Directory (Azure AD) use, azuread.
   */
  private String openaiApiType;

  /**
   * This is an optional field to specify the OpenAI API version. For Azure OpenAI, this field is
   * required, and is the version of the Azure OpenAI service to utilize, specified by a date.
   */
  private String openaiApiVersion;

  /**
   * This field is only required for Azure OpenAI and is the name of the deployment resource for the
   * Azure OpenAI service.
   */
  private String openaiDeploymentName;

  /** This is an optional field to specify the organization in OpenAI or Azure OpenAI. */
  private String openaiOrganization;

  public OpenAiConfig setMicrosoftEntraClientId(String microsoftEntraClientId) {
    this.microsoftEntraClientId = microsoftEntraClientId;
    return this;
  }

  public String getMicrosoftEntraClientId() {
    return microsoftEntraClientId;
  }

  public OpenAiConfig setMicrosoftEntraClientSecret(String microsoftEntraClientSecret) {
    this.microsoftEntraClientSecret = microsoftEntraClientSecret;
    return this;
  }

  public String getMicrosoftEntraClientSecret() {
    return microsoftEntraClientSecret;
  }

  public OpenAiConfig setMicrosoftEntraClientSecretPlaintext(
      String microsoftEntraClientSecretPlaintext) {
    this.microsoftEntraClientSecretPlaintext = microsoftEntraClientSecretPlaintext;
    return this;
  }

  public String getMicrosoftEntraClientSecretPlaintext() {
    return microsoftEntraClientSecretPlaintext;
  }

  public OpenAiConfig setMicrosoftEntraTenantId(String microsoftEntraTenantId) {
    this.microsoftEntraTenantId = microsoftEntraTenantId;
    return this;
  }

  public String getMicrosoftEntraTenantId() {
    return microsoftEntraTenantId;
  }

  public OpenAiConfig setOpenaiApiBase(String openaiApiBase) {
    this.openaiApiBase = openaiApiBase;
    return this;
  }

  public String getOpenaiApiBase() {
    return openaiApiBase;
  }

  public OpenAiConfig setOpenaiApiKey(String openaiApiKey) {
    this.openaiApiKey = openaiApiKey;
    return this;
  }

  public String getOpenaiApiKey() {
    return openaiApiKey;
  }

  public OpenAiConfig setOpenaiApiKeyPlaintext(String openaiApiKeyPlaintext) {
    this.openaiApiKeyPlaintext = openaiApiKeyPlaintext;
    return this;
  }

  public String getOpenaiApiKeyPlaintext() {
    return openaiApiKeyPlaintext;
  }

  public OpenAiConfig setOpenaiApiType(String openaiApiType) {
    this.openaiApiType = openaiApiType;
    return this;
  }

  public String getOpenaiApiType() {
    return openaiApiType;
  }

  public OpenAiConfig setOpenaiApiVersion(String openaiApiVersion) {
    this.openaiApiVersion = openaiApiVersion;
    return this;
  }

  public String getOpenaiApiVersion() {
    return openaiApiVersion;
  }

  public OpenAiConfig setOpenaiDeploymentName(String openaiDeploymentName) {
    this.openaiDeploymentName = openaiDeploymentName;
    return this;
  }

  public String getOpenaiDeploymentName() {
    return openaiDeploymentName;
  }

  public OpenAiConfig setOpenaiOrganization(String openaiOrganization) {
    this.openaiOrganization = openaiOrganization;
    return this;
  }

  public String getOpenaiOrganization() {
    return openaiOrganization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OpenAiConfig that = (OpenAiConfig) o;
    return Objects.equals(microsoftEntraClientId, that.microsoftEntraClientId)
        && Objects.equals(microsoftEntraClientSecret, that.microsoftEntraClientSecret)
        && Objects.equals(
            microsoftEntraClientSecretPlaintext, that.microsoftEntraClientSecretPlaintext)
        && Objects.equals(microsoftEntraTenantId, that.microsoftEntraTenantId)
        && Objects.equals(openaiApiBase, that.openaiApiBase)
        && Objects.equals(openaiApiKey, that.openaiApiKey)
        && Objects.equals(openaiApiKeyPlaintext, that.openaiApiKeyPlaintext)
        && Objects.equals(openaiApiType, that.openaiApiType)
        && Objects.equals(openaiApiVersion, that.openaiApiVersion)
        && Objects.equals(openaiDeploymentName, that.openaiDeploymentName)
        && Objects.equals(openaiOrganization, that.openaiOrganization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        microsoftEntraClientId,
        microsoftEntraClientSecret,
        microsoftEntraClientSecretPlaintext,
        microsoftEntraTenantId,
        openaiApiBase,
        openaiApiKey,
        openaiApiKeyPlaintext,
        openaiApiType,
        openaiApiVersion,
        openaiDeploymentName,
        openaiOrganization);
  }

  @Override
  public String toString() {
    return new ToStringer(OpenAiConfig.class)
        .add("microsoftEntraClientId", microsoftEntraClientId)
        .add("microsoftEntraClientSecret", microsoftEntraClientSecret)
        .add("microsoftEntraClientSecretPlaintext", microsoftEntraClientSecretPlaintext)
        .add("microsoftEntraTenantId", microsoftEntraTenantId)
        .add("openaiApiBase", openaiApiBase)
        .add("openaiApiKey", openaiApiKey)
        .add("openaiApiKeyPlaintext", openaiApiKeyPlaintext)
        .add("openaiApiType", openaiApiType)
        .add("openaiApiVersion", openaiApiVersion)
        .add("openaiDeploymentName", openaiDeploymentName)
        .add("openaiOrganization", openaiOrganization)
        .toString();
  }

  OpenAiConfigPb toPb() {
    OpenAiConfigPb pb = new OpenAiConfigPb();
    pb.setMicrosoftEntraClientId(microsoftEntraClientId);
    pb.setMicrosoftEntraClientSecret(microsoftEntraClientSecret);
    pb.setMicrosoftEntraClientSecretPlaintext(microsoftEntraClientSecretPlaintext);
    pb.setMicrosoftEntraTenantId(microsoftEntraTenantId);
    pb.setOpenaiApiBase(openaiApiBase);
    pb.setOpenaiApiKey(openaiApiKey);
    pb.setOpenaiApiKeyPlaintext(openaiApiKeyPlaintext);
    pb.setOpenaiApiType(openaiApiType);
    pb.setOpenaiApiVersion(openaiApiVersion);
    pb.setOpenaiDeploymentName(openaiDeploymentName);
    pb.setOpenaiOrganization(openaiOrganization);

    return pb;
  }

  static OpenAiConfig fromPb(OpenAiConfigPb pb) {
    OpenAiConfig model = new OpenAiConfig();
    model.setMicrosoftEntraClientId(pb.getMicrosoftEntraClientId());
    model.setMicrosoftEntraClientSecret(pb.getMicrosoftEntraClientSecret());
    model.setMicrosoftEntraClientSecretPlaintext(pb.getMicrosoftEntraClientSecretPlaintext());
    model.setMicrosoftEntraTenantId(pb.getMicrosoftEntraTenantId());
    model.setOpenaiApiBase(pb.getOpenaiApiBase());
    model.setOpenaiApiKey(pb.getOpenaiApiKey());
    model.setOpenaiApiKeyPlaintext(pb.getOpenaiApiKeyPlaintext());
    model.setOpenaiApiType(pb.getOpenaiApiType());
    model.setOpenaiApiVersion(pb.getOpenaiApiVersion());
    model.setOpenaiDeploymentName(pb.getOpenaiDeploymentName());
    model.setOpenaiOrganization(pb.getOpenaiOrganization());

    return model;
  }

  public static class OpenAiConfigSerializer extends JsonSerializer<OpenAiConfig> {
    @Override
    public void serialize(OpenAiConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      OpenAiConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class OpenAiConfigDeserializer extends JsonDeserializer<OpenAiConfig> {
    @Override
    public OpenAiConfig deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      OpenAiConfigPb pb = mapper.readValue(p, OpenAiConfigPb.class);
      return OpenAiConfig.fromPb(pb);
    }
  }
}
