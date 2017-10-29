package koopad;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;

public class AppTest {
    private final App app = new App();

    @Test public void testAppHasAGreeting() {
      // when
      String greeting = app.getGreeting();

      // then
      assertThat(greeting).startsWith("Hello");
    }
}
