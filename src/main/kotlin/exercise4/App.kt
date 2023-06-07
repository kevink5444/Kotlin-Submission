package id.infinitelearning.KotlinSubmission.exercise4

fun main() {



    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    val input = "123abcd"
    try {
        val angka = input.toInt()
        println("Hasil konversi: $angka")
    }catch (e : NumberFormatException){
        println("Terjadi Kesalahan Saat Mengubah String Menjadi Bilangan Bulat")
        println("Pesan Kesalahan: ${e.message}")
    }



}