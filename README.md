# Blue Cross and Blue Shield Florida (BCBSFL)

## Quick start

 Install Kafka .

 Start all services(Start the ZooKeeper service) open terminal and run:

	$ bin/zookeeper-server-start.sh config/zookeeper.properties
	
Open another terminal(Start the Kafka broker service) session and run:

	$ bin/kafka-server-start.sh config/server.properties
	
 Create a topic("quickstart-events" == topic). 

	$ bin/kafka-topics.sh --create --topic kafkaTopic --bootstrap-server localhost:9092

 Run the console producer client to write a few events into your topic (open new terminal)

	$ bin/kafka-console-producer.sh --topic kafkaTopic --bootstrap-server localhost:9092

 Open another terminal session and run the console consumer client 

	$ bin/kafka-console-consumer.sh --topic kafkaTopic --from-beginning --bootstrap-server localhost:9092.
		
 Initial test
 
		http://localhost:8080/fhir/kafka/publish?message=hello kafka.
