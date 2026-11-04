// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Unwraps an AWS CloudWatch Logs delivery envelope: each element of `logEvents` becomes its own
 * row, with the element's `message` parsed as the event body.
 */
@Generated
public class CloudWatchLogsEnvelope {
  /**
   * Whether to keep the envelope's `owner`, `logGroup`, and `logStream` values in the
   * `data.lw_header` field of each unwrapped row. Must be set explicitly to `true` or `false`.
   */
  @JsonProperty("header_retention")
  private Boolean headerRetention;

  public CloudWatchLogsEnvelope setHeaderRetention(Boolean headerRetention) {
    this.headerRetention = headerRetention;
    return this;
  }

  public Boolean getHeaderRetention() {
    return headerRetention;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloudWatchLogsEnvelope that = (CloudWatchLogsEnvelope) o;
    return Objects.equals(headerRetention, that.headerRetention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerRetention);
  }

  @Override
  public String toString() {
    return new ToStringer(CloudWatchLogsEnvelope.class)
        .add("headerRetention", headerRetention)
        .toString();
  }
}
