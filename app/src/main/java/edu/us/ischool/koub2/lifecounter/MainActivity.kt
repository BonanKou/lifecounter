package edu.us.ischool.koub2.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var life1 = 20
    var life2 = 20
    var life3 = 20
    var life4 = 20

    fun alive(player:Int):Boolean {
        var aliveOr = false
        var name = ""
        when (player) {
            1 -> {
                aliveOr = (life1 > 0)
                name = "Player 1"
            }

            2 -> {aliveOr = (life2 > 0)
            name = "Player 2"
        }
            3 ->{aliveOr =  (life3 > 0)
            name = "Player 3"}
            4 -> {aliveOr = (life4 > 0)
                name = "Player 4"
            }

        }
        if (!aliveOr) {
            findViewById<TextView>(R.id.dead).setText(name+ " LOSES!")
        }
        return aliveOr
    }
    fun operate (name:Int, point:Int) {
        Log.e("kill", "no")
        var result = false

        when (name) {
            1 -> {
                life1 = life1 + point
                result = alive(name)
                Log.e("kill", "please" + life1.toString())
                findViewById<TextView>(R.id.btnPlayer1).setText(life1.toString())
            }
            2 -> {
                life2 = life2 + point
                result = alive(name)
                findViewById<TextView>(R.id.btnPlayer2).setText(life2.toString())
            }
            3 -> {
                life3 = life3 + point
                result = alive(name)
                findViewById<TextView>(R.id.btnPlayer3).setText(life3.toString())
            }
            4 -> {
                life4 = life4 + point
                result = alive(name)
                findViewById<TextView>(R.id.btnPlayer4).setText(life4.toString())
            }
        }
        if (!result) {
            if (name == 1) {
                findViewById<TextView>(R.id.btnPlayer1).setText(0.toString())

            } else if (name == 2) {
                findViewById<TextView>(R.id.btnPlayer2).setText(0.toString())
            } else if (name == 3) {
                findViewById<TextView>(R.id.btnPlayer3).setText(0.toString())
            } else {
                findViewById<TextView>(R.id.btnPlayer4).setText(0.toString())
            }

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val p1Minus = findViewById<Button>(R.id.player1Minus)
        p1Minus.setOnClickListener {
            operate(1, -1)
        }
        val p2Minus = findViewById<Button>(R.id.player2Minus)
        p2Minus.setOnClickListener {
            operate(2, -1)
        }
        val p3Minus = findViewById<Button>(R.id.player3Minus)
        p3Minus.setOnClickListener {
            operate(3, -1)
        }
        val p4Minus = findViewById<Button>(R.id.player4Minus)
        p4Minus.setOnClickListener {
            operate(4, -1)
        }

        val p1minus = findViewById<Button>(R.id.player1minus)
        p1minus.setOnClickListener {
            operate(1, -5)
        }
        val p2minus = findViewById<Button>(R.id.player2minus)
        p2minus.setOnClickListener {
            operate(2, -5)
        }
        val p3minus = findViewById<Button>(R.id.player3minus)
        p3minus.setOnClickListener {
            operate(3, -5)
        }
        val p4minus = findViewById<Button>(R.id.player4minus)
        p4minus.setOnClickListener {
            operate(4, -5)
        }
        val p1plus = findViewById<Button>(R.id.player1plus)
        p1plus.setOnClickListener {
            operate(1, 5)
        }
        val p2plus = findViewById<Button>(R.id.player2plus)
        p2plus.setOnClickListener {
            operate(2, 5)
        }
        val p3plus = findViewById<Button>(R.id.player3plus)
        p3plus.setOnClickListener {
            operate(3, 5)
        }
        val p4plus = findViewById<Button>(R.id.player4plus)
        p4plus.setOnClickListener {
            operate(4, 5)
        }

        val p1Plus = findViewById<Button>(R.id.player1Plus)
        p1Plus.setOnClickListener {
            operate(1,1)
        }
        val p2Plus = findViewById<Button>(R.id.player2Plus)
        p2Plus.setOnClickListener {
            operate(2,1)
        }
        val p3Plus = findViewById<Button>(R.id.player3Plus)
        p3Plus.setOnClickListener {
            operate(3,1)
        }
        val p4Plus = findViewById<Button>(R.id.player4Plus)
        p4Plus.setOnClickListener {
            operate(4,1)
        }
    }
}
