// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** A bounding box on a source page; used by bbox-input citations. */
@Generated
public class AiExtractBbox {
  /** Pixel coordinates on the page image as [x0, y0, x1, y1]. */
  @JsonProperty("coord")
  private Collection<Long> coord;

  /** 0-based page index the box is on. */
  @JsonProperty("page_id")
  private Long pageId;

  public AiExtractBbox setCoord(Collection<Long> coord) {
    this.coord = coord;
    return this;
  }

  public Collection<Long> getCoord() {
    return coord;
  }

  public AiExtractBbox setPageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  public Long getPageId() {
    return pageId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiExtractBbox that = (AiExtractBbox) o;
    return Objects.equals(coord, that.coord) && Objects.equals(pageId, that.pageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coord, pageId);
  }

  @Override
  public String toString() {
    return new ToStringer(AiExtractBbox.class).add("coord", coord).add("pageId", pageId).toString();
  }
}
