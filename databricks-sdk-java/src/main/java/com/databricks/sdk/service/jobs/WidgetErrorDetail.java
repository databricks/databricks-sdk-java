// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = WidgetErrorDetail.WidgetErrorDetailSerializer.class)
@JsonDeserialize(using = WidgetErrorDetail.WidgetErrorDetailDeserializer.class)
public class WidgetErrorDetail {
  /** */
  private String message;

  public WidgetErrorDetail setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WidgetErrorDetail that = (WidgetErrorDetail) o;
    return Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    return new ToStringer(WidgetErrorDetail.class).add("message", message).toString();
  }

  WidgetErrorDetailPb toPb() {
    WidgetErrorDetailPb pb = new WidgetErrorDetailPb();
    pb.setMessage(message);

    return pb;
  }

  static WidgetErrorDetail fromPb(WidgetErrorDetailPb pb) {
    WidgetErrorDetail model = new WidgetErrorDetail();
    model.setMessage(pb.getMessage());

    return model;
  }

  public static class WidgetErrorDetailSerializer extends JsonSerializer<WidgetErrorDetail> {
    @Override
    public void serialize(WidgetErrorDetail value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WidgetErrorDetailPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WidgetErrorDetailDeserializer extends JsonDeserializer<WidgetErrorDetail> {
    @Override
    public WidgetErrorDetail deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WidgetErrorDetailPb pb = mapper.readValue(p, WidgetErrorDetailPb.class);
      return WidgetErrorDetail.fromPb(pb);
    }
  }
}
