package com.databricks.sdk.core;

import com.databricks.sdk.support.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Serializes an object into a list of query parameter entries compatible with gRPC-transcoding.
 *
 * <p>The Databricks REST API uses gRPC transcoding to expose gRPC services as REST APIs. This
 * serializer is used to serialize objects into a map of query parameter entries that can be used to
 * invoke a gRPC service via REST.
 *
 * <p>See <a
 * href="https://cloud.google.com/endpoints/docs/grpc-service-config/reference/rpc/google.api#google.api.HttpRule">the
 * documentation for gRPC transcoding</a> for more details.
 */
public class GrpcTranscodingQueryParamsSerializer {
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
  public static List<HeaderEntry> serialize(Object o) {
    Map<String, Object> flattened = flattenObject(o);
    for (Field f : o.getClass().getDeclaredFields()) {
      QueryParam queryParam = f.getAnnotation(QueryParam.class);
      if (queryParam == null) {
        flattened.remove(getFieldName(f));
      }
    }

    List<HeaderEntry> result = new ArrayList<>();
    for (Map.Entry<String, Object> entry : flattened.entrySet()) {
      String key = entry.getKey();
      Object value = entry.getValue();
      if (value instanceof Collection) {
        for (Object v : (Collection<Object>) value) {
          result.add(new HeaderEntry(key, v.toString()));
        }
      } else {
        result.add(new HeaderEntry(key, value.toString()));
      }
    }
    return result;
  }

  private static final List<Class<?>> primitiveTypes =
      Arrays.asList(
          boolean.class,
          Boolean.class,
          byte.class,
          Byte.class,
          char.class,
          Character.class,
          short.class,
          Short.class,
          int.class,
          Integer.class,
          long.class,
          Long.class,
          float.class,
          Float.class,
          double.class,
          Double.class,
          String.class);

  private static String getFieldName(Field f) {
    QueryParam queryParam = f.getAnnotation(QueryParam.class);
    JsonProperty jsonProperty = f.getAnnotation(JsonProperty.class);
    if (queryParam != null) {
      return queryParam.value();
    } else if (jsonProperty != null) {
      return jsonProperty.value();
    } else {
      return f.getName();
    }
  }

  private static Map<String, Object> flattenObject(Object o) {
    // LinkedHashMap ensures consistent ordering of fields.
    Map<String, Object> result = new LinkedHashMap<>();
    Field[] fields = o.getClass().getDeclaredFields();
    for (Field f : fields) {
      f.setAccessible(true);
      try {
        String name = getFieldName(f);
        Object value = f.get(o);
        if (value == null) {
          continue;
        }
        // check if object is a primitive type or a collection of some kind
        if (primitiveTypes.contains(f.getType()) || Iterable.class.isAssignableFrom(f.getType()) || f.getType().isEnum()) {
          result.put(name, value);
        } else {
          // recursively flatten the object
          Map<String, Object> flattened = flattenObject(value);
          for (Map.Entry<String, Object> entry : flattened.entrySet()) {
            result.put(name + "." + entry.getKey(), entry.getValue());
          }
        }
      } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
      } finally {
        f.setAccessible(false);
      }
    }
    return result;
  }
}
