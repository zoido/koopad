package koopad.service.options;

import com.google.devtools.common.options.Option;
import com.google.devtools.common.options.OptionsBase;

/** Defines flags for server. */
public class ServerOptions extends OptionsBase {
  @Option(
    name = "port",
    abbrev = 'p',
    help = "The server port.",
    category = "startup",
    defaultValue = "8080"
  )
  public int port;
}
