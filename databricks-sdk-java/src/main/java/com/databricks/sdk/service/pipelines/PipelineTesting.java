// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Test configuration for a pipeline. */
@Generated
public class PipelineTesting {
  /**
   * Packages that only the tests need. Test-only updates install them in addition to the pipeline's
   * `environment`. Other updates do not.
   */
  @JsonProperty("environment")
  private PipelineTestEnvironment environment;

  /**
   * The workspace files and folders that hold the pipeline's tests. They must not overlap the
   * pipeline's `libraries`.
   */
  @JsonProperty("sources")
  private Collection<PipelineTestSource> sources;

  public PipelineTesting setEnvironment(PipelineTestEnvironment environment) {
    this.environment = environment;
    return this;
  }

  public PipelineTestEnvironment getEnvironment() {
    return environment;
  }

  public PipelineTesting setSources(Collection<PipelineTestSource> sources) {
    this.sources = sources;
    return this;
  }

  public Collection<PipelineTestSource> getSources() {
    return sources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTesting that = (PipelineTesting) o;
    return Objects.equals(environment, that.environment) && Objects.equals(sources, that.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, sources);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTesting.class)
        .add("environment", environment)
        .add("sources", sources)
        .toString();
  }
}
