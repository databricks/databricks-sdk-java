// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class OpenAiConfig {
  /**
   * This is the base URL for the OpenAI API (default: "https://api.openai.com/v1"). For Azure
   * OpenAI, this field is required, and is the base URL for the Azure OpenAI API service provided
   * by Azure.
   */
  @JsonProperty("openai_api_base")
  private String openaiApiBase;

  /** The Databricks secret key reference for an OpenAI or Azure OpenAI API key. */
  @JsonProperty("openai_api_key")
  private String openaiApiKey;

  /**
   * This is an optional field to specify the type of OpenAI API to use. For Azure OpenAI, this
   * field is required, and adjust this parameter to represent the preferred security access
   * validation protocol. For access token validation, use azure. For authentication using Azure
   * Active Directory (Azure AD) use, azuread.
   */
  @JsonProperty("openai_api_type")
  private String openaiApiType;

  /**
   * This is an optional field to specify the OpenAI API version. For Azure OpenAI, this field is
   * required, and is the version of the Azure OpenAI service to utilize, specified by a date.
   */
  @JsonProperty("openai_api_version")
  private String openaiApiVersion;

  /**
   * This field is only required for Azure OpenAI and is the name of the deployment resource for the
   * Azure OpenAI service.
   */
  @JsonProperty("openai_deployment_name")
  private String openaiDeploymentName;

  /** This is an optional field to specify the organization in OpenAI or Azure OpenAI. */
  @JsonProperty("openai_organization")
  private String openaiOrganization;

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
    return Objects.equals(openaiApiBase, that.openaiApiBase)
        && Objects.equals(openaiApiKey, that.openaiApiKey)
        && Objects.equals(openaiApiType, that.openaiApiType)
        && Objects.equals(openaiApiVersion, that.openaiApiVersion)
        && Objects.equals(openaiDeploymentName, that.openaiDeploymentName)
        && Objects.equals(openaiOrganization, that.openaiOrganization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        openaiApiBase,
        openaiApiKey,
        openaiApiType,
        openaiApiVersion,
        openaiDeploymentName,
        openaiOrganization);
  }

  @Override
  public String toString() {
    return new ToStringer(OpenAiConfig.class)
        .add("openaiApiBase", openaiApiBase)
        .add("openaiApiKey", openaiApiKey)
        .add("openaiApiType", openaiApiType)
        .add("openaiApiVersion", openaiApiVersion)
        .add("openaiDeploymentName", openaiDeploymentName)
        .add("openaiOrganization", openaiOrganization)
        .toString();
  }
}
