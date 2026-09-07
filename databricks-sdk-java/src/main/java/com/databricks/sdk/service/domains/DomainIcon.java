// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Icon configuration for a domain. */
@Generated
public class DomainIcon {
  /** Hex color code with # prefix (e.g., "#FF5733"). */
  @JsonProperty("color")
  private String color;

  /** */
  @JsonProperty("name")
  private DomainIconName name;

  public DomainIcon setColor(String color) {
    this.color = color;
    return this;
  }

  public String getColor() {
    return color;
  }

  public DomainIcon setName(DomainIconName name) {
    this.name = name;
    return this;
  }

  public DomainIconName getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DomainIcon that = (DomainIcon) o;
    return Objects.equals(color, that.color) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DomainIcon.class).add("color", color).add("name", name).toString();
  }
}
