package BangunDatar
import library.fungsiInput

internal class Persegi(): BangunDatarParent(){
    private var sisi:Double=0.0
    init {
        var menu = Menu(
            "PERSEGI","Menghitung Luas Persegi",
            "Menghitung Keliling Persegi"
        )

        sisi = fungsiInput("sisi")

        when (menu.pilihanMenu){
            "1" ->{
               println ("Hasilnya adalah: ${hitungLuas()}")
            }
            "2" ->{
                println ("Hasilnya adalah: ${hitungKeliling()}")
            }
        }
    }

    override fun hitungLuas():Double {

        return this.sisi*this.sisi
    }

    override fun hitungKeliling():Double {
        return this.sisi*4
    }





}