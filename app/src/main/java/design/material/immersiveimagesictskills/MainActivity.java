package design.material.immersiveimagesictskills;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

  RadioButton centerBtn;
  RadioButton fitEndBtn;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    centerBtn = (RadioButton) findViewById(R.id.centerBtn);
    fitEndBtn = (RadioButton) findViewById(R.id.fitEndBtn);

    centerBtn.setOnClickListener(this);
    fitEndBtn.setOnClickListener(this);

    centerBtn.setChecked(true);

  }

  /**
   * Obtain reference to selected button
   * @param view The most recently clicked radio button.
   * @return The clicked radio button if different to parameter view.
   */
  public RadioButton getSelectedRadio(View view) {
    RadioButton[] btns = {centerBtn, fitEndBtn};
    for (RadioButton radioButton : btns) {
      if (radioButton.isChecked() && radioButton != view) {
        return radioButton;
      }
    }
    return null;
  }

  @Override
  public void onClick(View view) {

    // Determine if a radio button clicked and implement handler
    RadioButton checkedRadio = view instanceof RadioButton ? getSelectedRadio(view) : null;
    if (checkedRadio != null) {
      // Untick all buttons except currently selected.
      if (checkedRadio != view) {
        checkedRadio.setChecked(false);
      }
      String radioId = ((RadioButton) view).getText().toString();
      switch (radioId) {
        case "CENTER":
          Toast.makeText(this, "Button CENTER selected", Toast.LENGTH_SHORT).show();
          break;
        case "FIT_END":
          Toast.makeText(this, "Button FIT_END selected", Toast.LENGTH_SHORT).show();
          break;
      }
    }
    else {
      // Other view handlers
    }
  }
}
