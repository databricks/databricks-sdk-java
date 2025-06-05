// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = GetUpdateResponse.GetUpdateResponseSerializer.class)
@JsonDeserialize(using = GetUpdateResponse.GetUpdateResponseDeserializer.class)
public class GetUpdateResponse {
  /** The current update info. */
  private UpdateInfo update;

  public GetUpdateResponse setUpdate(UpdateInfo update) {
    this.update = update;
    return this;
  }

  public UpdateInfo getUpdate() {
    return update;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetUpdateResponse that = (GetUpdateResponse) o;
    return Objects.equals(update, that.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(update);
  }

  @Override
  public String toString() {
    return new ToStringer(GetUpdateResponse.class).add("update", update).toString();
  }

  GetUpdateResponsePb toPb() {
    GetUpdateResponsePb pb = new GetUpdateResponsePb();
    pb.setUpdate(update);

    return pb;
  }

  static GetUpdateResponse fromPb(GetUpdateResponsePb pb) {
    GetUpdateResponse model = new GetUpdateResponse();
    model.setUpdate(pb.getUpdate());

    return model;
  }

  public static class GetUpdateResponseSerializer extends JsonSerializer<GetUpdateResponse> {
    @Override
    public void serialize(GetUpdateResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetUpdateResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetUpdateResponseDeserializer extends JsonDeserializer<GetUpdateResponse> {
    @Override
    public GetUpdateResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetUpdateResponsePb pb = mapper.readValue(p, GetUpdateResponsePb.class);
      return GetUpdateResponse.fromPb(pb);
    }
  }
}
