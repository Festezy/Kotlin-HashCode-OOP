package data.HashCode

class MahasiswaHashCode (val Name: String, val Nim: Int, val Jurusan: String) {
    override fun hashCode(): Int {
        return Name.hashCode()
        return Nim.hashCode()
        return Jurusan.hashCode()
    }
}