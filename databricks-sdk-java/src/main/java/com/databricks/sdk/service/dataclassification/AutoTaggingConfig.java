// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dataclassification;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Auto-tagging configuration for a classification tag. When enabled, detected columns are
 * automatically tagged with Unity Catalog tags.
 */
@Generated
public class AutoTaggingConfig {
  /** Whether auto-tagging is enabled or disabled for this classification tag. */
  @JsonProperty("auto_tagging_mode")
  private AutoTaggingConfigAutoTaggingMode autoTaggingMode;

  /**
   * The Classification Tag. For built-in classes this is a system tag (e.g., "class.name",
   * "class.location"); for custom classes it is a user-defined governance tag key.
   */
  @JsonProperty("classification_tag")
  private String classificationTag;

  public AutoTaggingConfig setAutoTaggingMode(AutoTaggingConfigAutoTaggingMode autoTaggingMode) {
    this.autoTaggingMode = autoTaggingMode;
    return this;
  }

  public AutoTaggingConfigAutoTaggingMode getAutoTaggingMode() {
    return autoTaggingMode;
  }

  public AutoTaggingConfig setClassificationTag(String classificationTag) {
    this.classificationTag = classificationTag;
    return this;
  }

  public String getClassificationTag() {
    return classificationTag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoTaggingConfig that = (AutoTaggingConfig) o;
    return Objects.equals(autoTaggingMode, that.autoTaggingMode)
        && Objects.equals(classificationTag, that.classificationTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTaggingMode, classificationTag);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoTaggingConfig.class)
        .add("autoTaggingMode", autoTaggingMode)
        .add("classificationTag", classificationTag)
        .toString();
  }
}
