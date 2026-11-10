package com.maya.app.model;

// Résultat d'un scan de peau (simulé pour le MVP)
public record SkinScan(String skinType, int brightness, int redness, int shine) {
}
