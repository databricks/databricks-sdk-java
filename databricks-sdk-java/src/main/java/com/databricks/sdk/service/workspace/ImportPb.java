// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ImportPb {
  @JsonProperty("content")
  private String content;

  @JsonProperty("format")
  private ImportFormat format;

  @JsonProperty("language")
  private Language language;

  @JsonProperty("overwrite")
  private Boolean overwrite;

  @JsonProperty("path")
  private String path;

  public ImportPb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ImportPb setFormat(ImportFormat format) {
    this.format = format;
    return this;
  }

  public ImportFormat getFormat() {
    return format;
  }

  public ImportPb setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  public ImportPb setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  public ImportPb setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImportPb that = (ImportPb) o;
    return Objects.equals(content, that.content)
        && Objects.equals(format, that.format)
        && Objects.equals(language, that.language)
        && Objects.equals(overwrite, that.overwrite)
        && Objects.equals(path, that.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, format, language, overwrite, path);
  }

  @Override
  public String toString() {
    return new ToStringer(ImportPb.class)
        .add("content", content)
        .add("format", format)
        .add("language", language)
        .add("overwrite", overwrite)
        .add("path", path)
        .toString();
  }
}
