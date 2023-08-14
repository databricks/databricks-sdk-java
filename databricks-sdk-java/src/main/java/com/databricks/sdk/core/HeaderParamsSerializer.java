package com.databricks.sdk.core;

import com.databricks.sdk.support.HeaderParam;
import java.lang.reflect.Field;
import java.util.*;

public class HeaderParamsSerializer {

  public static class HeaderEntry {
    private final String key;
    private final String value;

    public HeaderEntry(String key, String value) {
      this.key = key;
      this.value = value;
    }

    public String getKey() {
      return key;
    }

    public String getValue() {
      return value;
    }
  }
  /**
   * Serializes an object into a map of query parameter values compatible with gRPC-transcoding.
   *
   * <p>This method respects the QueryParam and JsonProperty annotations on the object's fields when
   * serializing the field name. If both annotations are present, the value of the QueryParam
   * annotation is used.
   *
   * <p>The returned object does not contain any top-level fields that are not annotated with
   * QueryParam. All nested fields are included, even if they are not annotated with QueryParam.
   *
   * @param o The object to serialize.
   * @return A list of query parameter entries compatible with gRPC-transcoding.
   */
  public static List<HeaderParamsSerializer.HeaderEntry> serialize(Object o) {
    List<HeaderParamsSerializer.HeaderEntry> result = new ArrayList<>();
    for (Field f : o.getClass().getDeclaredFields()) {
      HeaderParam headerParam = f.getAnnotation(HeaderParam.class);
      if (headerParam == null) {
        continue;
      }
      // Only support single string headers for now.
      if (!f.getType().isAssignableFrom(String.class)) {
        throw new IllegalArgumentException(
            String.format(
                "Field %s is annotated with @HeaderParam, but is not of type String.",
                getFieldName(f)));
      }
      f.setAccessible(true);
      try {
        result.add(new HeaderParamsSerializer.HeaderEntry(headerParam.value(), (String) f.get(o)));
      } catch (IllegalAccessException e) {
        throw new DatabricksException("Failed to read header entries", e);
      } finally {
        f.setAccessible(false);
      }
    }

    return result;
  }

  private static String getFieldName(Field f) {
    HeaderParam headerParam = f.getAnnotation(HeaderParam.class);
    if (headerParam != null) {
      return headerParam.value();
    } else {
      return f.getName();
    }
  }
}
