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

public class ListViewE extends AppCompatActivity {
    ListView lst;
    String espE[] = {"educado", "ellos", "embarazada", "empezando", "en el municipio", "en la milpa", "en pareja", "en silencio", "encargar", "encuentralo", "endredón", "enemigo", "enfermedad", "enmascarado", "enojado", "enrolla", "entero/entera", "enterrado", "entre diez", "entre todos", "entre varios", "envíalo", "envolver", "envuelto", "envuelvelo", "epazote", "escalera", "escandaliza", "escoba", "escopeta", "escuela", "espalda", "espejo", "espera", "espera", "espera", "espero", "espina", "espíritu", "está comiendo", "está sucediendo", "estaca", "estar cargando", "estar enfermo", "este", "estrecho", "estrella", "estudiando", "evaporando", "excremento", "echar alguna cosa con la mano", "experto sobre la lectura del calendario Mixe"};
    String mixeE[] = {"axpëky", "ajkxy", "jaaotyp", "tsontaakp", "akujk", "kamjoit", "ametsk", "ametsy", "aneem", "paat", "axuk", "mëtsip", "pa'am", "aptoot", "jotma'p", "pit", "amuum", "tajë'y", "nëmajk", "nikëxy", "nëmaay", "kex", "amots", "motsy", "nëmots", "puteeit", "teeny", "amayeepy", "peetk", "tuktk", "kapxoyëyë", "jëëxk", "ijty", "aix", "awix", "jaix", "ki'xk", "apty", "jewe'ny", "kaapy", "jajtëp", "kup", "tëëmp", "pëkëp", "ata", "axuuts", "mëtsaa", "ixpeky", "ajojp", "të'ëny", "awokëëw", "kuxëë"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_e);
        lst = findViewById(R.id.listviewE);
        final CustomListview CustomLV = new CustomListview(this, espE, mixeE);
        lst.setAdapter(CustomLV);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",espE[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+espE[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent inteent= new Intent(getApplicationContext(),Traductor.class);
                startActivity(inteent);
            }
        });
        lst.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData CD = ClipData.newPlainText("SOURCE TEXT",mixeE[position]);
                cm.setPrimaryClip(CD);
                Toast.makeText(getApplicationContext(),"se ha copiado "+mixeE[position]+" correctamente",Toast.LENGTH_LONG).show();
                Intent intent= new Intent(getApplicationContext(),mixeesp.class);
                startActivity(intent);
                return false;
            }
        });
    }
}
