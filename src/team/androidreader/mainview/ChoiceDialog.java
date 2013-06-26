package team.androidreader.mainview;

import team.androidreader.mail.SelectedMailActicity;
import team.top.activity.R;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiceDialog extends Dialog {

	private Button sendBymail;
	private Button copy;
	private Button rename;

	public ChoiceDialog(Context context) {
		super(context);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_choice);
		init();
	}

	private void init() {
		sendBymail = (Button) findViewById(R.id.send);
		copy = (Button) findViewById(R.id.copy);
		rename = (Button) findViewById(R.id.rename);
		sendBymail.setOnClickListener(new BtnListener());
		rename.setOnClickListener(new BtnListener());
		copy.setOnClickListener(new BtnListener());
	}

	class BtnListener implements android.view.View.OnClickListener {

		@Override
		public void onClick(View v) {
			int id = v.getId();
			switch (id) {
			case R.id.send:
				Intent intent = new Intent();
				intent.setClass(getContext(), SelectedMailActicity.class);
				getContext().startActivity(intent);
				break;
			case R.id.copy:
				break;
			case R.id.rename:
				break;
			default:
				break;
			}
		}

	}
}
