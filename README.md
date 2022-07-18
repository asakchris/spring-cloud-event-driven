# Event Driven - Spring Cloud Function & Spring Cloud Stream Binder Kafka
### Key Points
- Spring Cloud Function is used to represent business logic via functions
- Spring Cloud Stream Binder Kafka to decouple application responsibilities with event-centric thinking
- An event can represent something that has happened in time, to which the downstream consumer applications can react without knowing where it originated or the producer’s identity
- Kafka native encoding/decoding is disabled and used Spring Cloud framework provided message conversion

### Use Case
- Producer module generates new message every one minute and publish to `message-topic`
- Transformer module transforms messages in `message-topic` into uppercase and publish to `uppercase-message-topic`
- Consumer module consumes the messages in `uppercase-message-topic` and print it in the log

### Run in local
1. Run Zoo Keeper & Kafka by running [docker-compose](docker-compose.yml) using `docker-compose up -d`
2. Run `Producer` module by running [this](.run/Producer.run.xml) in IDE
3. Run `Transformer` module by running [this](.run/Transformer.run.xml) in IDE
4. Run `Consumer` module by running [this](.run/Consumer.run.xml) in IDE
