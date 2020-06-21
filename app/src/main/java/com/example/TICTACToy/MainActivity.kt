package com.example.TICTACToy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.coroutines.EmptyCoroutineContext

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun butselect(view: View){
        val buChoice=view as Button
        var CelliD=0
        when(buChoice.id){
            R.id.button1->CelliD=1
            R.id.button2->CelliD=2
            R.id.button3->CelliD=3
            R.id.button4->CelliD=4
            R.id.button5->CelliD=5
            R.id.button6->CelliD=6
            R.id.button7->CelliD=7
            R.id.button8->CelliD=8
            R.id.button9->CelliD=9

        }

      PlayGame(CelliD, buChoice)


    }
    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    var activeplayer=1

    fun PlayGame(CelliD:Int,buChoice: Button){
        if (activeplayer==1){
            buChoice.setBackgroundResource(R.drawable.x)
            player1.add(CelliD)
            activeplayer=2
        }
        else{
            buChoice.setBackgroundResource(R.drawable.o)
            player2.add(CelliD)
            activeplayer=1
        }
        buChoice.isEnabled=false
        checkWennir()


    }
    fun checkWennir(){
        var winner=-1
        //row1
        if (player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner=1
        }
        if (player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner=2
        }
        //row2
        if (player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner=1
        }
        if (player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner=2
        }
        //row3
        if (player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner=1
        }
        if (player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner=2
        }
        //coloum1
        if (player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner=1
        }
        if (player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner=2
        }
        //coloum2
        if (player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner=1
        }
        if (player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner=2
        }
        //coloum3
        if (player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner=1
        }
        if (player2.contains(3)&&player2.contains(6)&&player2.contains(9)){
            winner=2
        }
        //crossx
        if (player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winner=1
        }
        if (player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winner=2
        }
        //crossx
        if (player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            winner=1
        }
        if (player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winner=2
        }
        if (winner!=-1){
            if (winner==1){
                Toast.makeText(this,"player1 winner",Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this,"player2 winner",Toast.LENGTH_LONG).show()

            }



        }



    }

}
