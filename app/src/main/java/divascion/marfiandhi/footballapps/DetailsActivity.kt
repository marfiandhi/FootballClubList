package divascion.marfiandhi.footballapps

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import org.jetbrains.anko.*

/**
 * Created by Marfiandhi on 9/3/2018.
 */
class DetailsActivity : AppCompatActivity() {

    private var detail: String = ""
    private var name: String = ""
    private var image: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        detail = intent.getStringExtra("detail")
        name = intent.getStringExtra("name")
        image = intent.getStringExtra("image").toInt()
        DetailsActivityUI().setContentView(this)
    }

    inner class DetailsActivityUI: AnkoComponent<DetailsActivity>{

        override fun createView(ui: AnkoContext<DetailsActivity>) = with(ui){

            verticalLayout {
                padding = dip(16)

                imageView(image).lparams{
                    height = dip(120)
                    width = dip(120)
                    margin = dip(8)
                    gravity = Gravity.CENTER_HORIZONTAL
                }

                textView(name){
                    textSize = 24f
                }.lparams{
                    width = wrapContent
                    height = wrapContent
                    margin = dip(4)
                    gravity = Gravity.CENTER_HORIZONTAL
                }

                textView(detail){
                    textAlignment = View.TEXT_ALIGNMENT_CENTER
                }.lparams{
                    width = wrapContent
                    height = wrapContent
                    margin = dip(8)
                }
            }
        }
    }
}