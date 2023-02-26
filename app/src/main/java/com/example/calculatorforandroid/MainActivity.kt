package com.example.calculatorforandroid
import java.util.Stack
import java.util.Vector
import com.example.calculatorforandroid.databinding.ActivityMainBinding



import android.content.Intent
import android.hardware.biometrics.BiometricManager.Strings
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    companion object {
        val MY_MESSAGE_KEY = "my-key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root

        setContentView(view)
        val operations: String = "+-÷×,"
        var nonzerocheck: Int = 0
        var commachecker: Int = 0
        binding.backspace.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            if (ans != ""){
                binding.ResultField.text = ans.substring(0, ans.length-1)
            }


        }
        binding.btn0.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            val ch: Boolean

            if (ans != ""){
                var temp = ans.replace("0","")
                ch = operations.contains(ans[ans.length-1]) ||
                        !(temp != "" && operations.contains(temp[temp.length-1]) &&
                                temp.length != ans.length && temp[temp.length-1] != ',')



            }
            else{
                ch = true
            }

            if ((ch || (ans != "" && ans[ans.length-1] == ',')) && ans != "0"){
                binding.ResultField.text = ans + "0"
            }
            else if (ans == ""){
                binding.ResultField.text = "0"
            }


        }
        binding.btn1.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "1"
            }
            else {
                if (ans != "0"){
                    binding.ResultField.text = ans + "1"
                }
                else{
                    binding.ResultField.text = "1"
                }
            }


        }
        binding.btn2.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "2"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "2"
                }
                else{
                    binding.ResultField.text = "2"
                }
            }

        }
        binding.btn3.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "3"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "3"
                }
                else{
                    binding.ResultField.text = "3"
                }
            }


        }
        binding.btn4.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "4"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "4"
                }
                else{
                    binding.ResultField.text = "4"
                }
            }


        }
        binding.btn5.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "5"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "5"
                }
                else{
                    binding.ResultField.text = "5"
                }
            }


        }
        binding.btn6.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "6"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "6"
                }
                else{
                    binding.ResultField.text = "6"
                }
            }


        }
        binding.btn7.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "7"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "7"
                }
                else{
                    binding.ResultField.text = "7"
                }
            }


        }
        binding.btn8.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "8"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "8"
                }
                else{
                    binding.ResultField.text = "8"
                }
            }


        }
        binding.btn9.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var checker: Boolean = false
            if (ans.length >= 2){
                checker = operations.contains(ans[ans.length-2]) &&
                        ans[ans.length-1] == '0' && ans[ans.length-2] != ','
            }
            if (checker){
                binding.ResultField.text = ans.substring(0, ans.length-1) + "9"
            }
            else{
                if (ans != "0"){
                    binding.ResultField.text = ans + "9"
                }
                else{
                    binding.ResultField.text = "9"
                }
            }


        }

        binding.comma.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            var check1: Boolean
            var check2: Boolean = true
            var iterate: Int = ans.length-1
            if (ans != ""){
                check1 = operations.contains(ans[ans.length-1])
                while (iterate >= 0){
                    if ("+-÷×".contains(ans[iterate])){
                        break
                    }
                    else if (ans[iterate] == ','){
                        check2 = false
                        break
                    }
                    iterate -= 1
                }
            }
            else{
                check1 = true
            }
            if (ans != "" && !(check1) && check2) {
                binding.ResultField.text = ans + ","
            }
        }

        binding.plus.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            val check: Boolean
            if (ans != ""){
                if (ans.length >= 2 && ans[ans.length-1]=='-'&&
                        "+-×÷".contains(ans[ans.length-2])){
                    check = true
                    binding.ResultField.text = ans.substring(0, ans.length-2) + "+"
                }
                else{
                    check = operations.contains(ans[ans.length-1])
                    if (check && ans[ans.length-1] != ',' && ans.length != 1){

                        binding.ResultField.text = ans.substring(0, ans.length-1) + "+"
                    }
                }

            }
            else{
                check = true
            }
            if (ans != "" && (!(check) || ans[ans.length-1] == ',')){
                binding.ResultField.text = ans + "+"
            }

        }
        binding.minus.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            val check: Boolean
            if (ans != ""){

                check = (ans[ans.length-1] == '+' || ans[ans.length-1] == '-')
                if (check && ans[ans.length-1] != ',' && ans.length != 1){

                    binding.ResultField.text = ans.substring(0, ans.length-1) + "-"
                }
            }
            else{
                check = true
            }
            if (ans != "" && (!(check) || ans[ans.length-1] == ',') ||
                    ans==""){
                binding.ResultField.text = ans + "-"

            }
        }
        binding.multiply.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            val check: Boolean
            if (ans != ""){
                if (ans.length >= 2 && ans[ans.length-1]=='-'&&
                    "+-×÷".contains(ans[ans.length-2])){
                    check = true
                    binding.ResultField.text = ans.substring(0, ans.length-2) + "×"
                }
                else{
                    check = operations.contains(ans[ans.length-1])
                    if (check && ans[ans.length-1] != ',' && ans.length != 1){

                        binding.ResultField.text = ans.substring(0, ans.length-1) + "×"
                    }
                }

            }
            else{
                check = true
            }
            if (ans != "" && (!(check) || ans[ans.length-1] == ',')){
                binding.ResultField.text = ans + "×"
            }
        }

        binding.divide.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            val check: Boolean
            if (ans != ""){
                if (ans.length >= 2 && ans[ans.length-1]=='-'&&
                    "+-×÷".contains(ans[ans.length-2])){
                    check = true
                    binding.ResultField.text = ans.substring(0, ans.length-2) + "÷"
                }
                else{
                    check = operations.contains(ans[ans.length-1])
                    if (check && ans[ans.length-1] != ',' && ans.length != 1){

                        binding.ResultField.text = ans.substring(0, ans.length-1) + "÷"
                    }
                }

            }
            else{
                check = true
            }
            if (ans != "" && (!(check) || ans[ans.length-1] == ',')){
                binding.ResultField.text = ans + "÷"
            }
        }

        binding.erase.setOnClickListener{
            binding.ResultField.text = ""
        }

        binding.percent.setOnClickListener{
            val ans = binding.ResultField.text.toString()
            val check: Boolean
            if (ans != ""){
                if (ans.length >= 2 && ans[ans.length-1]=='-'&&
                    "+-×÷".contains(ans[ans.length-2])){
                    check = true

                }
                else{
                    check = operations.contains(ans[ans.length-1])

                }

            }
            else{
                check = true
            }
            if (ans != "" && (!(check) || ans[ans.length-1] == ',')){
                binding.ResultField.text = ans + "%"
            }
        }


        binding.plusminus.setOnClickListener {
            val ans = binding.ResultField.text.toString()

            if (ans != ""){
                var Pointer: Int = ans.length-1

                while (Pointer > 0 && !"+-×÷".contains(ans[Pointer])){
                    Pointer -= 1
                }

                if (Pointer != ans.length-1 && Pointer >= 0){
                    if (ans[Pointer] == '-'){
                        if (Pointer > 0 && ("×÷".contains(ans[Pointer-1]))){
                            binding.ResultField.text = ans.substring(0, Pointer)+ans.substring(Pointer+1, ans.length)
                        }
                        else{
                            if (Pointer == 0){
                                binding.ResultField.text = ans.substring(1, ans.length)
                            }
                            else{
                                binding.ResultField.text = ans.substring(0, Pointer) + "+" + ans.substring(Pointer+1, ans.length)
                            }

                        }
                    }
                    else if ("+".contains(ans[Pointer])){
                        binding.ResultField.text = ans.substring(0, Pointer) + "-" + ans.substring(Pointer+1, ans.length)
                    }
                    else if ("×÷".contains(ans[Pointer])){
                        binding.ResultField.text = ans.substring(0, Pointer+1)+ "-" + ans.substring(Pointer+1, ans.length)
                    }
                    else if (!"+-×÷".contains(ans[Pointer])){
                        binding.ResultField.text = "-" + ans
                    }
                }
                else if (!"+-×÷".contains(ans[Pointer])){
                    binding.ResultField.text = "-" + ans
                }
                else if (ans[Pointer] == '-'){
                    if (Pointer > 0 && ("×÷".contains(ans[Pointer-1]))){
                        binding.ResultField.text = ans.substring(0, ans.length-1)
                    }
                    else{
                        if (Pointer == 0){
                            binding.ResultField.text = ans.substring(0, ans.length-1)
                        }
                        else{
                            binding.ResultField.text = ans.substring(0, ans.length-1) + "+"
                        }
                    }

                }
                else if (ans[Pointer] == '+'){
                    binding.ResultField.text = ans.substring(0, ans.length-1) + "-"
                }
                else if ("×÷".contains(ans[Pointer])){
                    binding.ResultField.text = ans + "-"
                }
            }
            else{
                binding.ResultField.text = "-"
            }

        }





        binding.equal.setOnClickListener{
            var ans = binding.ResultField.text.toString()
            var spltd = Vector<String>()
            var savedversion = Vector<String>()
            var temp: List<String>
            var postfix = Vector<String>()
            if (ans != ""){

                while (operations.contains(ans[ans.length-1])){
                    ans = ans.substring(0, ans.length-1)
                }

                for (elem in "+×÷"){
                    ans = ans.replace(elem.toString(), " $elem ")

                }
                temp = ans.split(' ')

                for (element in temp){
                    if (element.length >= 3){
                        if (element[0] == '-'){
                            var it: Int = 1
                            while (it < element.length && !"+-×÷".contains(element[it])){
                                it += 1
                            }
                            spltd.add(element.substring(0,it))
                            for (x in element.substring(it, element.length).replace("-", " - ").split(' ')){
                                if (x != " " && x != ""){
                                    spltd.add(x)
                                }
                            }
                        }
                        else{
                            spltd.addAll(element.replace("-", " - ").split(' '))
                        }
                    }
                    else{
                        spltd.add(element)
                    }
                }
                println(spltd.toString())

                for (value in spltd){
                    var tmp: String = value
                    var new: String = ""
                    if (tmp.contains('%')){
                        for (ind in 0..tmp.length-2){
                            if (tmp[ind] != '%'){
                                new += tmp[ind]
                            }
                            else{
                                if (tmp[ind+1] == '%'){
                                    new += "%1"
                                }
                                else{
                                    new += "%"
                                }
                            }
                        }
                        if (tmp[tmp.length-1] == '%'){
                            new += "%1"
                        }
                        else{
                            new += tmp[tmp.length-1]
                        }
                        for (x in new.replace("%", " % ").split(' ')) {
                            if (x != " " && x != "") {
                                savedversion.add(x)
                            }
                        }
                    }
                    else{
                        savedversion.add(tmp)
                    }
                }
                spltd = savedversion
                println(spltd.toString())
                var st = Stack<String>()



                for (expr in spltd){
                    if (!"+-×÷%".contains(expr)){

                        var t: String = expr
                        if (expr[expr.length-1] == ','){
                            t = expr.substring(0, expr.length-1)
                        }
                        if (expr.contains(',')){
                            t = expr.replace(',','.')
                        }
                        println(t.contains(','))
                        postfix.add(t)
                    }
                    else{
                        while (!st.isEmpty() && ("+-".contains(expr) && "×÷%".contains(st.peek())||
                                    "+-".contains(expr) && "+-".contains(st.peek()) ||
                                    "×÷%".contains(expr) && "×÷%".contains(st.peek()))){
                            postfix.add(st.pop())
                        }

                        st.add(expr)
                    }
                }
                while (!st.isEmpty()){
                    postfix.add(st.pop())
                }
                var flag: Boolean = true
                var res = Stack<String>()
                for (elem in postfix){
                    if (!"+-×÷%".contains(elem)){
                        if (elem == "-0" || elem.toDouble()-0.0 == 0.0){
                            res.add("0")
                        }
                        else{
                            res.add(elem)
                        }

                    }
                    else{
                        var f: String = res.pop()
                        var s: String = res.pop()

                        if (elem == "+"){
                            res.push((f.toDouble() + s.toDouble()).toString())
                        }
                        if (elem == "-"){
                            res.push((s.toDouble() - f.toDouble()).toString())
                        }
                        if (elem == "×"){
                            res.push((f.toDouble() * s.toDouble()).toString())
                        }
                        if (elem == "%"){
                            res.push((s.toDouble()*f.toDouble()/100.0).toString())
                        }
                        if (elem == "÷"){
                            if (f == "0" || f == "-0"){
                                binding.ResultField.text = "Error"
                                flag = false
                                break
                            }
                            res.push((s.toDouble() / f.toDouble()).toString())
                        }
                    }
                }
                if (flag){
                    binding.ResultField.text = res.pop().replace('.',',')
                }

            }

        }







}
}