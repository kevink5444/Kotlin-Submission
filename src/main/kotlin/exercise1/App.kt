package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
- Dan cetak setiap variabel ke layar saat fungsi myProfile() di panggil
 */
fun myProfile() {
    val namaDepan: String = "Nathaniel Kevin"
    val namaBelakang: String = "Kurniawan"
    var Umur: Number = 21
    val single: Boolean = true

    println("Nama Depan: $namaDepan")
    println("Nama Belakang : $namaBelakang")
    println("Umur Saya : $Umur")
    println("Single atau Tidak : $single")


}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("Anggota Grup = $groupMember")
    println("Dari Sesi = $session")
    println("Dari Kelompok = $groupId")
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myGroup ini
 *
 */
val daftarAnggota: List<String> = listOf("Ananda", "Adi", "Peja","Mikais","Kevin","Nur","Irsyad","Reneta","Jordan","Ali")

fun myGroup(): String {
    val Kevin: String = daftarAnggota[4]
    return Kevin


}
/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza","Sarif","Leni")
    val countOfGroup = 10
    val totalMember: Int = mentor.size + countOfGroup
    return totalMember

}

fun main() {

    myProfile()
    val Kevin = myGroup()
    println("Nama saya: $Kevin")
    val myGroup = myGroup()
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(3, listOf("Ananda", "Adi", "Peja","Mikais","Kevin","Nur","Irsyad","Reneta","Jordan","Ali"), "Afternoon")

}