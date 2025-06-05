// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(
    using = RejectTransitionRequestResponse.RejectTransitionRequestResponseSerializer.class)
@JsonDeserialize(
    using = RejectTransitionRequestResponse.RejectTransitionRequestResponseDeserializer.class)
public class RejectTransitionRequestResponse {
  /** Activity recorded for the action. */
  private Activity activity;

  public RejectTransitionRequestResponse setActivity(Activity activity) {
    this.activity = activity;
    return this;
  }

  public Activity getActivity() {
    return activity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RejectTransitionRequestResponse that = (RejectTransitionRequestResponse) o;
    return Objects.equals(activity, that.activity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity);
  }

  @Override
  public String toString() {
    return new ToStringer(RejectTransitionRequestResponse.class)
        .add("activity", activity)
        .toString();
  }

  RejectTransitionRequestResponsePb toPb() {
    RejectTransitionRequestResponsePb pb = new RejectTransitionRequestResponsePb();
    pb.setActivity(activity);

    return pb;
  }

  static RejectTransitionRequestResponse fromPb(RejectTransitionRequestResponsePb pb) {
    RejectTransitionRequestResponse model = new RejectTransitionRequestResponse();
    model.setActivity(pb.getActivity());

    return model;
  }

  public static class RejectTransitionRequestResponseSerializer
      extends JsonSerializer<RejectTransitionRequestResponse> {
    @Override
    public void serialize(
        RejectTransitionRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RejectTransitionRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RejectTransitionRequestResponseDeserializer
      extends JsonDeserializer<RejectTransitionRequestResponse> {
    @Override
    public RejectTransitionRequestResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RejectTransitionRequestResponsePb pb =
          mapper.readValue(p, RejectTransitionRequestResponsePb.class);
      return RejectTransitionRequestResponse.fromPb(pb);
    }
  }
}
