// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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

@Generated
@JsonSerialize(using = SuccessStatus.SuccessStatusSerializer.class)
@JsonDeserialize(using = SuccessStatus.SuccessStatusDeserializer.class)
public class SuccessStatus {
  /**
   * The token to poll for result asynchronously Example:
   * EC0A..ChAB7WCEn_4Qo4vkLqEbXsxxEgh3Y2pbWw45WhoQXgZSQo9aS5q2ZvFcbvbx9CgA-PAEAQ
   */
  private String dataToken;

  /** Whether the query result is truncated (either by byte limit or row limit) */
  private Boolean truncated;

  public SuccessStatus setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  public SuccessStatus setTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuccessStatus that = (SuccessStatus) o;
    return Objects.equals(dataToken, that.dataToken) && Objects.equals(truncated, that.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToken, truncated);
  }

  @Override
  public String toString() {
    return new ToStringer(SuccessStatus.class)
        .add("dataToken", dataToken)
        .add("truncated", truncated)
        .toString();
  }

  SuccessStatusPb toPb() {
    SuccessStatusPb pb = new SuccessStatusPb();
    pb.setDataToken(dataToken);
    pb.setTruncated(truncated);

    return pb;
  }

  static SuccessStatus fromPb(SuccessStatusPb pb) {
    SuccessStatus model = new SuccessStatus();
    model.setDataToken(pb.getDataToken());
    model.setTruncated(pb.getTruncated());

    return model;
  }

  public static class SuccessStatusSerializer extends JsonSerializer<SuccessStatus> {
    @Override
    public void serialize(SuccessStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SuccessStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SuccessStatusDeserializer extends JsonDeserializer<SuccessStatus> {
    @Override
    public SuccessStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SuccessStatusPb pb = mapper.readValue(p, SuccessStatusPb.class);
      return SuccessStatus.fromPb(pb);
    }
  }
}
