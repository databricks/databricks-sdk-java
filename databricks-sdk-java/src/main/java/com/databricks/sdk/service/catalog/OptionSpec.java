// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * Spec of an allowed option on a securable kind and its attributes. This is mostly used by UI to
 * provide user friendly hints and descriptions in order to facilitate the securable creation
 * process.
 */
@Generated
public class OptionSpec {
  /**
   * For drop down / radio button selections, UI will want to know the possible input values, it can
   * also be used by other option types to limit input selections.
   */
  @JsonProperty("allowed_values")
  private Collection<String> allowedValues;

  /** The default value of the option, for example, value '443' for 'port' option. */
  @JsonProperty("default_value")
  private String defaultValue;

  /** A concise user facing description of what the input value of this option should look like. */
  @JsonProperty("description")
  private String description;

  /**
   * The hint is used on the UI to suggest what the input value can possibly be like, for example:
   * example.com for 'host' option. Unlike default value, it will not be applied automatically
   * without user input.
   */
  @JsonProperty("hint")
  private String hint;

  /** Indicates whether an option should be displayed with copy button on the UI. */
  @JsonProperty("is_copiable")
  private Boolean isCopiable;

  /**
   * Indicates whether an option can be provided by users in the create/update path of an entity.
   */
  @JsonProperty("is_creatable")
  private Boolean isCreatable;

  /** Is the option value not user settable and is thus not shown on the UI. */
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  /** Specifies whether this option is safe to log, i.e. no sensitive information. */
  @JsonProperty("is_loggable")
  private Boolean isLoggable;

  /** Is the option required. */
  @JsonProperty("is_required")
  private Boolean isRequired;

  /** Is the option value considered secret and thus redacted on the UI. */
  @JsonProperty("is_secret")
  private Boolean isSecret;

  /** Is the option updatable by users. */
  @JsonProperty("is_updatable")
  private Boolean isUpdatable;

  /** The unique name of the option. */
  @JsonProperty("name")
  private String name;

  /** Specifies when the option value is displayed on the UI within the OAuth flow. */
  @JsonProperty("oauth_stage")
  private OptionSpecOauthStage oauthStage;

  /** The type of the option. */
  @JsonProperty("type")
  private OptionSpecOptionType typeValue;

  public OptionSpec setAllowedValues(Collection<String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public Collection<String> getAllowedValues() {
    return allowedValues;
  }

  public OptionSpec setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public OptionSpec setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public OptionSpec setHint(String hint) {
    this.hint = hint;
    return this;
  }

  public String getHint() {
    return hint;
  }

  public OptionSpec setIsCopiable(Boolean isCopiable) {
    this.isCopiable = isCopiable;
    return this;
  }

  public Boolean getIsCopiable() {
    return isCopiable;
  }

  public OptionSpec setIsCreatable(Boolean isCreatable) {
    this.isCreatable = isCreatable;
    return this;
  }

  public Boolean getIsCreatable() {
    return isCreatable;
  }

  public OptionSpec setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public OptionSpec setIsLoggable(Boolean isLoggable) {
    this.isLoggable = isLoggable;
    return this;
  }

  public Boolean getIsLoggable() {
    return isLoggable;
  }

  public OptionSpec setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  public Boolean getIsRequired() {
    return isRequired;
  }

  public OptionSpec setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
    return this;
  }

  public Boolean getIsSecret() {
    return isSecret;
  }

  public OptionSpec setIsUpdatable(Boolean isUpdatable) {
    this.isUpdatable = isUpdatable;
    return this;
  }

  public Boolean getIsUpdatable() {
    return isUpdatable;
  }

  public OptionSpec setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public OptionSpec setOauthStage(OptionSpecOauthStage oauthStage) {
    this.oauthStage = oauthStage;
    return this;
  }

  public OptionSpecOauthStage getOauthStage() {
    return oauthStage;
  }

  public OptionSpec setType(OptionSpecOptionType typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public OptionSpecOptionType getType() {
    return typeValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionSpec that = (OptionSpec) o;
    return Objects.equals(allowedValues, that.allowedValues)
        && Objects.equals(defaultValue, that.defaultValue)
        && Objects.equals(description, that.description)
        && Objects.equals(hint, that.hint)
        && Objects.equals(isCopiable, that.isCopiable)
        && Objects.equals(isCreatable, that.isCreatable)
        && Objects.equals(isHidden, that.isHidden)
        && Objects.equals(isLoggable, that.isLoggable)
        && Objects.equals(isRequired, that.isRequired)
        && Objects.equals(isSecret, that.isSecret)
        && Objects.equals(isUpdatable, that.isUpdatable)
        && Objects.equals(name, that.name)
        && Objects.equals(oauthStage, that.oauthStage)
        && Objects.equals(typeValue, that.typeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedValues,
        defaultValue,
        description,
        hint,
        isCopiable,
        isCreatable,
        isHidden,
        isLoggable,
        isRequired,
        isSecret,
        isUpdatable,
        name,
        oauthStage,
        typeValue);
  }

  @Override
  public String toString() {
    return new ToStringer(OptionSpec.class)
        .add("allowedValues", allowedValues)
        .add("defaultValue", defaultValue)
        .add("description", description)
        .add("hint", hint)
        .add("isCopiable", isCopiable)
        .add("isCreatable", isCreatable)
        .add("isHidden", isHidden)
        .add("isLoggable", isLoggable)
        .add("isRequired", isRequired)
        .add("isSecret", isSecret)
        .add("isUpdatable", isUpdatable)
        .add("name", name)
        .add("oauthStage", oauthStage)
        .add("typeValue", typeValue)
        .toString();
  }
}
