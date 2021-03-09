package com.agustinbergomi.kotlin1_08_03_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var q: Question = Question()
    q.Answer = "42"
//    q.Question = ""

        q.display()
        println("The answer to the question is ${q.Question} is ${q.Answer}")

        if(q.Answer == q.CorrectAnswer) {
            println("You were correct")
        } else {
            println("Try again")
        }

    }

        class Question{
            var Answer: String = ""
            val CorrectAnswer = "42"
            val Question: String = "What is the anwser to life the universe and everything?"

            fun display(){
                println("You said $Answer")
            }
        }
    }
