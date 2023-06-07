package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    fun nilaievaluasi(Nilai:Int):String {
        var hasil = ""
        if (Nilai >= 90) {
            hasil = "Selamat! Anda mendapatkan nilai A."
        }
        else if(Nilai in 80..89) {
            hasil = "Anda mendapatkan Nilai B"
        }
        else if(Nilai in 70..79) {
            hasil = "Anda mendapatkan Nilai C"
        }
        else if(Nilai in 60..69) {
            hasil = "Anda mendapatkan Nilai D"
        }
        else {
            hasil = "Anda mendapatkan Nilai E"
        }
        return hasil
    }
    val nilai1 = 96
    val nilai2 = 89
    val nilai3 = 78
    val nilai4 = 68
    val nilai5 = 50
    println(nilaievaluasi(nilai1))
    println(nilaievaluasi(nilai2))
    println(nilaievaluasi(nilai3))
    println(nilaievaluasi(nilai4))
    println(nilaievaluasi(nilai5))

}