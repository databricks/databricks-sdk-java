// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Configs needed to create an OpenAI model route. */
@Generated
class OpenAiConfigPb {
  @JsonProperty("microsoft_entra_client_id")
  private String microsoftEntraClientId;

  @JsonProperty("microsoft_entra_client_secret")
  private String microsoftEntraClientSecret;

  @JsonProperty("microsoft_entra_client_secret_plaintext")
  private String microsoftEntraClientSecretPlaintext;

  @JsonProperty("microsoft_entra_tenant_id")
  private String microsoftEntraTenantId;

  @JsonProperty("openai_api_base")
  private String openaiApiBase;

  @JsonProperty("openai_api_key")
  private String openaiApiKey;

  @JsonProperty("openai_api_key_plaintext")
  private String openaiApiKeyPlaintext;

  @JsonProperty("openai_api_type")
  private String openaiApiType;

  @JsonProperty("openai_api_version")
  private String openaiApiVersion;

  @JsonProperty("openai_deployment_name")
  private String openaiDeploymentName;

  @JsonProperty("openai_organization")
  private String openaiOrganization;

  public OpenAiConfigPb setMicrosoftEntraClientId(String microsoftEntraClientId) {
    this.microsoftEntraClientId = microsoftEntraClientId;
    return this;
  }

  public String getMicrosoftEntraClientId() {
    return microsoftEntraClientId;
  }

  public OpenAiConfigPb setMicrosoftEntraClientSecret(String microsoftEntraClientSecret) {
    this.microsoftEntraClientSecret = microsoftEntraClientSecret;
    return this;
  }

  public String getMicrosoftEntraClientSecret() {
    return microsoftEntraClientSecret;
  }

  public OpenAiConfigPb setMicrosoftEntraClientSecretPlaintext(
      String microsoftEntraClientSecretPlaintext) {
    this.microsoftEntraClientSecretPlaintext = microsoftEntraClientSecretPlaintext;
    return this;
  }

  public String getMicrosoftEntraClientSecretPlaintext() {
    return microsoftEntraClientSecretPlaintext;
  }

  public OpenAiConfigPb setMicrosoftEntraTenantId(String microsoftEntraTenantId) {
    this.microsoftEntraTenantId = microsoftEntraTenantId;
    return this;
  }

  public String getMicrosoftEntraTenantId() {
    return microsoftEntraTenantId;
  }

  public OpenAiConfigPb setOpenaiApiBase(String openaiApiBase) {
    this.openaiApiBase = openaiApiBase;
    return this;
  }

  public String getOpenaiApiBase() {
    return openaiApiBase;
  }

  public OpenAiConfigPb setOpenaiApiKey(String openaiApiKey) {
    this.openaiApiKey = openaiApiKey;
    return this;
  }

  public String getOpenaiApiKey() {
    return openaiApiKey;
  }

  public OpenAiConfigPb setOpenaiApiKeyPlaintext(String openaiApiKeyPlaintext) {
    this.openaiApiKeyPlaintext = openaiApiKeyPlaintext;
    return this;
  }

  public String getOpenaiApiKeyPlaintext() {
    return openaiApiKeyPlaintext;
  }

  public OpenAiConfigPb setOpenaiApiType(String openaiApiType) {
    this.openaiApiType = openaiApiType;
    return this;
  }

  public String getOpenaiApiType() {
    return openaiApiType;
  }

  public OpenAiConfigPb setOpenaiApiVersion(String openaiApiVersion) {
    this.openaiApiVersion = openaiApiVersion;
    return this;
  }

  public String getOpenaiApiVersion() {
    return openaiApiVersion;
  }

  public OpenAiConfigPb setOpenaiDeploymentName(String openaiDeploymentName) {
    this.openaiDeploymentName = openaiDeploymentName;
    return this;
  }

  public String getOpenaiDeploymentName() {
    return openaiDeploymentName;
  }

  public OpenAiConfigPb setOpenaiOrganization(String openaiOrganization) {
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
    OpenAiConfigPb that = (OpenAiConfigPb) o;
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
    return new ToStringer(OpenAiConfigPb.class)
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
}
