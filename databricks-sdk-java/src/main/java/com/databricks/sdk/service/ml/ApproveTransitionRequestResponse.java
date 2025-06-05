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
    using = ApproveTransitionRequestResponse.ApproveTransitionRequestResponseSerializer.class)
@JsonDeserialize(
    using = ApproveTransitionRequestResponse.ApproveTransitionRequestResponseDeserializer.class)
public class ApproveTransitionRequestResponse {
  /** Activity recorded for the action. */
  private Activity activity;

  public ApproveTransitionRequestResponse setActivity(Activity activity) {
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
    ApproveTransitionRequestResponse that = (ApproveTransitionRequestResponse) o;
    return Objects.equals(activity, that.activity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproveTransitionRequestResponse.class)
        .add("activity", activity)
        .toString();
  }

  ApproveTransitionRequestResponsePb toPb() {
    ApproveTransitionRequestResponsePb pb = new ApproveTransitionRequestResponsePb();
    pb.setActivity(activity);

    return pb;
  }

  static ApproveTransitionRequestResponse fromPb(ApproveTransitionRequestResponsePb pb) {
    ApproveTransitionRequestResponse model = new ApproveTransitionRequestResponse();
    model.setActivity(pb.getActivity());

    return model;
  }

  public static class ApproveTransitionRequestResponseSerializer
      extends JsonSerializer<ApproveTransitionRequestResponse> {
    @Override
    public void serialize(
        ApproveTransitionRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ApproveTransitionRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ApproveTransitionRequestResponseDeserializer
      extends JsonDeserializer<ApproveTransitionRequestResponse> {
    @Override
    public ApproveTransitionRequestResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ApproveTransitionRequestResponsePb pb =
          mapper.readValue(p, ApproveTransitionRequestResponsePb.class);
      return ApproveTransitionRequestResponse.fromPb(pb);
    }
  }
}
