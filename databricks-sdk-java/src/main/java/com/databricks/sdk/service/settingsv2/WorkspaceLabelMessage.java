// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Workspace label and color for display (e.g. in account console). */
@Generated
public class WorkspaceLabelMessage {
  /** */
  @JsonProperty("color")
  private String color;

  /** */
  @JsonProperty("label")
  private String label;

  public WorkspaceLabelMessage setColor(String color) {
    this.color = color;
    return this;
  }

  public String getColor() {
    return color;
  }

  public WorkspaceLabelMessage setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceLabelMessage that = (WorkspaceLabelMessage) o;
    return Objects.equals(color, that.color) && Objects.equals(label, that.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, label);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceLabelMessage.class)
        .add("color", color)
        .add("label", label)
        .toString();
  }
}
