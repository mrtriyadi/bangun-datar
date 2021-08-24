//merupakan fungsi untuk melakukan inputan angka
//fungsi ini juga akan memanggil fungsi validator() untuk mengecek apakah inputan telah sesuai
//fungsi memiliki parameter dengan type data String dan akan mengembalikan type data Double

fun fungsiInput(jenisInput:String):Double{
    var inputAngka:String?=""
    do {
        print ("Masukan $jenisInput: ")
        inputAngka = readLine()

        //melakukan pengecekan apakah inputan berupa angka dengan fungsi validasi()
    }while (validator(inputAngka)==false)
    return inputAngka!!.toDouble()
}