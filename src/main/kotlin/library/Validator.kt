package library

fun validator(inputCek: String?,jumlah:Int=0):Boolean {
    var valid:Boolean
    if (inputCek?.toDoubleOrNull() == null){
        println ("")
        println ("Inputan anda salah (Hanya dapat menginput angka). silahkan ulangi kembali!!")
        println ("")
        valid=false
    }else{
        if (inputCek!!.toInt()> jumlah && jumlah!=0){
            println ("")
            println ("Keterangan:\nInputan anda salah (hanya dapat menginput sesuai pilihan yang ada).\n" +
                    " Silahkan ulangi kembali!!")
            println ("")
            valid=false
        }else{
            valid=true
        }
    }
    return valid
}