package app.hashCode

import data.HashCode.MahasiswaHashCode

fun main() {
    /** MahasiswaHashCode Class */
    val mahasiswa1 = MahasiswaHashCode("Ariq", 2312, "TIK")
    val mahasiswa2 = MahasiswaHashCode("Ariq", 2312, "TIK")


    println(mahasiswa1.hashCode())
    println(mahasiswa2.hashCode())
    println(mahasiswa1.hashCode() == mahasiswa2.hashCode())
}