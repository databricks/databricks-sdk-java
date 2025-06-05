// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AutoCaptureStatePb {
  @JsonProperty("payload_table")
  private PayloadTable payloadTable;

  public AutoCaptureStatePb setPayloadTable(PayloadTable payloadTable) {
    this.payloadTable = payloadTable;
    return this;
  }

  public PayloadTable getPayloadTable() {
    return payloadTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AutoCaptureStatePb that = (AutoCaptureStatePb) o;
    return Objects.equals(payloadTable, that.payloadTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloadTable);
  }

  @Override
  public String toString() {
    return new ToStringer(AutoCaptureStatePb.class).add("payloadTable", payloadTable).toString();
  }
}
