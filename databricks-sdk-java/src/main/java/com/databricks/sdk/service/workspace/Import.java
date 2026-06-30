// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Import {
  /**
   * The base64-encoded content. This has a limit of 10 MB.
   *
   * <p>If the limit (10MB) is exceeded, exception with error code **MAX_NOTEBOOK_SIZE_EXCEEDED** is
   * thrown. This parameter might be absent, and instead a posted file is used.
   */
  @JsonProperty("content")
  private String content;

  /**
   * This specifies the format of the file to be imported.
   *
   * <p>The value is case sensitive.
   *
   * <p>- `AUTO`: The item is imported depending on an analysis of the item's extension and the
   * header content provided in the request. If the item is imported as a notebook, then the item's
   * extension is automatically removed. - `SOURCE`: The notebook or directory is imported as source
   * code. - `HTML`: The notebook is imported as an HTML file. - `JUPYTER`: The notebook is imported
   * as a Jupyter/IPython Notebook file. - `DBC`: The notebook is imported in Databricks archive
   * format. Required for directories. - `R_MARKDOWN`: The notebook is imported from R Markdown
   * format.
   */
  @JsonProperty("format")
  private ImportFormat format;

  /** The language of the object. This value is set only if the object type is `NOTEBOOK`. */
  @JsonProperty("language")
  private Language language;

  /**
   * The flag that specifies whether to overwrite existing object. It is `false` by default. For
   * `DBC` format, `overwrite` is not supported since it may contain a directory.
   */
  @JsonProperty("overwrite")
  private Boolean overwrite;

  /**
   * The absolute path of the object or directory. Importing a directory is only supported for the
   * `DBC` and `SOURCE` formats.
   */
  @JsonProperty("path")
  private String path;

  public Import setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public Import setFormat(ImportFormat format) {
    this.format = format;
    return this;
  }

  public ImportFormat getFormat() {
    return format;
  }

  public Import setLanguage(Language language) {
    this.language = language;
    return this;
  }

  public Language getLanguage() {
    return language;
  }

  public Import setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
  }

  public Boolean getOverwrite() {
    return overwrite;
  }

  public Import setPath(String path) {
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
    Import that = (Import) o;
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
    return new ToStringer(Import.class)
        .add("content", content)
        .add("format", format)
        .add("language", language)
        .add("overwrite", overwrite)
        .add("path", path)
        .toString();
  }
}
