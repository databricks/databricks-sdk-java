// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

/** Return billable usage logs */
@Generated
@JsonSerialize(using = DownloadRequest.DownloadRequestSerializer.class)
@JsonDeserialize(using = DownloadRequest.DownloadRequestDeserializer.class)
public class DownloadRequest {
  /** Format: `YYYY-MM`. Last month to return billable usage logs for. This field is required. */
  private String endMonth;

  /**
   * Specify whether to include personally identifiable information in the billable usage logs, for
   * example the email addresses of cluster creators. Handle this information with care. Defaults to
   * false.
   */
  private Boolean personalData;

  /** Format: `YYYY-MM`. First month to return billable usage logs for. This field is required. */
  private String startMonth;

  public DownloadRequest setEndMonth(String endMonth) {
    this.endMonth = endMonth;
    return this;
  }

  public String getEndMonth() {
    return endMonth;
  }

  public DownloadRequest setPersonalData(Boolean personalData) {
    this.personalData = personalData;
    return this;
  }

  public Boolean getPersonalData() {
    return personalData;
  }

  public DownloadRequest setStartMonth(String startMonth) {
    this.startMonth = startMonth;
    return this;
  }

  public String getStartMonth() {
    return startMonth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DownloadRequest that = (DownloadRequest) o;
    return Objects.equals(endMonth, that.endMonth)
        && Objects.equals(personalData, that.personalData)
        && Objects.equals(startMonth, that.startMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMonth, personalData, startMonth);
  }

  @Override
  public String toString() {
    return new ToStringer(DownloadRequest.class)
        .add("endMonth", endMonth)
        .add("personalData", personalData)
        .add("startMonth", startMonth)
        .toString();
  }

  DownloadRequestPb toPb() {
    DownloadRequestPb pb = new DownloadRequestPb();
    pb.setEndMonth(endMonth);
    pb.setPersonalData(personalData);
    pb.setStartMonth(startMonth);

    return pb;
  }

  static DownloadRequest fromPb(DownloadRequestPb pb) {
    DownloadRequest model = new DownloadRequest();
    model.setEndMonth(pb.getEndMonth());
    model.setPersonalData(pb.getPersonalData());
    model.setStartMonth(pb.getStartMonth());

    return model;
  }

  public static class DownloadRequestSerializer extends JsonSerializer<DownloadRequest> {
    @Override
    public void serialize(DownloadRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DownloadRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DownloadRequestDeserializer extends JsonDeserializer<DownloadRequest> {
    @Override
    public DownloadRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DownloadRequestPb pb = mapper.readValue(p, DownloadRequestPb.class);
      return DownloadRequest.fromPb(pb);
    }
  }
}
