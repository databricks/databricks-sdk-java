// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListStatusResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListStatusResponse {
  /** A list of FileInfo's that describe contents of directory or file. See example above. */
  @JsonProperty("files")
  private Collection<FileInfo> files;

  /**
   * <p>Setter for the field <code>files</code>.</p>
   *
   * @param files a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.files.ListStatusResponse} object
   */
  public ListStatusResponse setFiles(Collection<FileInfo> files) {
    this.files = files;
    return this;
  }

  /**
   * <p>Getter for the field <code>files</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<FileInfo> getFiles() {
    return files;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListStatusResponse that = (ListStatusResponse) o;
    return Objects.equals(files, that.files);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListStatusResponse.class).add("files", files).toString();
  }
}
