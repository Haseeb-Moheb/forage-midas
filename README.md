# Midas

Project repo for the JPMC Advanced Software Engineering Forage program

Midas Core needs a way to receive all incoming transactions. To this end, you must implement a class that listens to a Kafka topic and handles incoming messages. The name of the topic in question has already been added as a configurable value in the project's application.yml file. The Kafka Listener you implement should use this configuration value to select its topic. Your Kafka Listener should deserialize all incoming messages to the provided transaction class. Your goal for this task is simply to integrate Kafka into Midas Core; no need to do anything with the transactions yet. That comes later. The provided tests use an in-memory, embedded Kafka instance that should autowire itself into your Spring Application, so there is no need to specify a host or port in your consumer configuration.
