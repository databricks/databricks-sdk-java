// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class PipelineLibrary {
  /**
   * URI of the jar to be installed. Currently only DBFS and S3 URIs are supported. For example: `{
   * "jar": "dbfs:/mnt/databricks/library.jar" }` or `{ "jar": "s3://my-bucket/library.jar" }`. If
   * S3 is used, please make sure the cluster has read access on the library. You may need to launch
   * the cluster with an IAM role to access the S3 URI.
   */
  @JsonProperty("jar")
  private String jar;

  /**
   * Specification of a maven library to be installed. For example: `{ "coordinates":
   * "org.jsoup:jsoup:1.7.2" }`
   */
  @JsonProperty("maven")
  private Object /* MISSING TYPE */ maven;

  /**
   * The path to a notebook that defines a pipeline and is stored in the Databricks workspace. For
   * example: `{ "notebook" : { "path" : "/my-pipeline-notebook-path" } }`. Currently, only Scala
   * notebooks are supported, and pipelines must be defined in a package cell.
   */
  @JsonProperty("notebook")
  private NotebookLibrary notebook;

  /**
   * URI of the wheel to be installed. For example: `{ "whl": "dbfs:/my/whl" }` or `{ "whl":
   * "s3://my-bucket/whl" }`. If S3 is used, please make sure the cluster has read access on the
   * library. You may need to launch the cluster with an IAM role to access the S3 URI.
   */
  @JsonProperty("whl")
  private String whl;

  public PipelineLibrary setJar(String jar) {
    this.jar = jar;
    return this;
  }

  public String getJar() {
    return jar;
  }

  public PipelineLibrary setMaven(Object /* MISSING TYPE */ maven) {
    this.maven = maven;
    return this;
  }

  public Object /* MISSING TYPE */ getMaven() {
    return maven;
  }

  public PipelineLibrary setNotebook(NotebookLibrary notebook) {
    this.notebook = notebook;
    return this;
  }

  public NotebookLibrary getNotebook() {
    return notebook;
  }

  public PipelineLibrary setWhl(String whl) {
    this.whl = whl;
    return this;
  }

  public String getWhl() {
    return whl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineLibrary that = (PipelineLibrary) o;
    return Objects.equals(jar, that.jar)
        && Objects.equals(maven, that.maven)
        && Objects.equals(notebook, that.notebook)
        && Objects.equals(whl, that.whl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jar, maven, notebook, whl);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineLibrary.class)
        .add("jar", jar)
        .add("maven", maven)
        .add("notebook", notebook)
        .add("whl", whl)
        .toString();
  }
}
