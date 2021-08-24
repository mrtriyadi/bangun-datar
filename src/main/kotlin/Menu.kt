class Menu(judul: String="MENU",vararg pilihanMenu: String) {
    var pilihanMenu:String?=""
    init {
        do {
            var index:Int=0
            println("=================$judul=================")
            for (i in pilihanMenu) {
                index += 1
                println("$index. $i")

            }
            print("Silahkan masukan pilihan Anda: ")
            this.pilihanMenu = readLine()

        } while (validator(this.pilihanMenu, index)==false)
    }


}