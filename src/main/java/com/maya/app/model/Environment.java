package com.maya.app.model;

// Conditions du jour : pollution (1 à 5), UV (1 à 10), humidité en %
public record Environment(int pollution, int uv, int humidity) {
}
