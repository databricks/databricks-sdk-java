// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PipelineLibrary class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PipelineLibrary {
  /** The path to a file that defines a pipeline and is stored in the Databricks Repos. */
  @JsonProperty("file")
  private FileLibrary file;

  /** URI of the jar to be installed. Currently only DBFS is supported. */
  @JsonProperty("jar")
  private String jar;

  /** Specification of a maven library to be installed. */
  @JsonProperty("maven")
  private Object /* MISSING TYPE */ maven;

  /** The path to a notebook that defines a pipeline and is stored in the Databricks workspace. */
  @JsonProperty("notebook")
  private NotebookLibrary notebook;

  /** URI of the wheel to be installed. */
  @JsonProperty("whl")
  private String whl;

  /**
   * <p>Setter for the field <code>file</code>.</p>
   *
   * @param file a {@link com.databricks.sdk.service.pipelines.FileLibrary} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineLibrary} object
   */
  public PipelineLibrary setFile(FileLibrary file) {
    this.file = file;
    return this;
  }

  /**
   * <p>Getter for the field <code>file</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.FileLibrary} object
   */
  public FileLibrary getFile() {
    return file;
  }

  /**
   * <p>Setter for the field <code>jar</code>.</p>
   *
   * @param jar a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineLibrary} object
   */
  public PipelineLibrary setJar(String jar) {
    this.jar = jar;
    return this;
  }

  /**
   * <p>Getter for the field <code>jar</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getJar() {
    return jar;
  }

  /**
   * <p>Setter for the field <code>maven</code>.</p>
   *
   * @param maven a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineLibrary} object
   */
  public PipelineLibrary setMaven(Object /* MISSING TYPE */ maven) {
    this.maven = maven;
    return this;
  }

  /**
   * <p>Getter for the field <code>maven</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getMaven() {
    return maven;
  }

  /**
   * <p>Setter for the field <code>notebook</code>.</p>
   *
   * @param notebook a {@link com.databricks.sdk.service.pipelines.NotebookLibrary} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineLibrary} object
   */
  public PipelineLibrary setNotebook(NotebookLibrary notebook) {
    this.notebook = notebook;
    return this;
  }

  /**
   * <p>Getter for the field <code>notebook</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.pipelines.NotebookLibrary} object
   */
  public NotebookLibrary getNotebook() {
    return notebook;
  }

  /**
   * <p>Setter for the field <code>whl</code>.</p>
   *
   * @param whl a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.pipelines.PipelineLibrary} object
   */
  public PipelineLibrary setWhl(String whl) {
    this.whl = whl;
    return this;
  }

  /**
   * <p>Getter for the field <code>whl</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getWhl() {
    return whl;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineLibrary that = (PipelineLibrary) o;
    return Objects.equals(file, that.file)
        && Objects.equals(jar, that.jar)
        && Objects.equals(maven, that.maven)
        && Objects.equals(notebook, that.notebook)
        && Objects.equals(whl, that.whl);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(file, jar, maven, notebook, whl);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PipelineLibrary.class)
        .add("file", file)
        .add("jar", jar)
        .add("maven", maven)
        .add("notebook", notebook)
        .add("whl", whl)
        .toString();
  }
}
