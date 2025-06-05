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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ListingTag.ListingTagSerializer.class)
@JsonDeserialize(using = ListingTag.ListingTagDeserializer.class)
public class ListingTag {
  /** Tag name (enum) */
  private ListingTagType tagName;

  /** String representation of the tag value. Values should be string literals (no complex types) */
  private Collection<String> tagValues;

  public ListingTag setTagName(ListingTagType tagName) {
    this.tagName = tagName;
    return this;
  }

  public ListingTagType getTagName() {
    return tagName;
  }

  public ListingTag setTagValues(Collection<String> tagValues) {
    this.tagValues = tagValues;
    return this;
  }

  public Collection<String> getTagValues() {
    return tagValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListingTag that = (ListingTag) o;
    return Objects.equals(tagName, that.tagName) && Objects.equals(tagValues, that.tagValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, tagValues);
  }

  @Override
  public String toString() {
    return new ToStringer(ListingTag.class)
        .add("tagName", tagName)
        .add("tagValues", tagValues)
        .toString();
  }

  ListingTagPb toPb() {
    ListingTagPb pb = new ListingTagPb();
    pb.setTagName(tagName);
    pb.setTagValues(tagValues);

    return pb;
  }

  static ListingTag fromPb(ListingTagPb pb) {
    ListingTag model = new ListingTag();
    model.setTagName(pb.getTagName());
    model.setTagValues(pb.getTagValues());

    return model;
  }

  public static class ListingTagSerializer extends JsonSerializer<ListingTag> {
    @Override
    public void serialize(ListingTag value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListingTagPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListingTagDeserializer extends JsonDeserializer<ListingTag> {
    @Override
    public ListingTag deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListingTagPb pb = mapper.readValue(p, ListingTagPb.class);
      return ListingTag.fromPb(pb);
    }
  }
}
