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
@JsonSerialize(using = PendingStatus.PendingStatusSerializer.class)
@JsonDeserialize(using = PendingStatus.PendingStatusDeserializer.class)
public class PendingStatus {
  /**
   * The token to poll for result asynchronously Example:
   * EC0A..ChAB7WCEn_4Qo4vkLqEbXsxxEgh3Y2pbWw45WhoQXgZSQo9aS5q2ZvFcbvbx9CgA-PAEAQ
   */
  private String dataToken;

  public PendingStatus setDataToken(String dataToken) {
    this.dataToken = dataToken;
    return this;
  }

  public String getDataToken() {
    return dataToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PendingStatus that = (PendingStatus) o;
    return Objects.equals(dataToken, that.dataToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataToken);
  }

  @Override
  public String toString() {
    return new ToStringer(PendingStatus.class).add("dataToken", dataToken).toString();
  }

  PendingStatusPb toPb() {
    PendingStatusPb pb = new PendingStatusPb();
    pb.setDataToken(dataToken);

    return pb;
  }

  static PendingStatus fromPb(PendingStatusPb pb) {
    PendingStatus model = new PendingStatus();
    model.setDataToken(pb.getDataToken());

    return model;
  }

  public static class PendingStatusSerializer extends JsonSerializer<PendingStatus> {
    @Override
    public void serialize(PendingStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PendingStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PendingStatusDeserializer extends JsonDeserializer<PendingStatus> {
    @Override
    public PendingStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PendingStatusPb pb = mapper.readValue(p, PendingStatusPb.class);
      return PendingStatus.fromPb(pb);
    }
  }
}
