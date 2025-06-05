// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class PipelineLibraryPb {
  @JsonProperty("file")
  private FileLibrary file;

  @JsonProperty("glob")
  private PathPattern glob;

  @JsonProperty("jar")
  private String jar;

  @JsonProperty("maven")
  private com.databricks.sdk.service.compute.MavenLibrary maven;

  @JsonProperty("notebook")
  private NotebookLibrary notebook;

  @JsonProperty("whl")
  private String whl;

  public PipelineLibraryPb setFile(FileLibrary file) {
    this.file = file;
    return this;
  }

  public FileLibrary getFile() {
    return file;
  }

  public PipelineLibraryPb setGlob(PathPattern glob) {
    this.glob = glob;
    return this;
  }

  public PathPattern getGlob() {
    return glob;
  }

  public PipelineLibraryPb setJar(String jar) {
    this.jar = jar;
    return this;
  }

  public String getJar() {
    return jar;
  }

  public PipelineLibraryPb setMaven(com.databricks.sdk.service.compute.MavenLibrary maven) {
    this.maven = maven;
    return this;
  }

  public com.databricks.sdk.service.compute.MavenLibrary getMaven() {
    return maven;
  }

  public PipelineLibraryPb setNotebook(NotebookLibrary notebook) {
    this.notebook = notebook;
    return this;
  }

  public NotebookLibrary getNotebook() {
    return notebook;
  }

  public PipelineLibraryPb setWhl(String whl) {
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
    PipelineLibraryPb that = (PipelineLibraryPb) o;
    return Objects.equals(file, that.file)
        && Objects.equals(glob, that.glob)
        && Objects.equals(jar, that.jar)
        && Objects.equals(maven, that.maven)
        && Objects.equals(notebook, that.notebook)
        && Objects.equals(whl, that.whl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, glob, jar, maven, notebook, whl);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineLibraryPb.class)
        .add("file", file)
        .add("glob", glob)
        .add("jar", jar)
        .add("maven", maven)
        .add("notebook", notebook)
        .add("whl", whl)
        .toString();
  }
}
