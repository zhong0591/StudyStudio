package seth.android.studystudio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Zhong on 2018/8/1.
 */
public class ProfileActivity extends Activity {
    private TextView name;
    private TextView location;
    private TextView website;
    private TextView onlineStatus;
    private EditText description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_example);
        name = (TextView) findViewById(R.id.name);
        location = (TextView) findViewById(R.id.location);
        website = (TextView) findViewById(R.id.website);
        onlineStatus = (TextView) findViewById(R.id.online_status);
        description = (EditText) findViewById(R.id.description);
        View parent = (View) name.getParent();
        parent.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
        name.setTextAppearance(this,android.R.style.TextAppearance_DeviceDefault_Large);
        location.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Medium);
        location.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Inverse);
        website.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Inverse);
        onlineStatus.setTextAppearance(this, android.R.style.TextAppearance_DeviceDefault_Inverse);
        description.setEnabled(false);
        description.setBackgroundColor(getResources().getColor(android.R.color.white));
        description.setTextColor(getResources().getColor(android.R.color.black));
    }
}