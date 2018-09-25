package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewD extends AppCompatActivity {
    ListView lst;
    String espD[] = {"dale", "daño", "dedo", "dejado", "delgado", "delicado", "demonio", "derecho", "derrumbar", "desatado", "descalzo", "descansa", "descompuesto", "descuarizar", "desgracia", "desminuyendo", "desnudarse", "desnudo", "despierta", "desprecia", "desprecio", "despulpa", "destapado", "destinado", "desyerbado", "deuda", "diablo", "diente", "dieza", "diferente", "difícil", "dile", "dinamita", "dinero", "dinero", "dinero ", "disgustado", "doblar", "donde", "dónde", "dos", "duele", "dueño", "duerme", "duerme", "duérmete", "dulce", "dura", "durable", "durmiendo", "duro", "duró","dando vuelta", "de memoria", "de pico amarillo", "del mismo pueblo", "del otro lado", "desde entonces", "doblar ropa", "dolor de cabeza"};
    String mixeD[] = {"mo'ow", "katyeey", "këwa'ax", "ixmatsy", "pejy", "amaay", "kaoypia", "teye", "jits", "kejy", "teikwaats", "pokx", "maat", "e'ek", "ayoony", "aweenëëy'py", "jen", "axwa'ats", "mayuik", "pej'xp", "apejkp", "jet", "kuwa'ats", "nipetakëey", "mootsy", "nukxy", "mëjkuu", "tëëts", "majk", "tekatsy", "tsip", "nëma'a", "nëtujt", "meeny", "men", "menkiop", "ejkëp", "ots", "maa", "maa", "metsk", "pa'amp", "nijaay", "maaj", "maap", "maaw", "pa'ak", "ijp", "jejp", "maap", "juuny", "jejk", "awëtijp", "akupajp", "apu'ts", "mëkukajp", "awiim", "jajty", "ane'ek", "kupoj"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_d);
        lst = findViewById(R.id.listviewD);
        final CustomListview CustomLV = new CustomListview(this, espD, mixeD);
        lst.setAdapter(CustomLV);
    }
}