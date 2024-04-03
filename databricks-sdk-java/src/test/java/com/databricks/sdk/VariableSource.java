package com.databricks.sdk;

import java.lang.annotation.*;
import org.junit.jupiter.params.provider.ArgumentsSource;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(VariableArgumentsProvider.class)
public @interface VariableSource {
  /** The name of the static field containing the test arguments. */
  String value();
}
