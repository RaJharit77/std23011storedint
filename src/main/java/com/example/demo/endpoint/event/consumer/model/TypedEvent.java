package com.example.demo.endpoint.event.consumer.model;

import com.example.demo.PojaGenerated;
import com.example.demo.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
