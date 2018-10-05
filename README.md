# dcompose-logging-example

Example code using the [gradle-dcompose-plugin](https://github.com/chrisgahlert/gradle-dcompose-plugin)
with added log driver support.

Run `./gradlew startContainers` to create the stack:
- Portainer on http://localhost:9000
- Generator container generating random logs
- EFK stack
  * Fluentd collecting logs from generator
  * Elasticsearch receiving logs from fluentd
  * Kibana to view the log entries
- Nginx reverse proxying Kibana at https://localhost with self-signed
  certificate, redirects to HTTPS from HTTP.

Added `logConfig` support, see the generator entry in `build.gradle`
```
    generator {
        baseDir = file 'generator'
        env = ['TZ=$TZ']
        logConfig = 'fluentd'
    }
```
