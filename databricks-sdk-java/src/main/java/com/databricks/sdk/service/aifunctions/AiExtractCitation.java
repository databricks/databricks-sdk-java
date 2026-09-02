// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aifunctions;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * A citation locating an extracted value in the source. start/stop are set for span (STRING input)
 * citations, bbox for bbox (parsed-document input) citations.
 */
@Generated
public class AiExtractCitation {
  /** Bounding boxes locating the citation on the source pages; set for bbox citations. */
  @JsonProperty("bbox")
  private Collection<AiExtractBbox> bbox;

  /** Integer matching a citation_ids entry on an extracted field. */
  @JsonProperty("id")
  private Long id;

  /** Inclusive 0-based character offset into the input string; set for span citations. */
  @JsonProperty("start")
  private Long start;

  /** Exclusive 0-based character offset into the input string; set for span citations. */
  @JsonProperty("stop")
  private Long stop;

  public AiExtractCitation setBbox(Collection<AiExtractBbox> bbox) {
    this.bbox = bbox;
    return this;
  }

  public Collection<AiExtractBbox> getBbox() {
    return bbox;
  }

  public AiExtractCitation setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getId() {
    return id;
  }

  public AiExtractCitation setStart(Long start) {
    this.start = start;
    return this;
  }

  public Long getStart() {
    return start;
  }

  public AiExtractCitation setStop(Long stop) {
    this.stop = stop;
    return this;
  }

  public Long getStop() {
    return stop;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AiExtractCitation that = (AiExtractCitation) o;
    return Objects.equals(bbox, that.bbox)
        && Objects.equals(id, that.id)
        && Objects.equals(start, that.start)
        && Objects.equals(stop, that.stop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bbox, id, start, stop);
  }

  @Override
  public String toString() {
    return new ToStringer(AiExtractCitation.class)
        .add("bbox", bbox)
        .add("id", id)
        .add("start", start)
        .add("stop", stop)
        .toString();
  }
}
