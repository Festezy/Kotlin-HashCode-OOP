package data.HashCode

class PerusahaanHashCode (val name: String){
    override fun hashCode(): Int {
        return name.hashCode()
    }

}