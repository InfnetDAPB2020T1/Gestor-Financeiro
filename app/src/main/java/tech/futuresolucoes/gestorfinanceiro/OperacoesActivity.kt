package tech.futuresolucoes.gestorfinanceiro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_operacoes.*

class OperacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacoes)
        btn_nav_operacoes.setupWithNavController(findNavController(R.id.fragment_ops))
    }

    override fun onBackPressed() {
        finish()
    }
}
