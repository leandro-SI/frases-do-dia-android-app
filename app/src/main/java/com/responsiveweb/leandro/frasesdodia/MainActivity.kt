package com.responsiveweb.leandro.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    // lateinit permite inicializar uma variável depois
    lateinit var texto: TextView
    val frases = arrayOf(
            "O importante não é vencer os dias, mas lutar sempre.",
            "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
            "É melhor conquistar a si mesmo do que vencer mil batalhas.",
            "Enquanto houver vontade de lutar haverá esperança de vencer.",
            "Sua luta não termina quando sintir cansaço, mais sim quando atingir o sucesso tão merecido.",
            "A motivação não acontece por acaso, como tudo na vida voçe tem de batalhar para alcançar.",
            "Há dias que você tem que ir para a frente só com o que você tem na mão, não dá para esperar pela motivação.",
            "A vida tanto lhe pode dar o melhor como o pior, mas é você quem escolhe aquilo que vai permanecer ou ficar para trás.",
            "Às vezes um pouco de motivação ajuda a superar os maiores desafios.",
            "Assim como os pássaros, precisamos aprender a superar os desafios que nos são apresentados, para alçarmos voos mais altos. ",
            "Nunca é tarde demais para ser aquilo que sempre desejou ser. ",
            "Quando fazemos da união nossa principal arma na luta por um objetivo comum, vencer é uma tarefa que se torna bem mais fácil."

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase)
    }

    fun gerarFrase(view: View){

        var totalItensArray: Int = frases.size;
        val numero = Random().nextInt(totalItensArray);
        texto.setText(frases[numero]);

    }
}
