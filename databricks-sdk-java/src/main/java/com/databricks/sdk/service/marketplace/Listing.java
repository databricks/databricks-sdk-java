// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = Listing.ListingSerializer.class)
@JsonDeserialize(using = Listing.ListingDeserializer.class)
public class Listing {
  /** */
  private ListingDetail detail;

  /** */
  private String id;

  /** */
  private ListingSummary summary;

  public Listing setDetail(ListingDetail detail) {
    this.detail = detail;
    return this;
  }

  public ListingDetail getDetail() {
    return detail;
  }

  public Listing setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public Listing setSummary(ListingSummary summary) {
    this.summary = summary;
    return this;
  }

  public ListingSummary getSummary() {
    return summary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Listing that = (Listing) o;
    return Objects.equals(detail, that.detail)
        && Objects.equals(id, that.id)
        && Objects.equals(summary, that.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, id, summary);
  }

  @Override
  public String toString() {
    return new ToStringer(Listing.class)
        .add("detail", detail)
        .add("id", id)
        .add("summary", summary)
        .toString();
  }

  ListingPb toPb() {
    ListingPb pb = new ListingPb();
    pb.setDetail(detail);
    pb.setId(id);
    pb.setSummary(summary);

    return pb;
  }

  static Listing fromPb(ListingPb pb) {
    Listing model = new Listing();
    model.setDetail(pb.getDetail());
    model.setId(pb.getId());
    model.setSummary(pb.getSummary());

    return model;
  }

  public static class ListingSerializer extends JsonSerializer<Listing> {
    @Override
    public void serialize(Listing value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListingPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListingDeserializer extends JsonDeserializer<Listing> {
    @Override
    public Listing deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListingPb pb = mapper.readValue(p, ListingPb.class);
      return Listing.fromPb(pb);
    }
  }
}
