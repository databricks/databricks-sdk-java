// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** The packages that a pipeline's tests need in addition to the pipeline's environment. */
@Generated
public class PipelineTestEnvironment {
  /**
   * A list of files that declare the packages the tests need: a project folder, a requirements
   * file, or a wheel, in the workspace or a UC volume. A project folder can take `--editable` and
   * an extra, for example `--editable /Workspace/Users/someone@example.com/orders[test]`. Package
   * names, such as `faker==33.0`, and URLs are rejected.
   */
  @JsonProperty("dependencies")
  private Collection<String> dependencies;

  public PipelineTestEnvironment setDependencies(Collection<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public Collection<String> getDependencies() {
    return dependencies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTestEnvironment that = (PipelineTestEnvironment) o;
    return Objects.equals(dependencies, that.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTestEnvironment.class)
        .add("dependencies", dependencies)
        .toString();
  }
}
