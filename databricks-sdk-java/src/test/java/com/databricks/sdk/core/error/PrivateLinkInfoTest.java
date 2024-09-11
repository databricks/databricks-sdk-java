package com.databricks.sdk.core.error;

import com.databricks.sdk.core.error.platform.*;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import org.junit.jupiter.api.Test;

public class PrivateLinkInfoTest {
  @Test
  void testIsPrivateLinkRedirectWithLoginHtmlAndQueryParamSet() {
    Response response =
        new Response(
            new Request("GET", "https://example.com/login.html")
                .withQueryParam("error", "private-link-validation-error"),
            307,
            "Temporary Redirect",
            null);
    assert PrivateLinkInfo.isPrivateLinkRedirect(response) == true;
  }

  @Test
  void testIsPrivateLinkRedirectWithLoginHtmlAndQueryParamNotSet() {
    Response response =
        new Response(
            new Request("GET", "https://example.com/login.html"), 307, "Temporary Redirect", null);
    assert PrivateLinkInfo.isPrivateLinkRedirect(response) == false;
  }

  @Test
  void testIsPrivateLinkRedirectNotLoginPage() {
    Response response =
        new Response(
            new Request("GET", "https://example.com/not-login.html"),
            307,
            "Temporary Redirect",
            null);
    assert PrivateLinkInfo.isPrivateLinkRedirect(response) == false;
  }
}
