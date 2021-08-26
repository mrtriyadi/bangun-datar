package BangunDatar
import library.fungsiInput

internal class Segitiga():BangunDatarParent(){
    private var alas:Double=0.0
    private var tinggi:Double=0.0
    init {
        var menu = Menu(
            "SEGITIGA","Menghitung Luas Segitiga Sama Kaki",
            "Menghitung Keliling Segitiga Sama Kaki"
        )

        tinggi = fungsiInput("tinggi")
        alas = fungsiInput("alas")

        when (menu.pilihanMenu){
            "1" ->{
               println ("Hasilnya adalah: ${hitungLuas()}")
            }
            "2" ->{
                println ("Hasilnya adalah: ${hitungKeliling()}")
            }
        }
    }

    override fun hitungKeliling(): Double {
        return Math.sqrt((this.alas*this.alas)+(this.tinggi*this.tinggi))
    }

    override fun hitungLuas():Double {
        return (this.alas/2) * this.tinggi
    }
}