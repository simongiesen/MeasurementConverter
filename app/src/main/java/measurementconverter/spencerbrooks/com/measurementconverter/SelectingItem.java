package measurementconverter.spencerbrooks.com.measurementconverter;

/**
 * Created by SpencerBrooks on 7/2/15.
 */
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class SelectingItem implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
        Toast.makeText(parent.getContext(),
                "Selecting Item : " + parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}