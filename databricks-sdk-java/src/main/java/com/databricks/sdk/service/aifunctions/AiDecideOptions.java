// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** ai_decide */
@Generated
public class AiDecideOptions {
  /** The function API version to invoke. Defaults to "1.0". Supported versions: ["1.0"]. */
  @JsonProperty("version")
  private String version;

  public AiDecideOptions setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiDecideOptions that = (AiDecideOptions) o;
    return Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version);
  }

  @Override
  public String toString() {
    return new ToStringer(AiDecideOptions.class).add("version", version).toString();
  }
}
