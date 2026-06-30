// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * User Preference represents a user-specific setting scoped to an individual user within an
 * account. Unlike workspace or account settings that apply to all users, user preferences allow
 * personal customization (e.g., UI theme, editor preferences) without affecting other users.
 */
@Generated
public class UserPreference {
  /** */
  @JsonProperty("boolean_val")
  private BooleanMessage booleanVal;

  /** */
  @JsonProperty("effective_boolean_val")
  private BooleanMessage effectiveBooleanVal;

  /** */
  @JsonProperty("effective_string_val")
  private StringMessage effectiveStringVal;

  /** Name of the setting. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("string_val")
  private StringMessage stringVal;

  /** User ID of the user. */
  @JsonProperty("user_id")
  private String userId;

  public UserPreference setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public UserPreference setEffectiveBooleanVal(BooleanMessage effectiveBooleanVal) {
    this.effectiveBooleanVal = effectiveBooleanVal;
    return this;
  }

  public BooleanMessage getEffectiveBooleanVal() {
    return effectiveBooleanVal;
  }

  public UserPreference setEffectiveStringVal(StringMessage effectiveStringVal) {
    this.effectiveStringVal = effectiveStringVal;
    return this;
  }

  public StringMessage getEffectiveStringVal() {
    return effectiveStringVal;
  }

  public UserPreference setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UserPreference setStringVal(StringMessage stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  public StringMessage getStringVal() {
    return stringVal;
  }

  public UserPreference setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserPreference that = (UserPreference) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(effectiveBooleanVal, that.effectiveBooleanVal)
        && Objects.equals(effectiveStringVal, that.effectiveStringVal)
        && Objects.equals(name, that.name)
        && Objects.equals(stringVal, that.stringVal)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        booleanVal, effectiveBooleanVal, effectiveStringVal, name, stringVal, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(UserPreference.class)
        .add("booleanVal", booleanVal)
        .add("effectiveBooleanVal", effectiveBooleanVal)
        .add("effectiveStringVal", effectiveStringVal)
        .add("name", name)
        .add("stringVal", stringVal)
        .add("userId", userId)
        .toString();
  }
}
