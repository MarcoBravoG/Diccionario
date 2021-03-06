package etnolengua.diccionario;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewJL extends AppCompatActivity {
    ListView lst;
    String espJL[] = {"jícara", "jícara para servir caldo", "jonote (árbol)", "juego", "juez", "juguete", "Julio ", "juntos", "labios", "labrado", "ladrillo", "ladrón", "lagartija", "las últimas", "lava", "lejos", "lengua", "leña", "levántalo", "levantarse", "limite", "listón", "llave", "llega", "lleno/", "llora", "llorona", "llovizna", "llueve", "lluvia", "lo dispararon", "lo mandaron", "lo mismo", "loco", "lodo", "loma", "lucero de la mañana", "luego", "lugar para bañarse", "lugar", "luna"};
    String mixeJL[] = {"tsim", "jee'p", "pa'ants", "ëyëë", "konk", "iik", "julië", "muiky", "ateem", "tsetsy", "muutsy", "metspë", "tik", "jakoyë", "puj", "jakuem", "toots", "ja'aw", "konë'ëk", "pëtëëk", "tsepaant", "kuu't", "awaats", "ja'p", "kuxyë", "jëëpy", "ayaaxy", "tsatyuu", "tuup", "tuu", "tujë", "kejkë", "janëyë", "kuiin", "moonts", "tun", "jaxyëëm", "jatyi", "tsitaak", "it", "po'o"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_jl);
        lst = findViewById(R.id.listviewJL);
        final CustomListview CustomLV = new CustomListview(this, espJL, mixeJL);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espJL[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espJL[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
        lst.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",mixeJL[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+mixeJL[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),mixeesp.class);
                startActivity(intent);
                return false;
            }
        });
    }
}