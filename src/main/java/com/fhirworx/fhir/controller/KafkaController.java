package com.fhirworx.fhir.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fhirworx.fhir.services.impl.ProducerServiceimpl;

@RestController
@RequestMapping("/kafka")
public final class KafkaController {
    private final ProducerServiceimpl producerServiceimpl;

    public KafkaController(ProducerServiceimpl producerServiceimpl) {
        this.producerServiceimpl = producerServiceimpl;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String message) {
    	producerServiceimpl.sendMessage(message);
    }
}
