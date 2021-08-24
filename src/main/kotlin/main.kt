fun main() {
    //menampilkan menu dengan Constructor Class Menu

        var menu = Menu("MENU", "Segitiga Sama Kaki", "Persegi")
        when (menu.pilihanMenu) {
            "1" -> {
                var segitigaObjects = Segitiga()
            }
            "2" -> {
                var persegiObjects = Persegi()
            }
        }
        if (ulang()==true) main()
}