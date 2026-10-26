// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sandbox;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** Metadata associated with a sandbox. */
@Generated
public class SandboxMetadata {
  /**
   * Key-value tags associated with the sandbox. Supports up to 54 tags. Keys must be between 1 and
   * 512 characters, and values must not exceed 256 characters.
   */
  @JsonProperty("custom_tags")
  private Map<String, String> customTags;

  public SandboxMetadata setCustomTags(Map<String, String> customTags) {
    this.customTags = customTags;
    return this;
  }

  public Map<String, String> getCustomTags() {
    return customTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SandboxMetadata that = (SandboxMetadata) o;
    return Objects.equals(customTags, that.customTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customTags);
  }

  @Override
  public String toString() {
    return new ToStringer(SandboxMetadata.class).add("customTags", customTags).toString();
  }
}
