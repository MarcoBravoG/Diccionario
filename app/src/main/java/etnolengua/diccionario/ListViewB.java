package etnolengua.diccionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewB extends AppCompatActivity {
    ListView lst;
    String espB[]={"babea", "baila", "bailando", "bailar", "baja", "banco", "bañando", "báñate", "barato", "barato", "barba canosa", "barriendo", "barriga", "barrigon", "barro", "bastante", "bastante", "bastón", "baúl", "bebé", "criatura", "infante", "bejuco", "bendecido", "bestia", "blanco", "boa", "venado", "boca", "boca", "boca gorda", "boca roja", "boca sucia", "bonita", "bordado", "borracho", "borracha", "bravo", "brazo fuerte", "brinca", "burlado", "buscalo", "buscarlo"};
    String mixeB[]={"awaay", "ets", "ejtsp", "ajtsp", "mënak", "konyt", "tsiip", "tsiiw", "kuka'ay", "kumënaik", "apoo", "peetp", "mox", "moxtsaam", "puj", "amay", "may", "tajk", "kaax", "maxuunk", "maxuunk", "maxuunk", "aats", "kunuukx", "jëyujk", "poop", "jatsyu'u", "jatsyu'u", "aaw", "awak", "atsaam", "atsap'ts", "akootsy", "tsuj", "pëjxuy", "amuukyë", "amuukyë", "awa'an", "tsinuuk", "tëpx", "nixiiki", "ixta'w", "axtaaw"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_b);
        lst =findViewById(R.id.listviewB);
        final CustomListview CustomLV = new CustomListview(this,espB,mixeB);
        lst.setAdapter(CustomLV);
    }
}
