package dev.degoogle.app.microg

/**
 * Fonte unica de verdade sobre quais modulos compoem o microG.
 * GmsCore + Companion (FakeStore, package com.android.vending) andam juntos:
 * mesma fonte, mesmo download, mesma instalacao via prepare.
 */
object MicrogPackages {
    const val GMS = "com.google.android.gms"
    const val VENDING = "com.android.vending"

    val all: List<String> = listOf(GMS, VENDING)
}
