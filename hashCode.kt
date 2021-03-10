package app.hashCode

import data.HashCode.PerusahaanHashCode

// tanpa hashcode function
fun main() {
    val perusahaan1 = PerusahaanHashCode("Tesla")
    val perusahaan2 = PerusahaanHashCode ("Tesla")

    println(perusahaan1.hashCode())
    println(perusahaan2.hashCode())
    println(perusahaan1.hashCode() == perusahaan2.hashCode())
}