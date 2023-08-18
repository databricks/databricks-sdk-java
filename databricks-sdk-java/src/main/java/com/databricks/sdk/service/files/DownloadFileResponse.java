// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

@Generated
public class DownloadFileResponse {
  /** */
  private Object /* MISSING TYPE */ contents;

  public DownloadFileResponse setContents(Object /* MISSING TYPE */ contents) {
    this.contents = contents;
    return this;
  }

  public Object /* MISSING TYPE */ getContents() {
    return contents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadFileResponse that = (DownloadFileResponse) o;
    return Objects.equals(contents, that.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadFileResponse.class).add("contents", contents).toString();
  }
}
