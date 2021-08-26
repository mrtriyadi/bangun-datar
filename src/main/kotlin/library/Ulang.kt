package library

fun ulang(): Boolean {
    lateinit var ulang: String
    var hasil: Boolean = true
    do{
        println ("")
        print("Apakah ingin mengulangi(Y/T)?")
        ulang = readLine().toString().uppercase()
        when(ulang) {
            "Y" -> hasil = true
            "T" -> hasil = false
            else -> {
                println ("")
                println("Anda salah memasukan inputan. bego lo. silahkan input Y atau T")
            }
        }
    } while(ulang!="Y" && ulang!="T")

    return hasil
}